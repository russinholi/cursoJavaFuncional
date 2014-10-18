package din.jolim.builder;

import java.util.Calendar;

public class ItauBoletoBuilder implements BoletoBuilder {
	private ItauBoleto boleto = new ItauBoleto();
	
	@Override
	public BoletoBuilder adicionarSacado(String sacado) {
		boleto.setSacado(sacado);
		return this;
	}

	@Override
	public BoletoBuilder adicionarCedente(String cedente) {
		boleto.setCedente(cedente);
		return this;
	}

	@Override
	public BoletoBuilder adicionarValor(double valor) {
		boleto.setValor(valor);
		return this;
	}

	@Override
	public BoletoBuilder adicionarVencimento(Calendar vencimento) {
		boleto.setVencimento(vencimento);
		return this;
	}

	@Override
	public Boleto build() {
		int nossoNumero = (int) Math.round(Math.random());
		boleto.setNossoNumero(nossoNumero);
		return boleto;
	}

}
