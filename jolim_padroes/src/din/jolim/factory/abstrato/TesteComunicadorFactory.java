package din.jolim.factory.abstrato;

public class TesteComunicadorFactory {

	public static void main(String[] args) {
		ComunicadorFactory comunicadorFactory =
						new VisaComunicadorFactory();
		
		String transacao = "Valor=650,00;Senha=1234";
		Emissor emissor = comunicadorFactory.createEmissor();
		emissor.enviar(transacao);
		Receptor receptor = comunicadorFactory.createReceptor();
		String mensagem = receptor.receber();
		System.out.println(mensagem);
	}

}
