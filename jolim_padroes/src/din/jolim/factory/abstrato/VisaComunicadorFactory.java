package din.jolim.factory.abstrato;

public class VisaComunicadorFactory implements ComunicadorFactory  {
	private EmissorCreator emissorCreator = new EmissorCreator(); 
	private ReceptorCreator receptorCreator = new ReceptorCreator();

	@Override
	public Emissor createEmissor() {
		return emissorCreator.create(TipoCartao.VISA);
	}

	@Override
	public Receptor createReceptor() {
		return receptorCreator.create(TipoCartao.VISA);
	}

}
