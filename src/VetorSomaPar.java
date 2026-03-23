import java.util.Scanner;

public class VetorSomaPar {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int[] num = new int[8];
        int soma = 0;

        for(int i=0; i<8; i++){
            System.out.println("Digite um numero: ");
            num[i] = entrada.nextInt();
            if(num[i] % 2 == 0){
                soma += num[i];
            }
        }
        System.out.println("Soma dos Pares: " + soma);
    }
}