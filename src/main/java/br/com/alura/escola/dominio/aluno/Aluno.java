package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private CPF numero;
    private String nome;
    private Email email;

    private List<Telefone> telefones = new ArrayList<>();

    private String senha;

    public Aluno(CPF numero, String nome, Email email) {
        this.numero = numero;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero) {
        this.telefones.add(new Telefone(ddd, numero));
    }

    public String getNumero() {
        return numero.getNumero();
    }

    public void setNumero(CPF numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email.getEndereco();
    }



    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }



    public static void main(String[] args) {
        Aluno a = new Aluno(new CPF("123"), "Fulano de tal", new Email("email"));
    }
}
