package br.com.alura.lojaDP.desconto;

import java.math.BigDecimal;

import br.com.alura.lojaDP.orcamento.Orcamento;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto{
	
	public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	
		
		return proximo.calcular(orcamento);

	public boolean deveAplicar(Orcamento orcamento) {
		if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0);
		return false;
	}

}
