package din.jolim.builder;

import java.util.Calendar;

public class TesteBuilder {

	public static void main(String[] args) {
		BoletoBuilder builder = new ItauBoletoBuilder();
		
		builder.adicionarSacado("Fulano")
			.adicionarValor(200.00)
			.adicionarVencimento(Calendar.getInstance());
		
		Boleto boleto = builder.build();
		System.out.println(boleto);		
	}

}
