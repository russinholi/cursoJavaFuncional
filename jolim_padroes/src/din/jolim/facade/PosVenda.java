package din.jolim.facade;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PosVenda {

	public void agendarContato(String cliente, String produto) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 30);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entrar em contato com o cliente "+
						cliente + " sobre o produto "+
						produto + " no dia "+
						sdf.format(calendar.getTime()));
		
	}
}
