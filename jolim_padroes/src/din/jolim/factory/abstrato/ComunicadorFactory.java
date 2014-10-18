package din.jolim.factory.abstrato;

public interface ComunicadorFactory {
	Emissor createEmissor();
	Receptor createReceptor();
}
