import java.util.Scanner;

public class Somatorio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos numeros deseja somar: ");
        int qtd = entrada.nextInt();
        int soma = 0;

        for (int i = 1; i <= qtd; i++) {
            System.out.println("Digite um numero: ");
            int num = entrada.nextInt();
            soma = soma + num;
        }
        System.out.println("A soma deu: " + soma);

    }
}