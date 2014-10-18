package din.jolim.facade;

public class Pedido {
	
	private String produto;
	private String cliente;
	private String enderecoEntrega;
	
	public Pedido(String produto, String cliente,
			String enderecoEntrega) {
		this.produto = produto;
		this.cliente = cliente;
		this.enderecoEntrega = enderecoEntrega;
	}
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	
	
}
