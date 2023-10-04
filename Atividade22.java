import java.util.Scanner;

public class Atividade22 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int idade;
    double peso;

    System.out.println("Digite sua idade: ");
    idade = entrada.nextInt();

    System.out.println("Digite seu peso: ");
    peso = entrada.nextDouble();

    if (idade < 20) {
      if (peso < 60) {
        System.out.println("Grupo de risco 9");
      } else if (peso >= 60 && peso <= 90) {
        System.out.println("Grupo de risco 8");
      } else {
        System.out.println("Grupo de risco 7");
      }
    } else if (idade >= 20 && idade <= 50) {
      if (peso < 60) {
        System.out.println("Grupo de risco 6");
      } else if (peso >= 60 && peso <= 90) {
        System.out.println("Grupo de risco 5");
      } else {
        System.out.println("Grupo de risco 4");
      }
    } else if (idade > 50) {
      if (peso < 60) {
        System.out.println("Grupo de risco 3");
      } else if (peso >= 60 && peso <= 90) {
        System.out.println("Grupo de risco 2");
      } else {
        System.out.println("Grupo de risco 1");
      }
    } else {
      System.out.println("Idade não encontrada na tabela.");
    }

    entrada.close();
  }
}
