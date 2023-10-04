import java.util.Scanner;

public class Atividade11 {
     //Faça um programa que receba o salário atual de um funcionário e, usando a tabela a seguir, 
     //calcule e mostre o valor do aumento e o novo salário.
     //Até R$ 300,00 ¨¨ 15%
     //R$ 300,00 ¨¨ R$ 600,00 ¨¨ 10%
     //R$ 600,00 ¨¨ R$ 900,00 ¨¨ 5%
     //Acima de R$ 900,00 ¨¨ 0%
      
    public static void main (String[] args) {
        Scanner entrada = new Scanner (System.in);
        double salarioA, novoSal, aumentoSal;
        //Declaração de variáveis
        System.out.print( "Me informe o Valor do Salário: ");
        salarioA = entrada.nextDouble();
        //Entrada de dados
        if (salarioA <= 300) {
            aumentoSal = salarioA * 0.15;
            System.out.println( "O aumento no seu Salário será: " + aumentoSal );
            novoSal = aumentoSal + salarioA;
            System.out.print( "O seu Salário será: " + novoSal );
          } else if ((salarioA > 300) && (salarioA < 600)) {
            aumentoSal = salarioA * 0.10;
            System.out.println( "O aumento no seu Salário será: " + aumentoSal );
            novoSal = aumentoSal + salarioA;
            System.out.print( "O seu Salário será: " + novoSal );
          } else if ((salarioA >= 600) && (salarioA <= 900)) {
            aumentoSal = salarioA * 0.05;
            System.out.println( "O aumento no seu Salário será: " + aumentoSal );
            novoSal = aumentoSal + salarioA;
            System.out.print( "O seu Salário será: " + novoSal );
          } else if (salarioA > 900) { 
            novoSal = salarioA;
            System.out.println( "O seu Salário será: " + novoSal );
            System.out.print( "Não tera Direito a aumento! " );
          }
        //Processamento e condicionais

        entrada.close();
    }

    
}
