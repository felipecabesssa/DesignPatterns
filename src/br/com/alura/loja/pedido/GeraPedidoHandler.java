package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.Orcamento;

public class GeraPedidoHandler {
	
	public void execute(GeraPedido dados) {
		
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		System.out.println("Salvar pedido no SGBD");
		System.out.println("Enviar email com dados no novo pedido");
		
	}

}
