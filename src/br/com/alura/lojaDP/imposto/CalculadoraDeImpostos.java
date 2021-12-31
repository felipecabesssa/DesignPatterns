package br.com.alura.lojaDP.imposto;

import java.math.BigDecimal;

import br.com.alura.lojaDP.orcamento.Orcamento;

public class CalculadoraDeImpostos {
	
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);		
	}

}
