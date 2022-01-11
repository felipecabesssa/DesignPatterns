package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class ItemOrcamento {
	
	private BigDecimal valor;

	public ItemOrcamento(BigDecimal valor) {
		super();
		this.valor = valor;
	}
	
	public BigDecimal getValor() {
		return valor;
	}

}
