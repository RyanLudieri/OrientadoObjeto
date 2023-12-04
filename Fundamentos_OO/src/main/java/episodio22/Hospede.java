package episodio22;


import java.util.Date;

public class Hospede {

    private String nome;
    private String sobrenome;
    //Private so permite acesso para membros e
    //construtores da mesma classe (nesse caso hospede)
    private double salario;
    public Endereco endereco;


    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Hospede(){
    }

    public Hospede(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @param nome
     * @param sobrenome
     */
    public Hospede(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Hospede(String nome, String sobrenome, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;

        this.endereco = endereco;
    }


    /**
     * Este método é crucial para  a estabilidade da classe hospede
     * Caso queira entender com maiores detalhes sua lógica de implementação
     * Consulte o documento de especificação de requisitos do sistema
     * @param numero de acordo com a especificação IEEE para números flutuantes
     * @deprecated favor utilizar este metodo em ultima instancia
     * prefira o métodoMuitoComplexoAtualizado
     * */
    public void metodoMuitoComplexo(double numeroGrande) {
        Date hoje = new Date();
    }


    public String getNome() {
        int idade = 20;
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

}
