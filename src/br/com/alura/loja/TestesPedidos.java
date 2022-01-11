package br.com.alura.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acoes.EnviarEmailPedido;
import br.com.alura.loja.pedido.acoes.LogDePedido;
import br.com.alura.loja.pedido.acoes.SalvarPedidoNoBD;

public class TestesPedidos {
	
	public static void main(String[] args) {
		String cliente = "CTIS";
		BigDecimal valorOrcamento = new BigDecimal("10000");
		int quantidadeItens = Integer.parseInt("1");
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(
				new SalvarPedidoNoBD(),
				new EnviarEmailPedido(),
				new LogDePedido()
				));
		
		handler.execute(gerador);
	}
	
	//Exemplo de como seria fazer uma transferencia sem o m�todo estar "escondido" assim como o m�todo execute()
	Conta minhaConta = new Conta();
	Conta outra = new Conta();
	
	BigDecimal valorTransferencia = new BigDecimal (�100�);
	Transferencia transferencia = new Transferencia();
	
	transferencia.validarConta(minhaConta);
	transferencia.validarConta(outra);
	transferencia.checarSaldo(minhaConta);
	
	transferencia.executar(minhaConta, outra, valorTransferencia);
	
	//isolando em classes externas com suas regras de negocio e usando o padr�o Facade, ficaria assim:
	transferencia.executar(minhaConta, outra, valorTransferencia);

}
