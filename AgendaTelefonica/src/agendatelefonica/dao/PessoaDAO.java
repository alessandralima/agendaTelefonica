package agendatelefonica.dao;

import agendatelefonica.model.Pessoa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class PessoaDAO {
    
    // Configura essas variáveis de acordo com o seu banco  
    private final String URL = "jdbc:mysql://localhost/agenda",
            NOME = "root", SENHA = "password";

    private Connection con;
    private Statement comando;

    public void apagar(String rg) {
        conectar();
        try {
            comando
                    .executeUpdate("DELETE FROM pessoa WHERE rg = '" + rg
                            + "';");
        } catch (SQLException e) {
            imprimeErro("Erro ao apagar pessoas", e.getMessage());
        } finally {
            fechar();
        }
    }

    public Vector<Pessoa> buscarTodos() {
        conectar();
        Vector<Pessoa> resultados = new Vector<Pessoa>();
        ResultSet rs;
        try {
            rs = comando.executeQuery("SELECT * FROM pessoa");
            while (rs.next()) {
                Pessoa temp = new Pessoa();
                // pega todos os atributos da pessoa  
//                temp.setRg(rs.getString("rg"));
//                temp.setNome(rs.getString("nome"));
//                temp.setIdade(rs.getInt("idade"));
//                temp.setCidade(rs.getString("cidade"));
//                temp.setEstado(rs.getString("estado"));
                resultados.add(temp);
            }
            return resultados;
        } catch (SQLException e) {
            imprimeErro("Erro ao buscar pessoas", e.getMessage());
            return null;
        }
    }

    public void atualizar(Pessoa pessoa) {
        conectar();
//        String com = "UPDATE pessoa SET nome = '" + pessoa.getNome()
//                + "', idade =" + pessoa.getIdade() + ", cidade = '"
//                + pessoa.getCidade() + "', estado ='" + pessoa.getEstado()
//                + "' WHERE  rg = '" + pessoa.getRg() + "';";
//        System.out.println("Atualizada!");
//        try {
//            comando.executeUpdate(com);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            fechar();
//        }
    }

    public Vector<Pessoa> buscar(String rg) {
        conectar();
        Vector<Pessoa> resultados = new Vector<Pessoa>();
        ResultSet rs;
//        try {
//            rs = comando.executeQuery("SELECT * FROM pessoa WHERE rg LIKE '"
//                    + rg + "%';");
//            while (rs.next()) {
//                Pessoa temp = new Pessoa();
//                // pega todos os atributos da pessoa  
//                temp.setRg(rs.getString("rg"));
//                temp.setNome(rs.getString("nome"));
//                temp.setIdade(rs.getInt("idade"));
//                temp.setCidade(rs.getString("cidade"));
//                temp.setEstado(rs.getString("estado"));
//                resultados.add(temp);
//            }
//            return resultados;
//        } catch (SQLException e) {
//            imprimeErro("Erro ao buscar pessoa", e.getMessage());
           return null;
//        }

    }

    public void insere(Pessoa pessoa) {
        conectar();
//        try {
//            comando.executeUpdate("INSERT INTO Pessoa VALUES('"
//                    + pessoa.getRg() + "', '" + pessoa.getNome() + "',"
//                    + pessoa.getIdade() + ",'" + pessoa.getCidade() + "','"
//                    + pessoa.getEstado() + "')");
//            System.out.println("Inserida!");
//        } catch (SQLException e) {
//            imprimeErro("Erro ao inserir Pessoa", e.getMessage());
//        } finally {
//            fechar();
//        }
    }

    public void conectar() {
        try {
            con = Conexao.abreConexao(URL, NOME, SENHA, Conexao.MYSQL);
            comando = con.createStatement();
            System.out.println("Conectado!");
        } catch (ClassNotFoundException e) {
            imprimeErro("Erro ao carregar o driver", e.getMessage());
        } catch (SQLException e) {
            imprimeErro("Erro ao conectar", e.getMessage());
        }
    }

    private void fechar() {
        try {
            comando.close();
            con.close();
            System.out.println("Conexão Fechada");
        } catch (SQLException e) {
            imprimeErro("Erro ao fechar conexão", e.getMessage());
        }
    }

    private void imprimeErro(String msg, String msgErro) {
//        JOptionPane.showMessageDialog(null, msg, "Erro crítico", 0);
        System.err.println(msg);
        System.out.println(msgErro);
        System.exit(0);
    }
}
