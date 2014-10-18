package din.jolim.adapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ControleDePonto {

	private SimpleDateFormat sdf =
			new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public void registrarEntrada(Funcionario funcionario) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("Funcionário [" + 
						funcionario.getNome() +
						"] entrou às " +
						sdf.format(calendar.getTime()));
	}
	
	public void registrarSaida(Funcionario funcionario) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("Funcionário [" + 
						funcionario.getNome() +
						"] saiu às " +
						sdf.format(calendar.getTime()));
	}
}
