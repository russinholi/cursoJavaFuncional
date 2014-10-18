package din.jolim.factory.method;

public class EmissorCreator {

	public Emissor create(String tipo) {
		switch (tipo.toUpperCase()) {
		case "JMS": return new EmissorJMS();
		case "EMAIL": return new EmissorEmail();
		default: return new EmissorSMS();
		}
	}
}
