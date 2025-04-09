import java.util.Scanner;

public class Troca
{
    public static void main(String[] args){
        int a, b, c;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero inteiro: ");
        a = entrada.nextInt();
        
        System.out.print("Digite o segundo numero inteiro: ");
        b = entrada.nextInt();
        
        c = a;
        a = b;
        b = c;
        
        System.out.println("Os numeros digitados foram, respectivamente, "+ a + " e " + b);
    }
}
