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
            peso = sn.nextDouble();

            System.out.print("Digite a sua altura: ");
            altura = sn.nextDouble();
            sn.nextLine();
            sn.close();

            if (peso <= 0 || altura <= 0) {
                System.out.println("Valores inválidos!");
                return;
            }
        } catch (Exception e) {
            System.out.println("Valores inválidos!");
            return;
        }

        double media = (peso / (altura * altura));
        System.out.print("\033[H\033[2J");
        switch(genero){
            case 'M':
                if (media>=40){
                    classificacao ="Obesidade mórbida.";
                    break;
                } else if(media>=30){
                    classificacao="Obesidade moderada.";
                    break;
                } else if(media>=25){
                    classificacao="Obesidade leve.";
                    break;
                }else if(media>=20){
                    classificacao="Normal.";
                    break;
                }
                else{classificacao="Abaixo do normal";
                break;
                }
                
        
            case 'F', 'N':
                if (media>=39){
                    classificacao ="Obesidade mórbida.";
                    break;
                } else if(media>=29){
                    classificacao="Obesidade moderada.";
                    break;
                }else if(media>=24){
                    classificacao="Obesidade leve.";
                    break;
                }else if(media>=19){
                    classificacao="Normal.";
                    break;
                }
                else{classificacao="Abaixo do normal";
                break;
            }
           }

        System.out.printf("Nome:%s\nGenero:%c\nIMC:%.2f\nClassificação:%s", nome, genero, media, classificacao);
    }
}