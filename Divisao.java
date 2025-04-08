import java.util.Scanner;

public class Divisao {
    public static void main(String[] args){    
    float n1, n2;

    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o dividendo: ");
    n1 = entrada.nextFloat();

    System.out.print("Digite o divisor: ");
    n2 = entrada.nextFloat();

    System.out.printf("A divisão entre os números " + n1 + " e "+ n2 + " é " + (n1/n2));

    }
}
