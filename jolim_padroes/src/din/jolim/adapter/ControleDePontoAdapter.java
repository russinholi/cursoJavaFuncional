package din.jolim.adapter;

public class ControleDePontoAdapter extends ControleDePonto {
	
	private ControleDePontoNovo controleNovo;
	
	public ControleDePontoAdapter(){
		controleNovo = new ControleDePontoNovo();
	}
	
	@Override
	public void registrarEntrada(Funcionario funcionario) {
		controleNovo.registra(funcionario, Boolean.TRUE);
	}
	
	@Override
	public void registrarSaida(Funcionario funcionario) {
		controleNovo.registra(funcionario, Boolean.FALSE);
	}
}
