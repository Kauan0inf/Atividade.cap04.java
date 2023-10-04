import java.util.Scanner;

public class Atividade12 {
    //Faça um programa que receba o salário bruto de um funcionário e, 
    //usando a tabela a seguir, calcule e mostre o valor a receber. Sabe-se que este é composto 
    //pelo salário bruto acrescido de gratificação e descontado o imposto de 7% sobre o salário.
    //Até R$ 350,00 ¨¨ R$ 100,00
    //R$ 350,00 ¨¨ R$ 600,00  ¨¨R$ 75,00
    //R$ 600,00 ¨¨ R$ 900,00 ¨¨ R$ 50,00
    //Acima de R$ 900,00 ¨¨ R$ 35,00
    public static void main (String[] args) {
        Scanner entrada = new Scanner (System.in);
        double salarioB, salFinal, impostoSal;
        //Declaração de variáveis
        System.out.print( "Me informe o Valor do Salário Bruto: ");
        salarioB = entrada.nextDouble();
        //Entrada de dados
        impostoSal = salarioB * 0.07;
        //Processamento 
        if (salarioB < 350) {
          salFinal = salarioB + 100 - impostoSal;
          System.out.println("O seu salário final será: " + salFinal);
        } else if ((salarioB > 350) && (salarioB < 600)) {
          salFinal = salarioB + 75 - impostoSal;
          System.out.println("O seu salário final será: " + salFinal);  
        } else if ((salarioB >= 600) && (salarioB <= 900)) {
          salFinal = salarioB + 50 - impostoSal;
          System.out.println("O seu salário final será: " + salFinal); 
        } else if (salarioB > 900) {
          salFinal = salarioB + 35 - impostoSal;
          System.out.println("O seu salário final será: " + salFinal);  
        }
        //Processamento e condicional

        entrada.close();
    }
}
