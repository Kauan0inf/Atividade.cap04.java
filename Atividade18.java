import java.util.Scanner;

public class Atividade18 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double idade;
    System.out.print("Digite sua Idade: ");
    idade = entrada.nextDouble();
    if (idade >= 18) {
      System.out.print("\nVocê é maior de idade!");
    } else {
      System.out.println("\nVocê  é de menor.");
    }
    entrada.close();
  }
}
