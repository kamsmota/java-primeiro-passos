import java.util.Scanner;
public class Temperatura {
    public static void main(String args[]) {
        double f, c;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        f = entrada.nextDouble();
        c = (f - 32) * (5.0 / 9.0);
        
        System.out.printf("A temperatura Celsius é: %.2f", c);
    }
}

