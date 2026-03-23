import java.util.Scanner;

public class VetorBusca{
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[10];
        boolean encontrado = false;

        for(int i=0; i<10; i++){
            System.out.println("Digite seu nome: ");
            nomes[i] = entrada.nextLine();
        }
        System.out.println("Qual nome deseja procurar ? ");
        String busca = entrada.nextLine();

        for(int i = 0; i < 10; i++){
            if(nomes[i].equals(busca)){
                encontrado = true;
                System.out.println("Nome encontrado na posição: " + i);
            }
        }
        if(!encontrado){
            System.out.println("Nome nao encontrada!");
        }

    }
}