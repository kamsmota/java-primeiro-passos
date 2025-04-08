import java.util.Scanner; //calculo do total a ser pago por cada peça solicitada

public class Mecanica 
{
    public static void main(String[] args){
        int codigo, qtd;
        float valor, total;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o código da peça: ");
        codigo = entrada.nextInt();

        System.out.print("Digite a quantidade de peças: ");
        qtd = entrada.nextInt();

        System.out.print("Digite o valor de uma unidade dessa peça: ");
        valor = entrada.nextFloat();

        total = valor * qtd;

        System.out.printf("O valor total a ser pago pela peça " + codigo + " é " + total);


    }
}
