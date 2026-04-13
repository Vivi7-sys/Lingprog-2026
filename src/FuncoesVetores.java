import java.util.Scanner;

public class FuncoesVetores {

    public static void vetor_inversor (){
        String[] nomes = new String[5];
        Scanner entrada = new Scanner(System.in);

        for(int i=0; i<5; i++){
            System.out.println("Digite seu nome: ");
            nomes[i] = entrada.nextLine();
        }
        for(int i=4; i>=0; i--){
            System.out.println(nomes[i]);

        }
    }
    public static void vetor_soma_par () {
        // 2. Exercicio
        Scanner entrada = new Scanner(System.in);
        int[] num = new int[8];
        int soma = 0;

        for(int i=0; i<8; i++){
            System.out.println("Digite um numero: ");
            num[i] = entrada.nextInt();
            if(num[i] % 2 == 0){
                soma += num[i];
            }
        }
        System.out.println("Soma dos Pares: " + soma);
    }
    public static void vetor_subs (){
        // 3. Exercicio
        Scanner entrada = new Scanner(System.in);
        int[]num = new int[10];

        for(int i=0; i<10; i++){
            System.out.println("Digite um numero: ");
            num[i] = entrada.nextInt();
            if(num[i] < 0){
                num[i] = 0;
            }
        }
        System.out.println();
        for(int i=0; i<10; i++){
            System.out.println(num[i]);
        }

    }
    public static void vetor_maior_menor(){
        // 4. Exercicio
        Scanner entrada = new Scanner(System.in);
        int[]num = new int[10];
        System.out.println("Digite um numero: ");
        num[0] = entrada.nextInt();
        int maior = num[0];
        int menor = num[0];
        int posMaior = 0;
        int posMenor = 0;

        for(int i=0; i<10; i++){
            System.out.println("Digite um numero: ");
            num[i] = entrada.nextInt();
            if(num[i] > maior){
                maior = num[i];
                posMaior = i;
            }
            if(num[i] < menor){
                menor = num[i];
                posMenor = i;
            }
        }
        System.out.println("Maior: " + maior);
        System.out.println("Posição do maior: " + posMaior);
        System.out.println("Menor: " + menor);
        System.out.println("Posição do menor: " + posMenor);
    }
    public static void vetor_busca(){
        // 5. Exercicio
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
    public static void vetor_uniao(){
        // 6. Exercicio
        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int[] vUniao = new int[10];
        Scanner entrada = new Scanner(System.in);

        System.out.println("Preencha o Vetor 1:");
        for (int i = 0; i < v1.length; i++) {
            v1[i] = entrada.nextInt();
            vUniao[i] = v1[i]; // Copia para as primeiras 5 posições
        }

        System.out.println("Preencha o Vetor 2:");
        for (int i = 0; i < v2.length; i++) {
            v2[i] = entrada.nextInt();
            // Copia para as posições de 5 a 9 (i + 5)
            vUniao[i + 5] = v2[i];
        }

        System.out.print("\nVetor União: ");
        // : percorre cada elemento da lista
        for (int num : vUniao) {
            System.out.print(num + " ");
        }
    }
    public static void vetor_media(){
        // 7. Exercicio
        double[] salarios = new double[5];
        double soma = 0;
        Scanner entrada = new Scanner(System.in);

        // 1ª Passagem: Leitura e Acumulação da Soma
        for (int i = 0; i < salarios.length; i++) {
            System.out.print("Informe o salário do " + (i + 1) + "º funcionário: R$ ");
            salarios[i] = entrada.nextDouble();
            soma += salarios[i];
        }

        // Cálculo da média após ter todos os valores
        double media = soma / salarios.length;

        int acima = 0, abaixo = 0, exatamenteIgual = 0;

        // 2ª Passagem: Comparação de cada posição com a média calculada
        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] > media) {
                acima++;
            } else if (salarios[i] < media) {
                abaixo++;
            } else {
                exatamenteIgual++;
            }
        }

        // Exibição dos resultados
        System.out.println("\n--- RELATÓRIO ESTATÍSTICO ---");
        System.out.printf("Média Salarial da Empresa: R$ %.2f%n", media);
        System.out.println("Funcionários acima da média: " + acima);
        System.out.println("Funcionários abaixo da média: " + abaixo);
        System.out.println("Funcionários que ganham exatamente a média: " + exatamenteIgual);
    }
    public static void vetor_bubble(){
        // 8. Exercicio
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];

        // 1. Entrada de dados
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextInt();
        }

        // 2. O Algoritmo Bubble Sort
        // O primeiro 'for' controla quantas passadas daremos no vetor
        for (int i = 0; i < numeros.length - 1; i++) {

            // O segundo 'for' faz as comparações entre vizinhos
            for (int j = 0; j < numeros.length - 1 - i; j++) {

                // Se o atual for MAIOR que o próximo, eles trocam!
                if (numeros[j] > numeros[j + 1]) {

                    // A "Troca de Copos" (Variável Auxiliar)
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }

        // 3. Exibição do vetor ordenado
        System.out.println("\n--- VETOR EM ORDEM CRESCENTE ---");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
    public static void vetor_fibo(){
        // 9. Exercicio
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos termos da sequência de Fibonacci você deseja guardar? ");
        int n = entrada.nextInt();

        // 1. Criando o vetor com o tamanho que o usuário escolheu
        int[] fibo = new int[n];

        // 2. Casos base: Os dois primeiros números são sempre 0 e 1
        // Precisamos tratar o caso de n ser 1 ou maior que 1
        if (n >= 1) {
            fibo[0] = 0;
        }
        if (n >= 2) {
            fibo[1] = 1;
        }

        // 3. Preenchendo o restante do vetor (começando do índice 2)
        // Cada posição é a soma das duas anteriores
        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        // 4. Exibindo o vetor completo
        System.out.println("\n--- VETOR DE FIBONACCI GERADO ---");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + fibo[i] + "] ");
        }
    }
    public static void vetor_estoque(){
        // 10. Exercicio
        Scanner entrada = new Scanner(System.in);

        // 1. Declaração de vetores paralelos
        String[] nomes = new String[5];
        int[] quantidades = new int[5];

        System.out.println("--- CADASTRO DE PRODUTOS ---");

        // 2. Preenchimento dos dados
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("\nNome do produto " + (i + 1) + ": ");
            nomes[i] = entrada.next();

            System.out.print("Quantidade em estoque de " + nomes[i] + ": ");
            quantidades[i] = entrada.nextInt();
        }

        // 3. Processamento e Filtro (Estoque Crítico)
        System.out.println("\n----------------------------------");
        System.out.println("ALERTA: PRODUTOS COM ESTOQUE CRÍTICO");
        System.out.println("(Menos de 5 unidades)");
        System.out.println("----------------------------------");

        boolean temCritico = false;

        for (int i = 0; i < quantidades.length; i++) {
            // Verificamos a quantidade, mas usamos o nome correspondente
            if (quantidades[i] < 5) {
                System.out.println("-> " + nomes[i] + ": apenas " + quantidades[i] + " unidades.");
                temCritico = true;
            }
        }

        if (!temCritico) {
            System.out.println("Tudo em ordem! Nenhum item abaixo do limite.");
        }
    }
    public static void exercicios(){
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("-----------MENU DE OPÇÕES------------");
        System.out.println("=====================================");
        System.out.println("| 1.  Vetor inversor                |");
        System.out.println("| 2.  Vetor soma par                |");
        System.out.println("| 3.  Vetor Substituição de Valores |");
        System.out.println("| 4.  Vetor maior e menor           |");
        System.out.println("| 5.  Vetor buscador de nomes       |");
        System.out.println("| 6.  União de Vetores              |");
        System.out.println("| 7.  Vetor média salarial          |");
        System.out.println("| 8.  Vetor Bubble Sort             |");
        System.out.println("| 9.  Vetor de Fibonacci            |");
        System.out.println("| 10. Vetor de estoque              |");
        System.out.println("=====================================");
        System.out.print("\nEscolha qual função de vetores deseja inicializar: ");
        int opcao = entrada.nextInt();
        switch (opcao){
            case 1:
                vetor_inversor();
                break;
            case 2:
                vetor_soma_par();
                break;
            case 3:
                vetor_subs();
                break;
            case 4:
                vetor_maior_menor();
                break;
            case 5:
                vetor_busca();
                break;
            case 6:
                vetor_uniao();
                break;
            case 7:
                vetor_media();
                break;
            case 8:
                vetor_bubble();
                break;
            case 9:
                vetor_fibo();
                break;
            case 10:
                vetor_estoque();
                break;
            default:
                System.out.println("Opção inválida");

        }
    }

    public static void main (String[] args){
        exercicios();
    }
}