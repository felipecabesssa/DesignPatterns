package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.Orcamento;

public class Reprovado extends SituacaoOrcamento{
	
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}

}
