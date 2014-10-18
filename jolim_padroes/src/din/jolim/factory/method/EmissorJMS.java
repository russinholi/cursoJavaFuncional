package din.jolim.factory.method;

public class EmissorJMS implements Emissor {

	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando mensagem de JSM:");
		System.out.println(mensagem);
	}

}
