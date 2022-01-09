package br.com.alura.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBD;

public class TestesPedidos {
	
	public static void main(String[] args) {
		String cliente = "CTIS";
		BigDecimal valorOrcamento = new BigDecimal("10000");
		int quantidadeItens = Integer.parseInt("1");
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarPedidoNoBD(),
				new EnviarEmailPedido()
				));
		handler.execute(gerador);
	}

}
