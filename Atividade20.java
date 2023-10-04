import java.util.Scanner;
public class Atividade20 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double idade;
    System.out.print("Digite a idade do nadador: ");
    idade = entrada.nextDouble();

    if (idade <= 7) {
      System.out.print("O nadador é considerado  na categoria infantil");
    } else if (idade <= 10) {
      System.out.print("O nadador é considerado  na categoria juvenil");
    } else if (idade <= 15) {
      System.out.print("O nadador é considerado  na categoria adolescente ");

    } else if (idade <= 30) {
      System.out.print("O nadador é considerado  na categoria adulto");
    } else {
      System.out.print("O nadador é considerado  na categoria senior");
    }
    entrada.close();
  }

}
