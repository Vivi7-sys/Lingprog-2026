public class MatrizDiagonal {
    public static void main (String[] args){
        int [][] diagonal = new int[4][4];
        int soma = 0;

        for(int i=0; i< diagonal.length; i++){
            for(int j=0; j< diagonal.length; j++){
                diagonal[i][j] = (int) (Math.random() * 90) + 10;
                if(i == j){
                    System.out.println("Elemento que faz parte da diagonal: " + diagonal[i][j]);
                    soma += diagonal[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("Soma dos elementos da diagonal: " + soma);

    }
}
