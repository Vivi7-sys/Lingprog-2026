import java.util.Scanner;

public class DoWhile {
        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
            float saldo = 0;
            int opcao =0;
            do{
                System.out.println("Digite umas das opções: \n 1. Consulta saldo \n 2. Depositar \n 3. Sacar \n 4.Sair");
                opcao = entrada.nextInt();
                switch(opcao){
                    case 1:
                        System.out.println("Saldo atual da conta: " + saldo);
                    break;
                    case 2:
                        System.out.println("Informe o valor do deposito: ");
                        float valor = entrada.nextFloat();
                        saldo += valor;
                    break;
                    case 3:
                        System.out.println("Informe o valor a ser sacado: ");
                        valor = entrada.nextFloat();
                        if(valor<=saldo){
                            saldo -= valor;
                            System.out.println("Saque realizado com sucesso! ");
                        }
                        else System.out.println("Saldo Insuficiente");
                    break;
                    case 4:
                        System.out.println("O programa será encerrado! ");
                    break;
                    default:
                        System.out.println("Opção Inválida");
                }
            }
            while(opcao != 4);
        }
    }
