import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double horasEx, horasFal, op;
        System.out.print("Digite a quantidade de horas extras trabalhadas: ");
        horasEx = entrada.nextDouble();
        System.out.println("Digite a quantidade de horas faltadas: ");
        horasFal = entrada.nextDouble();
        op = horasEx - (2/3 * horasFal);

        if ( op >= 2400){
          System.out.println("O funcionário vai receber uma bonificação de:R$ "+ op); 

        }else if (op > 1800 && op <= 2400){
            System.out.println("O funcionário vai receber uma bonificação de:R$ "+ op); 

        }else if (op > 1200 && op <= 1800){
            System.out.println("O funcionário vai receber uma bonificação de:R$ " + op );
            
        }else if(op > 600 && op <= 1200){
            System.out.println("O funcionário vai receber uma bonificação de R$ " + op);

        }else {
            System.out.println("O funcionário vai receber uma bonificação de R$ 100,00.");
        }
      entrada.close();
    }
}
