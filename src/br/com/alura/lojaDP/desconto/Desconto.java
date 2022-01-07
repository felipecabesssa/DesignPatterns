package br.com.alura.lojaDP.desconto;

import java.math.BigDecimal;

import br.com.alura.lojaDP.orcamento.Orcamento;

public abstract class Desconto {
	
	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		super();
		this.proximo = proximo;
	}
	
	public BigDecimal efetuarCalculo(Orcamento orcamento);
	public abstract boolean deveAplicar(Orcamento orcamento);

}
