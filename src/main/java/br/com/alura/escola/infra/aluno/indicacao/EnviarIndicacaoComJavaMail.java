package br.com.alura.escola.infra.aluno.indicacao;

import br.com.alura.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.alura.escola.dominio.aluno.Aluno;

public class EnviarIndicacaoComJavaMail implements EnviarEmailIndicacao {
    @Override
    public void enviarPara(Aluno indicado) {
        //logica de envio de email com a lib Java Mail
    }
}
