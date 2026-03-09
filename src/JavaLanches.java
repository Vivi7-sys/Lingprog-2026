import java.util.Scanner;

public class JavaLanches {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o codigo do produto desejado: ");
        System.out.println("101- Cachorro-Quente");
        System.out.println("102- X-Burguer");
        System.out.println("103- X-Salada");
        int opcao = entrada.nextInt();
        switch (opcao){
            case 101:
                System.out.println("Cachorro-Quente R$ 10,00");
                break;
            case 102:
                System.out.println("X-Burguer R$ 15,00");
                break;
            case 103:
                System.out.println("X-Salada R$ 12,00");
                break;
            default:
                System.out.println("Opção inválida");
        }
        System.out.println("Qual a sua idade ?");
        int idade = entrada.nextInt();
        if (idade < 12){
            System.out.println("Desconto de 50% (Menu Kids)");
        }
        else if (idade >= 12 && idade <= 60) {
            System.out.println("Sem desconto (Valor Integral)");
        }
        else{
            System.out.println("Desconto de 30% (Melhor Idade).");
        }
    }
}