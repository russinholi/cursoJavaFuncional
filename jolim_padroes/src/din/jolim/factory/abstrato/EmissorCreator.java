package din.jolim.factory.abstrato;

public class EmissorCreator {

	public Emissor create(TipoCartao tipo) {
		if (TipoCartao.VISA.equals(tipo)) {
			return new EmissorVisa();
		} else {
			return new EmissorMasterCard();
		}
	}
}
