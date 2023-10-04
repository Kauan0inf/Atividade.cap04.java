import java.util.Scanner;

public class Atividade13 {
    //Faça um programa que receba o preço de um produto, 
    //calcule e mostre, de acordo com as tabelas a seguir, o novo preço e a classificação.
    //Até R$ 50,00 ¨¨ 5
    //Entre R$ 50,00 e R$ 100,00 ¨¨ 10
    //Acima de R$ 100,00 ¨¨ 15
    //Até R$ 80,00 Barato
    //Entre R$ 80,00 e R$ 120,00 (inclusive) ¨¨ Normal
    //Entre R$ 120,00 e R$ 200,00 (inclusive) ¨¨ Caro
    //Maior que R$ 200,00 ¨¨ Muito caro
     public static void main (String[] args) {
        Scanner entrada = new Scanner (System.in);
        double precoP, novoP;
        //Declaração de variáveis
        System.out.print( "Me informe o Valor do Produto: ");
        precoP = entrada.nextDouble();
        //Entrada de dados
        if (precoP <= 50) {
            novoP = precoP * 1.05;
            System.out.println( "O preço do produto será: " + novoP );
            System.out.print( "O preço do produto é Barato");
        } else if ((precoP > 50) && (precoP <= 80)) {
            novoP = precoP * 1.10;
            System.out.println( "O preço do produto será: " + novoP );
            System.out.print( "O preço do produto é Barato");
        } else if ((precoP <= 100) && (precoP < 120)) {
            novoP = precoP * 1.10;
            System.out.println( "O preço do produto será: " + novoP );
             System.out.print( "O preço do produto é Normal");
        } else if ((precoP > 100)  && (precoP >= 120)) {
            novoP = precoP * 1.15;
            System.out.println( "O preço do produto será: " + novoP );
            System.out.print( "O preço do produto é Caro");
        }  else if ((precoP > 100)  && (precoP <= 200)) {
            novoP = precoP * 1.15;
            System.out.println( "O preço do produto será: " + novoP );
            System.out.print( "O preço do produto é Caro");
        } else if ((precoP > 100)  && (precoP > 200)) {
            novoP = precoP * 1.15;
            System.out.println( "O preço do produto será: " + novoP );
            System.out.print( "O preço do produto é Muito Caro" );
        }
        entrada.close();


     }
}
