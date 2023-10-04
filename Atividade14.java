import java.util.Scanner;

public class Atividade14 {

    public static void main (String[] args) {
        Scanner entrada = new Scanner (System.in);
        double salarioA, novoSal;
        //Declaração de variáveis
        System.out.print( "Me informe o Valor do Salário: ");
        salarioA = entrada.nextDouble();
        //Entrada de dados
        if (salarioA <= 300) {
            novoSal = salarioA * 1.50;
            System.out.print( "O seu Salário será: " + novoSal );
          } else if ((salarioA > 300) && (salarioA <= 500)) {
            novoSal = salarioA * 1.40;
            System.out.print( "O seu Salário será: " + novoSal );
          } else if ((salarioA > 500) && (salarioA <= 700)) {
            novoSal = salarioA * 1.30;
            System.out.print( "O seu Salário será: " + novoSal );
          } else if ((salarioA > 700) && (salarioA <= 800)){ 
            novoSal = salarioA * 1.20;
            System.out.println( "O seu Salário será: " + novoSal );
          }  else if ((salarioA > 800) && (salarioA <= 1000)){ 
            novoSal = salarioA * 1.10;
            System.out.println( "O seu Salário será: " + novoSal );
          }  else if (salarioA > 1000){ 
            novoSal = salarioA * 1.05;
            System.out.println( "O seu Salário será: " + novoSal );
          }
        //Processamento e condicionais

        entrada.close();
    }

    
}

