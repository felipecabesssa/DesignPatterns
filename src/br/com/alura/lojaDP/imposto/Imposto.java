package br.com.alura.lojaDP.imposto;

import java.math.BigDecimal;

import br.com.alura.lojaDP.orcamento.Orcamento;

public interface Imposto {
	
	BigDecimal calcular(Orcamento orcamento);

}
