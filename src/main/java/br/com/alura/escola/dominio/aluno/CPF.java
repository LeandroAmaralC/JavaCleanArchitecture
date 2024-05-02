package br.com.alura.escola.dominio.aluno;

public class CPF {

    private String numero;

    public CPF(String cpf){
        if ( cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("cpf é invalido!");
        }

        this.numero = cpf;

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
