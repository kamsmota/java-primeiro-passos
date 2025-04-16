import java.util.Scanner;

public class Salario
{
    public static void main (String[] args)
    {
        double saldo;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite seu saldo: ");
        saldo = entrada.nextInt();
        
        saldo = (saldo * 1.01);
        
        System.out.println("Seu saldo, após o reajuste de 1%, é " + saldo);
    }
}
