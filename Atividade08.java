import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, novoSalario;

        System.out.print("Informe seu salário: ");
        salario = entrada.nextDouble();

        if (salario <= 300) {
            novoSalario = salario * 1.35;// salario + (salario * 35/100)
        } else {
            novoSalario = salario * 1.15;
        }

        System.out.println("Novo salário: R$ " + novoSalario);

        entrada.close();

    }
}