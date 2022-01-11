package br.com.alura.loja.pedido.acoes;

import br.com.alura.loja.pedido.Pedido;

public class SalvarPedidoNoBD implements AcaoAposGerarPedido{
	
	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando no banco de dados");
	}

}
