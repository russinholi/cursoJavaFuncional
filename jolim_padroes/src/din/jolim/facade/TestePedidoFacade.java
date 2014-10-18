package din.jolim.facade;

public class TestePedidoFacade {

	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		Financeiro financeiro = new Financeiro();
		PosVenda posVenda = new PosVenda();
		
		PedidoFacade facade = new PedidoFacade(estoque,
				financeiro, posVenda);
		
		Pedido pedido = new Pedido("Bicicleta",
				"Siclano da Silva", 
				"Rua Algum Lugar, 212 - Jd. Qquer Coisa - Maringá - PR");
		
		facade.registrarPedido(pedido);

	}

}
