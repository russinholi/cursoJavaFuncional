package codeit.curso.exercicio1;


public class GeradorJSON implements Runnable {
    private final String mensagem;

    public GeradorJSON(String mensagem) {
        this.mensagem = mensagem;
    }
    @Override
    public void run() {
        System.out.println("{'mensagem':'"+mensagem+"}");
    }
}
