import java.util.Scanner;

public class Atividade01 {
   
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        double n1, n2, n3, n4, media;

        System.out.println("Informe a nota: ");
        n1 = entrada.nextDouble();
        System.out.println("Informe a nota: ");
        n2 = entrada.nextDouble();
        System.out.println("Informe a nota: ");
        n3 = entrada.nextDouble();
        System.out.println("Informe a nota: ");
        n4 = entrada.nextDouble();
        media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 7) {
            System.out.println("Aprovado: " + media);
        } else {
            System.out.println("Reprovado: " + media);
        }

        entrada.close();
    }
}