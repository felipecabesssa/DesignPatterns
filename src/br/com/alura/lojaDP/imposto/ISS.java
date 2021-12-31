package br.com.alura.lojaDP.imposto;

import java.math.BigDecimal;

import br.com.alura.lojaDP.orcamento.Orcamento;

public class ISS implements Imposto  {
	
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

}
