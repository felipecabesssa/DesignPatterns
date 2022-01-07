package br.com.alura.lojaDP.desconto;

import java.math.BigDecimal;

import br.com.alura.lojaDP.orcamento.Orcamento;

public class SemDesconto extends Desconto{
	
	public SemDesconto() {
		super(null);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	public boolean deveAplicar(Orcamento orcamento) {
		return true;
	}

}
