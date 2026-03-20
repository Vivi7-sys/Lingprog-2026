import java.util.Scanner;

public class ContadorDePar {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero para o limite inferior: ");
        int limiteInf = entrada.nextInt();
        System.out.println("Digite um numero para o limite superior: ");
        int limiteSup = entrada.nextInt();

        for(int i=limiteInf; i<=limiteSup; i++){
            if(i%2==0){
                System.out.println("Os numeros pares sao: " + i);
            }
        }
    }
}