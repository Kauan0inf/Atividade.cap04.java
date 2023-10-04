import java.util.Scanner;

public class Atividade10 {
    //O preço ao consumidor de um carro novo é a soma do custo de fábrica com a porcentagem do distribuidor
    // e dos impostos, ambos aplicados ao custo de fábrica. As porcentagens encontram-se na tabela a
    //seguir. Faça um programa que receba o custo de fábrica de um carro e mostre o preço ao consumidor.
    //Até R$ 12.000,00 ¨¨ 5 ¨¨isento
    //Entre R$ 12.000,00 e R$ 25.000,00 ¨¨ 10 ¨¨ 15
    //Acima de R$ 25.000,00 ¨¨ 15 ¨¨ 20

    public static void main (String[] args) {
        Scanner entrada = new Scanner (System.in);
        double preçoCon, custoF;
        //Declaração de variáveis
        System.out.print( "Me informe o custo de fabrica: ");
        custoF = entrada.nextDouble();
        //Entrada de dados
        if (custoF <= 12000.0) {
            preçoCon = custoF + ( custoF * 0.05);
        } else if (custoF <= 25000.0) {
            preçoCon = custoF + ( custoF * 0.25 );
        } else {
            preçoCon = custoF + (custoF * 0.35);
        }
        System.out.println("Preço ao consumidor: R$ " + preçoCon);
        // Condicional e Saida de dados
        entrada.close();
    }
    
}
