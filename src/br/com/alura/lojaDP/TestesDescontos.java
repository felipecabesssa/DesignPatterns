package br.com.alura.lojaDP;

import java.math.BigDecimal;

import br.com.alura.lojaDP.desconto.CalculadoraDeDescontos;
import br.com.alura.lojaDP.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("200"), 4);
		
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(orcamento));

	}

}
