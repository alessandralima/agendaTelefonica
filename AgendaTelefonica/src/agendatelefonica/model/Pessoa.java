package agendatelefonica.model;
    
/**
 * O comum em Java é criarmos classes Pojo, classes que são semelhantes a tabelas do banco, 
 * assim podemos manipular de forma igual para igual ao que está no banco. 
*/
public class Pessoa {
    
    /** Todos os atributos estão encapsulados, nunca use atributo público, 
     * use sempre métodos de acesso a atributos declarados como privados.
     * Para isso criamos os getters e os setters para cada atributo.
     */
    private String cpf;
    private String nome;
    private String operadora;
    private String cidade;
    private String telefone;

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the operadora
     */
    public String getOperadora() {
        return operadora;
    }

    /**
     * @param operadora the operadora to set
     */
    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
