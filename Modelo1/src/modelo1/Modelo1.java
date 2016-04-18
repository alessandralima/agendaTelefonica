package modelo1;

import java.sql.Connection;

public class Modelo1 {

    public static void main(String[] args) {
        System.out.println("\n"+adicionarPontos());
        System.out.println(retornaFrase());
        System.out.println("\n"+adicionarPontos());
        
        testaConexao();
    }
    
    public static void testaConexao(){
        Connection testConexao = ConexaoBD.ConnectDb();
    }
    
    public static String retornaFrase() {
        return "Olá Mundo";
    }
    
    public static String adicionarPontos() {
        return "....................";
    }
}
