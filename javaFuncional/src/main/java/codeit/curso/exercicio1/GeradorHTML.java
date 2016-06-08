package codeit.curso.exercicio1;


public class GeradorHTML implements Runnable {
    private final String mensagem;

    public GeradorHTML(String mensagem) {
        this.mensagem = mensagem;
    }
    @Override
    public void run() {
        System.out.println("<html><body>"+mensagem+"</body></html");
    }
}
