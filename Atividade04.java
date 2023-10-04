import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2,num3;
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextDouble();
        System.out.print("Digite o terceiro numero: ");
        num3 = entrada.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.print("O maior valor é: " + num1);
        }  else if (num2 > num1 && num2 > num3){
           System.out.print("O maior valor é: "+ num2);
        }else {
            System.out.println("O maior valor é: "+ num3);
        }

        entrada.close();

    }

}
