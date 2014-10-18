package din.jolim.facade;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Estoque {
	
	public void enviarProduto(String produto,
			String enderecoEntrega) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 2);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("O produto "+ produto +
				" será entregue no endereço "+ enderecoEntrega +
				" no dia "+ sdf.format(calendar.getTime()));
		
	}
}
