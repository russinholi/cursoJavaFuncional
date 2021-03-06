package codeit.curso.exercicio2;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileFilter;

public class Exercicio2Test {

    @Test
    public void testarInterfaceConsumer() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(1000.00);
        GestorFuncionario gestorFuncionario = new GestorFuncionario();
        /*
           Implementar o método aplicarReajusteSalarial, de forma que ele receba como parâmetro um funcionario
           e um lambda fazendo o cálculo do salario reajustando 10%
         */
        gestorFuncionario.aplicarReajusteSalarial();
        Assert.assertEquals(Double.valueOf(1100.00), funcionario.getSalario());
    }

    @Test
    public void testarInterfaceBiConsumer() {
        Funcionario funcionario = new Funcionario();

        GestorFuncionario gestorFuncionario = new GestorFuncionario();
        /*
           Implementar o método aplicarNomeCompleto, de forma que ele receba como parâmetro um funcionario,
           o nome completo e um lambda que atribua o nome completo ao nome do funcionario
         */
        gestorFuncionario.aplicarNomeCompleto();
        Assert.assertEquals("Sete Estalos", funcionario.getNome());
    }

    @Test
    public void testarInterfaceSupplier() {
        Funcionario funcionario = new Funcionario();

        GestorFuncionario gestorFuncionario = new GestorFuncionario();
        /*
           Implementar o método gerarNomeAleatorio, de forma que ele receba um lambda que chame o método gerarNome()
         */
        funcionario.setNome(gestorFuncionario.gerarNomeAleatorio());
        Assert.assertEquals("7E", funcionario.getNome());
    }

    private String gerarNome() {
        System.out.println("Gerando um nome 'aleatório'...");
        return "7E";
    }


    @Test
    public void testarInterfaceFunction() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Gilberto");
        funcionario.setSalario(1000.00);
        GestorFuncionario gestorFuncionario = new GestorFuncionario();
        /*
           Implementar o método gerarJsonFuncionario, de forma que ele receba um funcionario
           e um lambda que converta o funcionario numa String no formato JSON
         */

        Assert.assertEquals("{'nome':'Gilberto','salario':1000.00}",
                gestorFuncionario.gerarJsonFuncionario());
    }

    @Test
    public void testarInterfaceBiFunction() {
        GestorFuncionario gestorFuncionario = new GestorFuncionario();
        /*
           Implementar o método criarFuncionario, de forma que ele receba uma string com o nome,
           um double com o salário e um lambda que crie um novo funcionario setando os valores corretamente
         */
        Funcionario funcionario = gestorFuncionario.criarFuncionario();

        Assert.assertEquals("Jackson", funcionario.getNome());
        Assert.assertEquals(Double.valueOf(2000.00), funcionario.getSalario());
    }

    @Test
    public void testarInterfacePredicate() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("DDM");
        funcionario.setSalario(7000.00);
        GestorFuncionario gestorFuncionario = new GestorFuncionario();
        /*
           Implementar o método isChefe, de forma que ele receba um funcionario
           e um lambda que retorne verdadeiro caso o salário for maior que 5000.00
         */

        Assert.assertTrue(gestorFuncionario.isChefe());
    }

}
