package din.jolim.builder;

import java.util.Calendar;

public interface BoletoBuilder {
	BoletoBuilder adicionarSacado(String sacado);
	BoletoBuilder adicionarCedente(String cedente);
	BoletoBuilder adicionarValor(double valor);
	BoletoBuilder adicionarVencimento(Calendar vencimento);
	
	Boleto build();
}
