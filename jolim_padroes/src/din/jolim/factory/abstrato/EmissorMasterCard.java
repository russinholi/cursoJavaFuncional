package din.jolim.factory.abstrato;

public class EmissorMasterCard implements Emissor {

	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando pelo MasterCard");
		System.out.println(mensagem);
	}

}
