package agendatelefonica.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Para a conexão temos uma classe que faz a função de fábrica de conexões.
 * Obeserve que para outros bancos de dados você deve alterar a fábrica, essa só
 * tem a parte do MySql.
 */
public class Conexao {

    // Configura essas variáveis de acordo com o seu banco  
    private final String URL = "jdbc:mysql://localhost/agenda", 
            NOME = "root", SENHA = "password";
    
    public static final int MYSQL = 0;
    private static final String MySQLDriver = "com.mysql.jdbc.Driver";

    public static Connection abreConexao(String url, String nome, String senha,
            int banco) throws ClassNotFoundException, SQLException {
        
        switch (banco) {
            case MYSQL:
                Class.forName(MySQLDriver);
                break;
        }
        return DriverManager.getConnection(url, nome, senha);
    }
}
