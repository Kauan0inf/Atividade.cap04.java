import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double senha;
        System.out.println("Digite a sua senha: ");
        senha = entrada.nextDouble();
      if (senha == 4531){
        System.out.println("Permissão concedida");

       }else {
        System.out.println("Senha incorreta.");
       }
       entrada.close();
    }
    
}  

