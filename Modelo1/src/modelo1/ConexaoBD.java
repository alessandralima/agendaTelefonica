package modelo1;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD {

    Connection conn = null;

    /**
     * Método responsável por tentar realizar uma conexão com o banco.
     * Utilizando o Driver do banco de dados SQLITE JDBC
     * 
    */
    public static Connection ConnectDb() {
        try {
            // Especificando o Driver sqlite
            Class.forName("org.sqlite.JDBC");
            // Informar onde está o banco SQLITE
            String caminhoBanco = "jdbc:sqlite:C:\\projetos\\senac\\pi\\projetoExemplo\\SQLite\\BancoDados\\bancoTeste.sqlite";
            
            Connection conn = DriverManager.getConnection(caminhoBanco);
            
            System.out.println(">> Conexão estabelecida com sucesso :) ");
            return conn;
        } catch (Exception e) {
            System.out.println("****** Não foi possível conectar. Erro [ " + e.getMessage() + " ]");
            return null;
        }
    }

}
