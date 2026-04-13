import java.util.Scanner;

public class For_Stonks {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int deposito;  double conta;

        System.out.println("Qual é o valor à ser depositado? ");
        deposito = entrada.nextInt();
        System.out.println("Qual é o juros a ser acresentado? ");
        double juros = entrada.nextDouble() / 100;
        conta = deposito;

        for(int i=1; i<=12; i++){
            conta = conta + conta * juros;
            System.out.println("Mês " + i + ": R$ " + String.format("%.2f", conta));
        }


    }
}
