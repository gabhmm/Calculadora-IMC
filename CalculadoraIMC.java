import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        String classificacao = "";
        String nome;
        char genero;
        double peso;
        double altura;

        try {
            System.out.print("Digite seu Nome: ");
            nome = sn.nextLine();

            System.out.println("Qual é o seu gênero(M: masculino/F: feminino/N: prefiro não dizer)? ");
            genero = sn.nextLine().charAt(0);

            System.out.print("Digite o seu peso: ");
            peso = Math.round(sn.nextDouble());

            System.out.print("Digite a sua altura: ");
            altura = sn.nextDouble();
            sn.close();

            if (peso == 0 || altura == 0) {
                System.out.println("Valores inválidos!");
                return;
            }
        } catch (Exception e) {
            System.out.println("Valores inválidos!");
            return;
        }

        double media = (peso / (altura * altura));
        
        switch (genero) {
            case 'M':
                if (media >= 40) {
                    classificacao = "Obesidade mórbida.";
                    break;
                }
                if (media >= 30 && media <= 39.9) {
                    classificacao = "Obesidade moderada.";
                    break;
                }
                if (media >= 25 && media <= 29.9) {
                    classificacao = "Obesidade leve.";
                    break;
                }
                if (media >= 20 && media <= 24.9) {
                    classificacao = "Normal.";
                    break;
                }
                classificacao = "Abaixo do normal";
                break;

            case 'F', 'N':
                if (media >= 39) {
                    classificacao = "Obesidade mórbida.";
                    break;
                }
                if (media >= 29 && media <= 38.9) {
                    classificacao = "Obesidade moderada.";
                    break;
                }
                if (media >= 24 && media <= 28.9) {
                    classificacao = "Obesidade leve.";
                    break;
                }
                if (media >= 19 && media <= 23.9) {
                    classificacao = "Normal.";
                    break;
                }
                classificacao = "Abaixo do normal";
                break;
        }

        System.out.printf("Nome:%s\nGenero:%c\nIMC:%.2f\nClassificação:%s", nome, genero, media, classificacao);
    }
}