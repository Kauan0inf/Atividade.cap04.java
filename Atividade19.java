import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double altura, pesoBom = 0.0;
        char sexo;
        System.out.print("Digite a sua altura: ");
        altura = entrada.nextDouble();
        System.out.println("Digite o seu sexo  M para masculino ou F para feminino ");
        sexo = entrada.next().charAt(0);
        switch (sexo) {
            case 'M':
            case 'm':
                pesoBom = (72.7 * altura) - 58;
                break;
            case 'F':
            case 'f':
                pesoBom = (62.1 * altura) - 44.7;
                break;
            default:
                System.out.println("Sexo invalido");
             
        }
     System.out.println("O peso ideal para seu sexo e sua altura é: " + pesoBom + "kg.");
        entrada.close();
    }
}
