package modelo1;

public class Modelo1 {

    public static void main(String[] args) {
        System.out.println("\n"+adicionarPontos());
        System.out.println(retornaFrase());
        System.out.println("\n"+adicionarPontos());
    }
    
    public static String retornaFrase() {
        return "Olá Mundo";
    }
    
    public static String adicionarPontos() {
        return "....................";
    }
}
