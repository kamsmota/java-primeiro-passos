import java.util.Scanner;

public class Idade {
    public static void main(String[] args){
        int idade;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade em anos: ");
        idade = entrada.nextInt();

        System.out.println("Em vinte anos, sua idade será " + (idade + 20));
    }
}
