import java.util.Scanner;

public class VetorInversor{
    public static void main (String[] args){
        String[] nomes = new String[5];
        Scanner entrada = new Scanner(System.in);

        for(int i=0; i<5; i++){
            System.out.println("Whats your name? ");
            nomes[i] = entrada.nextLine();
        }
        for(int i=4; i>=0; i--){
            System.out.println(nomes[i]);

        }
    }
}