import java.util.Scanner;

public class While_Fatorial {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int cont = 1;
        int num;
        System.out.println("Digite um número para calcular sua fatorial: ");
        num = entrada.nextInt();

        for(int i=num; i >= 1; i--){
            if(i > 1){
                System.out.print(i + " x ");
            }
            else{
                System.out.print(i);
            }
            cont = cont * i;

        }
        System.out.println(" = " + cont);

    }
}
