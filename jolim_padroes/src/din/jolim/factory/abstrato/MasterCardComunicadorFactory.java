package din.jolim.factory.abstrato;

public class MasterCardComunicadorFactory implements ComunicadorFactory {
	
	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();
	
	
	@Override
	public Emissor createEmissor() {
		return emissorCreator.create(TipoCartao.MASTERCARD);
	}

	@Override
	public Receptor createReceptor() {
		return receptorCreator.create(TipoCartao.MASTERCARD);
	}

}
