import java.util.Scanner;

public class Vetor {
        public static void main(String[] args){
            float soma = 0;
            float[] notas = new float[5];
            Scanner entrada = new Scanner(System.in);

            for(int i=0; i<5; i++){
                System.out.println("Informa a nota " + (i+1));
                notas[i] = entrada.nextFloat();
                soma += notas[i];
            }
            System.out.println("A média é : " + soma/5);

        }
}
