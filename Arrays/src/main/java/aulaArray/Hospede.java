package aulaArray;

public class Hospede {
    private String nome; // campo, variável de instância, atributo
    private String sobrenome;
    private double salario;

    public Hospede() {
    }

    public Hospede(String nome) {

        this.nome = nome;
    }

    public Hospede(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public static void main(String[] args) {
        Hospede rodrigo = new Hospede();
        rodrigo.setNome("Rodrigo");
        rodrigo.setSobrenome("Martins Pagliares");

        // exibindo o estado do objeto
        System.out.println("Nome...: " + rodrigo.getNome());
        System.out.println("Sobrenome..: " + rodrigo.getSobrenome());
    }

    public String getNome() {
        // int idade = 10;
        return nome;
    }

    void setNome(String nome) {
        // idade = 20;
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * Este método é crucial para a estabilidade da classe Hospede.
     * Caso queira entender com maiores detalhes sua lógica de implementação
     * consulte o documento de especificação de requisitos do sistema.
     *
     * @param numeroGrande: número de acordo com a especificação IEEE para números flutuantes.
     * @deprecated favor não utilizar este método. Somente em última instância.
     * prefira o metodoMuitoComplexoAtualizado
     */
    public void metodoMuitoComplexo(double numeroGrande) {

    }
}

