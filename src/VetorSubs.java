import java.util.Scanner;

public class VetorSubs {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int[]num = new int[10];
        
        for(int i=0; i<10; i++){
            System.out.println("Digite um numero: ");
            num[i] = entrada.nextInt();
            if(num[i] < 0){
                num[i] = 0;
            }
        }
        for(int i=0; i<10; i++){
            System.out.println(num[i]);
        }
    }
}
