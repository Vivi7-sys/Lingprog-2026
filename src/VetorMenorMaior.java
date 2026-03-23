import java.util.Scanner;

public class VetorMenorMaior{
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int[]num = new int[10];
        System.out.println("Digite um numero: ");
        num[0] = entrada.nextInt();
        int maior = num[0];
        int menor = num[0];
        int posMaior = 0;
        int posMenor = 0;

        for(int i=0; i<10; i++){
            System.out.println("Digite um numero: ");
            num[i] = entrada.nextInt();
            if(num[i] > maior){
                maior = num[i];
                posMaior = i;
            }
            if(num[i] < menor){
                menor = num[i];
                posMenor = i;
            }
        }
        System.out.println("Maior: " + maior);
        System.out.println("Posição do maior: " + posMaior);
        System.out.println("Menor: " + menor);
        System.out.println("Posição do menor: " + posMenor);
    }
}