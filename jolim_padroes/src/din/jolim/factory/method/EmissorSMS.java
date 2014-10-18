package din.jolim.factory.method;

public class EmissorSMS implements Emissor {

	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando mensagem de SMS:");
		System.out.println(mensagem);
		
	}

}
