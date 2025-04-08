import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        float n1, n2, n3, media;
        String conclusao = "";

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        n1 = entrada.nextFloat();

        System.out.print("Digite a segunda nota: ");
        n2 = entrada.nextFloat();

        System.out.print("Digite a terceira nota: ");
        n3 = entrada.nextFloat();

        media = ((n1 + n2 + n3)/3);

        if (media >= 6){
            conclusao = "aprovado";
        }
        else if (media >= 4 && media < 6){
            conclusao = "em recuperação";
            }
        else {
            conclusao = "reprovado";
            }
            System.out.println("A média aritmédica das três notas é " + media + ". Sendo assim, o aluno está " + conclusao);
        }
        
    }

