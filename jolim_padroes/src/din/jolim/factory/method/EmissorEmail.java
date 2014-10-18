package din.jolim.factory.method;

public class EmissorEmail implements Emissor {

	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando mensagem de Email:");
		System.out.println(mensagem);
		
	}

}
