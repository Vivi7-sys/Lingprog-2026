import java.util.Scanner;

public class While_Idades {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int idade = 0;
        int soma = 0;
        double media;
        int cont = 0;

        while (idade >= 0){
            System.out.println("Digite sua idade :");
            idade = entrada.nextInt();
            if(idade > 0){
                soma = soma + idade;
                cont ++;
            }

        }
        media = (double)soma/cont;
        System.out.println(media);
    }
}
