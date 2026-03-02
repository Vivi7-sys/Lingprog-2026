import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Informe a Leitura Anterior da sua Conta de Luz: ");
        double leituraAnterior = entrada.nextDouble();
        System.out.println("Informe a Leitura Atual da sua Conta de Luz: ");
        double leituraAtual = entrada.nextDouble();
        double consumo = leituraAtual - leituraAnterior;
        double valorBruto = consumo * 0.60;
        double valorFinal = valorBruto;
        String bandeira = "";
        if (consumo < 0) {
            System.out.println("Erro: leitura atual menor que a anterior.");
            return;
        }
        if (consumo <= 100){
            bandeira = "Verde";
        }
        else if (consumo > 100 && consumo <= 200){
            bandeira = "Amarela";
            valorFinal = valorFinal + 2;
        }
        else if (consumo > 200 && consumo <= 300){
            bandeira = "Vermelha";
            valorFinal = valorFinal + 5;
        }
        else {
            bandeira = "Preta";
            valorFinal = valorFinal + 10;
        }
        double valorArredondado = Math.round(valorFinal * 100.0) / 100.0;
        System.out.println("Senhor ou Senhora: " + nome);
        System.out.println("Voce teve um consumo de luz de: " + consumo + " kWh");
        System.out.println("Com isso obteve uma bandeira de cor: " + bandeira);
        System.out.println("Valor final da sua conta foi de: " + valorArredondado + " R$");


    }
}
