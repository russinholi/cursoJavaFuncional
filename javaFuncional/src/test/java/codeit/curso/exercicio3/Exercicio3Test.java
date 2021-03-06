/**
 * Copyright © 2014, Oracle and/or its affiliates. All rights reserved.
 *
 * JDK 8 MOOC Lesson 1 homework
 */
package codeit.curso.exercicio3;

import codeit.curso.exercicio2.Funcionario;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio3Test {

    /**
     * Exercício 1
     *
     * Criar uma string que contenha apenas a primeira letra de cada palavra da lista
     * Obs: Crie um acerte no final para validar o método
     */
    @Test
    public void exercicio1() {
        List<String> list = Arrays.asList(
                "bola", "onomatopéia", "tatu", "estalo");

    /* YOUR CODE HERE */
    }

    /**
     * Exercício 2
     *
     * Remover as palavras que tenham tamanho de 7 estalos, ops, 7 caracteres.
     * Obs: Crie um acerte no final para validar o método
     */
    @Test
    public void exercicio2() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "francisco", "lixo", "boteiro", "bueiro", "gavião"));

    /* YOUR CODE HERE */
    }

    /**
     * Exercicio 3
     *
     * Troque todas as palavras na lista por sua versão com todas as letras maiúsculas.
     */
    @Test
    public void exercicio3() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

    /* YOUR CODE HERE */
    }

    /**
     * Exercicio 4
     *
     * Troque a declaração que usa if no método gerarBoasVindas por uma expressão com Optional
     * de forma que o teste exercicio4 passe.
     * DICA: USE Option.of(valor) ou Option.ofNullable(valor) PARA CONVERTER UMA VALOR EM OPTIONAL
     *       Ex: Optional.of(funcionario)
     */
    @Test
    public void exercicio4() {
        String nome = "João Panelero";
        Assert.assertEquals("Bem vindo João Panelero", gerarBoasVindas(nome));
        Assert.assertEquals("Bem vindo Sem Nome", gerarBoasVindas(null));
    }

    private String gerarBoasVindas(String nome) {
        if (nome != null)
            return "Bem vindo "+nome;

        return "Bem vindo Sem Nome";
    }

    /**
     * Exercicio 5
     *
     * Altere o método imprimirNomeFuncionario por uma expressão com Optional
     * de forma que o teste exercicio5 rode.
     * DICA: USE Option.of(valor) ou Option.ofNullable(valor) PARA CONVERTER UMA VALOR EM OPTIONAL
     *       Ex: Optional.of(funcionario)
     */
    @Test
    public void exercicio5() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João Panelero");
        imprimirNomeFuncionario(funcionario);
        imprimirNomeFuncionario(null);
    }

    private void imprimirNomeFuncionario(Funcionario funcionario) {
           System.out.println(funcionario.getNome());
    }


    /**
     * Exercicio 6
     *
     * Troque a declaração que usa if no método filtrarFuncionario por uma expressão com Optional
     * de forma que o teste exercicio6 passe.
     * DICA: USE Option.of(valor) ou Option.ofNullable(valor) PARA CONVERTER UMA VALOR EM OPTIONAL
     *       Ex: Optional.of(funcionario)
     */
    @Test
    public void exercicio6() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Chico Motoqueiro");
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Francisco");
        Assert.assertEquals("Não achou", filtrarFuncionario(funcionario));
        Assert.assertEquals("Achou", filtrarFuncionario(funcionario2));
    }

    private String filtrarFuncionario(Funcionario funcionario) {
        if (funcionario.getNome().equals("Francisco"))
            return "Achou";
        return "Não achou";
    }

}
