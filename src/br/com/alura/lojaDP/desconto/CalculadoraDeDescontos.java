package br.com.alura.lojaDP.desconto;

import java.math.BigDecimal;

import br.com.alura.lojaDP.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
						new SemDesconto()));		
				
		return desconto.calcular(orcamento);
	}

}
