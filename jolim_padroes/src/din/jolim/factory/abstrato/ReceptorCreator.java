package din.jolim.factory.abstrato;

public class ReceptorCreator {

	public Receptor create(TipoCartao tipo) {
		if (TipoCartao.VISA.equals(tipo)) {
			return new ReceptorVisa();
		} else {
			return new ReceptorMastercard();
		}
	}
}
