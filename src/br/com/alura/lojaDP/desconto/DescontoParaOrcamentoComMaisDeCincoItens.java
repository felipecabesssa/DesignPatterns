package br.com.alura.lojaDP.desconto;

import java.math.BigDecimal;

import br.com.alura.lojaDP.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto{
	
	public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
		
		
		return proximo.calcular(orcamento);
	}

	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}

}
