package codeit.curso.exercicio1;

/**
 * Created by reginaldo on 01/06/16.
 */
public class GeradorMensagens {

    public static void main(String[] args) {
        new Thread(new GeradorHTML("Que mensagem linda!")).start();
        new Thread(new GeradorJSON("Outra mensagem maravilhosa!")).start();
    }

}
