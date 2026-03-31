
public class MatrizNotas {
    public static void main(String[] args){

        // declaração da matriz
        float[][] notas = new float[3][4];

        // leitura da matriz
        // soma as notas
        float soma = 0;
        for(int i=0;i<notas.length;i++){
            for(int j=0;j<notas[i].length; j++){
                // gera notas entre 0 e 10
                notas[i][j] = (float) (Math.random() * 10);
                soma += notas[i][j];
                System.out.printf("%.2f   ", notas[i][j]); // exibi a matriz
            }
            System.out.println(""); //pula linha para fazer a matriz
        }
        int qtdeNotas = notas.length * notas[0].length;
        System.out.printf("\nA média das notas é: %.2f \n" , soma / qtdeNotas);

        for(int i=0; i< notas.length; i++){ // para cada aluno
            float acumulador = 0;
            for(int j=0; j<notas.length; j++){
                acumulador += notas[i][j];
            }
            float media = acumulador/notas[i].length;
            System.out.println("A média do aluno " + (i+1) + " é: " + media);
        }

        for(int j=0; j<notas[0].length; j++){ // para cada prova
            float acumulador = 0;
            for(int i=0; i<notas.length; i++){
                acumulador += notas[i][j];
            }
            float media = acumulador/notas.length;
            System.out.println("A média da prova " + (j+1) + " é: " + media);

        }
    }
}