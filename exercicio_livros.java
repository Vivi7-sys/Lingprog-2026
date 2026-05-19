import java.sql.*;
import java.util.Scanner;

public class exercicio_livros {
    public static void criar_tabela(Connection conn) throws SQLException {

        String sql = """
        CREATE TABLE IF NOT EXISTS livros (
            id SERIAL PRIMARY KEY,
            titulo TEXT NOT NULL,
            autor TEXT NOT NULL,
            ano INTEGER,
            disponivel INTEGER
        )
    """;

        Statement stmt = conn.createStatement();
        stmt.execute(sql);

        System.out.println("Tabela criada");
        stmt.close();
    }
    public static void insere_livros(Connection conn, Scanner sc)
            throws SQLException {
        System.out.println("Digite o titulo do livro");
        String titulo = sc.nextLine();
        System.out.println("Digite o autor do livro");
        String autor = sc.nextLine();
        System.out.println("Digite o ano do livro");
        int ano = sc.nextInt();
        System.out.println("Digite se o livro está disponivel");
        int disponivel = sc.nextInt();
        // cria SQL
        String sql = "INSERT INTO livros (titulo, autor, ano, disponivel) VALUES (?, ?, ?, ?)";
        // prepara uma instrução SQL
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, titulo);// define o titulo do livro
        ps.setString(2, autor);// define o autor do livro
        ps.setInt(3, ano); // define o ano do livro
        ps.setInt(4, disponivel); // define se o livro esta disponivel
        ps.executeUpdate(); // executa o SQL
        ps.close();
    }
    public static void consulta_livros(Connection conn) throws SQLException{
        // cria comando sql
        String sql = "SELECT * FROM livros ORDER BY titulo";
        Statement stmt = conn.createStatement();
        // executa a consulta no banco e armazena o resultado em rs
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            //recupera o valor de cada coluna
            int id= rs.getInt("id");
            String titulo = rs.getString("titulo");
            String autor = rs.getString("autor");
            int ano = rs.getInt("ano");
            int disponivel = rs.getInt("disponivel");
            System.out.printf("[%d] %s - %s - %d - Disponível: %d%n", id, titulo, autor, ano, disponivel);

        }
    }
    public static void remove_livros(Connection conn, Scanner sc) throws SQLException{
        System.out.println("Informe id do produto");
        int id = sc.nextInt();
        String sql = "DELETE FROM livros WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        int linhasAfetadas = ps.executeUpdate();
        ps.close();
        if (linhasAfetadas > 0){
            System.out.println("Produto removido");
        }
        else System.out.println("ID não encontrado");
    }
    public static void emprestar_livros(Connection con, Scanner sc) throws SQLException {
        System.out.println("Informe id do produto");
        int id = sc.nextInt();
        System.out.println("Informe novo preço");
        Double novoPreco = sc.nextDouble();
        String sql = "UPDATE livros SET preco = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDouble(1, novoPreco);
        ps.setInt(2, id);
        int linhasAfetadas = ps.executeUpdate();
        if (linhasAfetadas > 0){
            System.out.println("Preço atualizado com sucesso");
        }
        else {
            System.out.println("Produto não encontrado");
        }
    }
    public static void exibirMenu(){
        System.out.println("\n----CRUD de Livros----");
        System.out.println("1. Listar Livros");
        System.out.println("2. Cadstrar livro");
        System.out.println("3. Emprestar livro");
        System.out.println("4. Remover Livros");
        System.out.println("0. Sair");
        System.out.println("Opção: ");
    }
    public static void processarOpcao(Connection conn, Scanner sc, int opcao)
            throws SQLException{
        switch(opcao){
            case 1: consulta_livros(conn); break;
            case 2: insere_livros(conn, sc); break;
            case 3: emprestar_livros(conn, sc); break;
            case 4: remove_livros(conn, sc); break;
            case 0: System.out.println("Encerrando ..."); break;
            default: System.out.println("Opção inválida");
        }
    }

    public static void main (String[] args){
        String url = "jdbc:postgresql://localhost:5432/Livros";
        try{ // tenta se conectar no banco de dados
            Connection conn = DriverManager.getConnection(url, "postgres", "fatec123*");
            System.out.println("Conectado com sucesso");
            // cria a tabela
            criar_tabela(conn);
            Scanner sc = new Scanner(System.in);
            int opcao = 1;
            do{
                exibirMenu();
                opcao = sc.nextInt();
                sc.nextLine();
                processarOpcao(conn, sc, opcao);
            }
            while(opcao != 0);

        } catch (SQLException e) { // caso de erro, desvia pra cá
            System.out.println("Erro ao conectar com o banco " + e.getMessage());
        }

    }

}