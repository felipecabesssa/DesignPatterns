package br.com.alura.lojaDP;

import java.math.BigDecimal;

import br.com.alura.lojaDP.imposto.CalculadoraDeImpostos;
import br.com.alura.lojaDP.imposto.ICMS;
import br.com.alura.lojaDP.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		System.out.println(calculadora.calcular(orcamento, new ICMS()));

	}

}
