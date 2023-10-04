import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codProduto;
        double quantComprada, perUni, preTotal, preFinal, desconto, preTotal1, preTotal2, preTotal3;
        //Declaração de variaveis
        System.out.print("Digite o código do produto: ");
        codProduto = entrada.nextInt();
        System.out.print("Digite a quantidade de compras do produto: ");
        quantComprada = entrada.nextDouble();
        //Entrada de dados
         preTotal1 = 10 * quantComprada;
         preTotal2 = 15 * quantComprada;
         preTotal3 = 25 * quantComprada;        
            if (codProduto >= 1 && codProduto <= 10) {
                perUni = 10.0;
                 preTotal = perUni * quantComprada;
                System.out.println("O preço total da sua compra sera: " + preTotal); 
            } else if (codProduto >= 11 && codProduto <= 20) {
                perUni = 15.0;
                preTotal = perUni * quantComprada;
                System.out.println("O preço total da sua compra sera: " + preTotal);
            } else if (codProduto >= 21 && codProduto <= 30) {
                perUni = 25.0;
                preTotal = perUni * quantComprada;
                System.out.println("O preço total da sua compra sera: " + preTotal);
            } else if ((codProduto >= 31) && (codProduto <= 40))  {
                perUni = 30.0;
                preTotal = perUni * quantComprada;
                System.out.println("O preço total da sua compra sera: " + preTotal);
            }         
            if (preTotal1 <= 250 &&  codProduto <= 10 &&  codProduto <= 20 ) {
               desconto = preTotal1 * 1.05;
               preFinal = preTotal1 * 0.05;
               System.out.println("O Desconto da sua compra sera: " + desconto);
               System.out.println("O Preço Final da sua compra sera: " + preFinal);
            } else if (preTotal2 > 250 && preTotal2 <= 500 && codProduto >= 30) {
               desconto = preTotal2 * 1.10;
               preFinal = preTotal2 * 0.10;
               System.out.println("O Desconto da sua compra sera: " + desconto);
               System.out.println("O Preço Final da sua compra sera: " + preFinal);
            } else if (preTotal3 > 500 && codProduto <= 10 &&  codProduto <= 40) {
               desconto = preTotal3 * 1.15;
               preFinal = preTotal3 * 0.15;
               System.out.println("O Desconto da sua compra sera: " + desconto);
               System.out.println("O Preço Final da sua compra sera: " + preFinal);
            } 

        entrada.close();
    }
} 