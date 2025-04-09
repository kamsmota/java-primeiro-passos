import java.util.Scanner;

public class Ponderada
{
    public static void main(String[] args){
        float n1, n2, media;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        n1 = entrada.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        n2 = entrada.nextFloat();
        
        media = (((n1/10)*6) + ((n2 /10)*4));
        
        System.out.print("Sua média é " + media);
        
    }
}
