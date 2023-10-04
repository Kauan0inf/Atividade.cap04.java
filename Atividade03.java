import java.util.Scanner;

public class Atividade03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2;
        String msg;

        System.out.println("Informe um número: ");
        n1 = entrada.nextDouble();
        System.out.println("Informe um número: ");
        n2 = entrada.nextDouble();

        if (n1 > n2) {
           msg = n2 + " menor que " + n1;
        } else if (n1 < n2) {
           msg = n1 + " menor que " + n2;
        } else {
            msg = "São iguais!";
        }
        System.out.println(msg);
        
        entrada.close();
    }
}