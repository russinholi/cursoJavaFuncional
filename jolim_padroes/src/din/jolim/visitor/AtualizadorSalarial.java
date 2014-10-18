package din.jolim.visitor;

public class AtualizadorSalarial implements AtualizadorFuncionario {

	@Override
	public void atualizar(Gerente gerente) {
		gerente.setSalario(gerente.getSalario() * 1.43);
	}

	@Override
	public void atualizar(Telefonista telefonista) {
		telefonista.setSalario(telefonista.getSalario() * 1.27);
	}

}
