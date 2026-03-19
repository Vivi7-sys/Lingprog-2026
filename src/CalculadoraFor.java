import java.util.Scanner;

public class CalculadoraFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o numero que deseja saber a tabuada: ");
        int num = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}