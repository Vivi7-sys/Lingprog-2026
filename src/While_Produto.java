import java.util.Objects;
import java.util.Scanner;

public class While_Produto {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        String nome;
        int preco=0;
        int Maior_preco = 0;
        String continuar = "S";

        while(continuar.equals("S")) {

            System.out.println("Qual o nome do produto? ");
            nome = entrada.next();
            System.out.println("Qual o valor do produto? ");
            preco = entrada.nextInt();

                if(preco > Maior_preco){
                    Maior_preco = preco;
                }
            System.out.println("desaja continuar? (N/S)");
            continuar = entrada.next();
            if (continuar.equals("N")) {
                break;
            }
        }
        System.out.println("Produto de maior preço: " + Maior_preco);

    }
}
