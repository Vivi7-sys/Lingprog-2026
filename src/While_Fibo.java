import java.util.Scanner;

public class While_Fibo {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos termos da sequência de Fibonacci você deseja ver? ");
        int n = entrada.nextInt();
        int fibo=0; int fibo2=1; int proximo;


        System.out.println("\n--- FIBONACCI GERADO ---");
        System.out.print(fibo + " ");   // mostra 0
        System.out.print(fibo2 + " ");  // mostra 1
        for(int i = 2; i < n; i++){
            proximo = fibo + fibo2;
            fibo = fibo2;
            fibo2 = proximo;
            System.out.print(fibo2 + " ");  // mostra o próximo
        }
    }
}
