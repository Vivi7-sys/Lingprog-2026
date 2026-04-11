import java.util.Objects;
import java.util.Scanner;

public class WhileLogin {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.next();
        System.out.println("Digite sua senha: ");
        String senha = entrada.next();

        while(Objects.equals(nome, senha)){
            System.out.println("ERRO!");
            System.out.println("Digite sua senha novamente: ");
            senha = entrada.next();


        }
    }
}
