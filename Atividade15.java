import java.util.Scanner;

public class Atividade15 {

    public static void main (String[] args) {
        Scanner entrada = new Scanner (System.in);
        double valorInv, valorM;
        int inv;
        //Declaração de variáveis
        System.out.print( "Me informe o Valor investido: ");
        valorInv = entrada.nextDouble();
        System.out.print( "Me informe o numero do Investimento: ");
        inv = entrada.nextInt();
        if (inv == 1) {
            valorM = valorInv * 1.03;
            System.out.print( "O valor investido apos um mês será: " + valorM);
        } else if (inv == 2) {
            valorM = valorInv * 1.04;
            System.out.print( "O valor investido apos um mês será: " + valorM);

        } else if (inv > 2) {
            System.out.print( "O numero é invalido");
        }


        entrada.close();

        
        
    }
    
}
