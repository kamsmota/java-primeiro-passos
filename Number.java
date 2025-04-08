import java.util.Scanner;

public class Number //ler e imprimir o número
{
    public static void main(String[] args){
        int number;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        number = entrada.nextInt();

        System.out.println("O número digitado foi " + number);

        Quadrado.multiplicar(number);
    }
}       


// calculo do quadrado do numero digitado anteriormente
class Quadrado {
    static void multiplicar (int number){
       int quadrado = number * number;

       System.out.println("O quadrado do número digitado é " + quadrado);
    }
}