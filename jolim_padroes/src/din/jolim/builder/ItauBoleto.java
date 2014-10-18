package din.jolim.builder;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ItauBoleto implements Boleto {
	
	private String sacado;
	private String cedente;
	private double valor;
	private Calendar vencimento;
	private int nossoNumero;
	
	public String getSacado() {
		return sacado;
	}
	public void setSacado(String sacado) {
		this.sacado = sacado;
	}
	public String getCedente() {
		return cedente;
	}
	public void setCedente(String cedente) {
		this.cedente = cedente;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Calendar getVencimento() {
		return vencimento;
	}
	public void setVencimento(Calendar vencimento) {
		this.vencimento = vencimento;
	}
	public int getNossoNumero() {
		return nossoNumero;
	}
	public void setNossoNumero(int nossoNumero) {
		this.nossoNumero = nossoNumero;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nosso Numero: "+nossoNumero);
		sb.append("\nSacado: "+ sacado);
		sb.append("\nCedente: "+ cedente);
		sb.append("\nValor: " + valor);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sb.append("\nVencimento: "+ sdf.format(vencimento.getTime()));
		return sb.toString();
	}
	
}
