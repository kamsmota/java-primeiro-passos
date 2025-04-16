import java.util.Scanner;

public class Idade 
{
    public static void main (String[] args)
    {
        int anos, meses, dias;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite os anos inteiros que você tem de idade: ");
        anos = entrada.nextInt();
        
        System.out.print("Digite os meses inteiros que você tem, além dos anos completos: ");
        meses = entrada.nextInt();
        
        System.out.print("Digite os dias, além dos meses e anos completos: ");
        dias = entrada.nextInt();
        
        dias += ((anos * 365) + (meses * 30));
        
        System.out.println("Sua idade em dias é " + dias);
    }
}
