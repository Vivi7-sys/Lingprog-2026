import java.util.Scanner;

public class ValidacaoInsistencia{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma nota entre 0 e 10: ");
        int nota = entrada.nextInt();
            while(nota <0  || nota > 10){
                System.out.println("Nota inválida! Digite novamente: ");
                nota = entrada.nextInt();
            }
    }

}