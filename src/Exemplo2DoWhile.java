import java.util.Scanner;

public class Exemplo2DoWhile {
        public static void main (String[] args){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Informe seu nome: ");
            String nome = entrada.nextLine();
            System.out.println("Informe o valor da compra: ");
            float valorBruto = entrada.nextFloat();
            int opcao = 0;
            do{
                System.out.println("Menu de Pagamento: \n 1.À Vista \n 2.À prazo sem juros \n 3.À prazo com juros");
                opcao = entrada.nextInt();
                switch (opcao){
                    case 1:
                        System.out.println("15% de desconto " + (valorBruto - valorBruto*0.15f));
                    break;
                    case 2:
                        int qtde = entrada.nextInt();
                        for(int i =1; i<=qtde; i++ ){
                            System.out.println("Valor da " + i + "a. parcela: " + valorBruto/qtde);
                        }
                    break;
                    case 3:
                        System.out.println("2% ao mês de juros, 10 parcelas de " + (valorBruto * 1.20)/10);
                    break;
                    case 4:
                        System.out.println("Progama vai ser encerrado!");
                    break;
                    default:
                        System.out.println("Opção invalida");
                }
            }
            while(opcao != 4);




        }
}
