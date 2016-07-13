package codeit.curso.exercicio2.solucao;

import codeit.curso.exercicio2.Funcionario;

import java.util.function.*;

public class GestorFuncionario {
    public void aplicarReajusteSalarial(Funcionario funcionario, Consumer<Funcionario> consumer) {
        consumer.accept(funcionario);
    }

    public void aplicarNomeCompleto(Funcionario funcionario, String nomeCompleto, BiConsumer<Funcionario, String> biconsumer) {
        biconsumer.accept(funcionario, nomeCompleto);
    }

    public String gerarNomeAleatorio(Supplier<String> supplier) {
        return supplier.get();
    }

    public String gerarJsonFuncionario(Funcionario funcionario, Function<Funcionario, String> function) {
        return function.apply(funcionario);
    }

    public Funcionario criarFuncionario(String nome, double salario, BiFunction<String, Double, Funcionario> bifunction) {
        return bifunction.apply(nome,salario);
    }

    public boolean isChefe(Funcionario funcionario, Predicate<Funcionario> predicate) {
        return predicate.test(funcionario);
    }
}
