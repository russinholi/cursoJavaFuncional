package din.jolim.factory.abstrato;

public class ReceptorMastercard implements Receptor {

	@Override
	public String receber() {
		String mensagem = "Receptor MasterCard";
		return mensagem;
	}

}
