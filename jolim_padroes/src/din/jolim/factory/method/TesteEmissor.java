package din.jolim.factory.method;

public class TesteEmissor {

	public static void main(String[] args) {
		EmissorCreator creator = new EmissorCreator();
		Emissor emissor = creator.create(args[0]);
		emissor.enviar("X Jolim");

	}

}
