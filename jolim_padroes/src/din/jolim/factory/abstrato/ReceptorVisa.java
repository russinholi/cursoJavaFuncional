package din.jolim.factory.abstrato;

public class ReceptorVisa implements Receptor {

	@Override
	public String receber() {
		String mensagem = "Receptor Visa";
		return mensagem;
	}
	
}
