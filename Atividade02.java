import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double n1, n2, media;

        System.out.println("Informe a nota: ");
        n1 = entrada.nextDouble();
        System.out.println("Informe a nota: ");
        n2 = entrada.nextDouble();
        media = (n1 + n2) / 2; 

        if ((media >= 0) && (media < 3)) {
            System.out.println("Reprovado: " + media);
        } else if ((media >= 3) && (media < 7)) {
            System.out.println("Exame: ");
        } else if ((media >= 7) && (media <= 10)) {
            System.out.println("Aprovado: " + media);
        } else {
            System.out.println("Média inválida!");
        }

        entrada.close();
    }
}