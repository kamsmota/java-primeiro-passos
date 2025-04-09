import java.util.Scanner;

public class Trabalho {
    public static void main(String[] args){
        float valor;
        int uteis, horas;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de horas que você trabalha por dia: ");
        horas = entrada.nextInt();
        
        System.out.print("Agora digite o quanto você recebe por hora trabalhada: ");
        valor = entrada.nextFloat();
        
        int total_horas = ((horas * 5) * 4); // 5 dias uteis, 4 semanas no mês
        float salario = (total_horas * valor);
        
        System.out.printf("Seu salário é " + salario);
    }
}
