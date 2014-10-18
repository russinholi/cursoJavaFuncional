package din.jolim.factory.abstrato;

public class EmissorVisa implements Emissor {

	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando pelo VISA");
		System.out.println(mensagem);
		
	}

}
