package episodio22;

import java.util.*;

public class TesteHospede {
    public static void main(String[] args) {

        Endereco end1 = new Endereco("Rua Parana", 54, "Apartamento 504");


        Hospede ryan = criarHospede("Ryan", "Evangelista", null);
        ryan.setEndereco(end1);
        exibirDados(ryan);

        Endereco end2 = new Endereco("Avenida Marechal", 200, "");

        Hospede leticia = criarHospede("Leticia", "Ferreira", end2);
        exibirDados(leticia);


        Hospede maria = criarHospede("Maria", "da Silva", null);
        exibirDados(maria);

        Hospede tiago = criarHospede("Tiago" , "Resende", null);
        exibirDados(tiago);


        Hospede julia = criarHospede("Julia", "Silva", null);
        exibirDados(julia);

        Hospede jair = criarHospede("Jair", "Figueiredo", null);
        exibirDados(jair);





    }
    public static Hospede criarHospede(String nome, String sobrenome, Endereco e) {
        if(e == null) {
            return new Hospede (nome, sobrenome);
        }else {
            return new Hospede(nome, sobrenome, e);
        }
    }

    public static void exibirDados(Hospede h) {
        System.out.println("Nome: " + h.getNome());
        System.out.println("Sobrenome: " + h.getSobrenome());
        System.out.println("Endereço: "+ h.getEndereco().getRua());
    }
}
