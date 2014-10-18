package din.jolim.adapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ControleDePontoNovo {
	
	private SimpleDateFormat sdf = 
			new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public void registra(Funcionario funcionario, boolean entrada) {
		Calendar calendar = Calendar.getInstance();
		String acao = "saiu";
		if (entrada) {
			acao = "entrou";
		}
		System.out.println("(Novo) Funcionário [" + 
						funcionario.getNome() +
						"] "+ acao +" às " +
						sdf.format(calendar.getTime()));
	}
}
