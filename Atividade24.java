import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pre, cate;
        char situ;
        System.out.print("Digite o preço: ");
        pre = entrada.nextDouble();
        System.out.print("Digite a categoria desejada: 1 - Limpeza; 2 - Alimentação; 3 - vestuário. Categoria: ");
        cate = entrada.nextDouble();
        System.out.print("digite uma das seguintes situações: R - Produto que necessita de refrigeração; N - Produto que não necessita de refrigeração. Situação:  ");
        situ = entrada.next().charAt(0);

        if (pre <= 25 && cate == 1 && situ =='N' ){
            System.out.println("O preço recebera um percentual de aumento de 5%. O novo preço é: R$ "+ pre * 0.05);

        }else if(pre <= 25 && cate == 2 && situ == 'N'){
            System.out.println("O preço recebera um percentual de aumento de 8%. O novo preço é: R$ "+ pre * 1.08);
        } else if (pre <= 25 && cate == 3 && situ == 'N'){
            System.out.println("O preço recebera um percentual de aumento de 10%. O novo preço é: R$ "+ pre * 1.10);

        }else if (pre > 25 && cate == 1 && situ == 'N'){
            System.out.println("O preço recebera um percentual de aumento de 12%. O novo preço é: R$ "+ pre * 1.12);

        } else if(pre > 25 && cate == 2 && situ == 'N'){
            System.out.println("O preço recebera um percentual de aumento de 15%. O novo preço é: R$ "+ pre * 1.15);

        }else if (pre > 25 && cate == 3 && situ == 'N'){
            System.out.println("O preço recebera um percentual de aumento de 18%. O novo preço é: R$ "+ pre * 1.18);
        }else if (cate == 2 || situ == 'R'){
            System.out.println("O preço recebera um percentual de aumento de 18% e mais os 5% de imposto. O novo preço é: R$ "+(pre * 1.08 ) * 0.05 );  
            if ((pre * 1.08) * 0.05 <= 50){
                System.out.println("O preço esta barato!");
            } else if ((pre * 1.08) * 0.05 >= 50 &&(pre * 1.08) * 0.05 <= 120){
                System.out.println("O preço esta Normal");
            } else if((pre * 1.08) * 0.05 >= 120){
                System.out.println("O preço esta Caro!");
            }
        } 
       
        entrada.close();
        
    }
    
}
