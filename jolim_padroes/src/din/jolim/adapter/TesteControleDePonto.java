package din.jolim.adapter;

public class TesteControleDePonto {
	
	public static void main(String[] args) throws InterruptedException {
		ControleDePonto controle = criarControle(args[0]);
		Funcionario funcionario = new Funcionario("Fulano de Tal");
		controle.registrarEntrada(funcionario);
		Thread.sleep(10000);
		controle.registrarSaida(funcionario);
	}

	private static ControleDePonto criarControle(String tipo) {
		if ("novo".equals(tipo)) {
			return new ControleDePontoAdapter();
		}
		return new ControleDePonto();
	}
}
