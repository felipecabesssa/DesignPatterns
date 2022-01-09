package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.Orcamento;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto {
	
	public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5; 
	}

	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

}
