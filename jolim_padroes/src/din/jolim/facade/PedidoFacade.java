package din.jolim.facade;

public class PedidoFacade {
	private Estoque estoque;
	private Financeiro financeiro;
	private PosVenda posVenda;
	
	public PedidoFacade(Estoque estoque, Financeiro financeiro,
			PosVenda posVenda) {
		this.estoque = estoque;
		this.financeiro = financeiro;
		this.posVenda = posVenda;
	}
	
	public void registrarPedido(Pedido pedido) {
		estoque.enviarProduto(pedido.getProduto(), 
				pedido.getEnderecoEntrega());
		
		financeiro.faturar(pedido.getCliente(),
				pedido.getProduto());
		
		posVenda.agendarContato(pedido.getCliente(),
				pedido.getProduto());
	}
}
