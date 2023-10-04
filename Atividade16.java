import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pre, novoPre;
        System.out.println("Digite o valor do produto: R$");
        pre = entrada.nextDouble();

        if (pre <= 30) {
            System.out.println("O produto não tem desconto.");
        } else if ((pre >= 100) && (pre <= 300)) {
            novoPre = pre * 0.10;
            System.out.print("O produto tem um desconto de 10% O seu novo preço é: R$ "+ novoPre);
        } else {
            novoPre = pre * 0.15;
            System.out.print("O produto tem um desconto de 15% O seu novo preço é: R$ "+ novoPre);
        }
        entrada.close();
    }
}
