/**
 * Copyright © 2014, Oracle and/or its affiliates. All rights reserved.
 *
 * JDK 8 MOOC Lesson 1 homework
 */
package codeit.curso.exercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Exercicio3Test {

  /**
   * Exercício 1
   *
   * Criar uma string que contenha apenas a primeira letra de cada palavra da lista
   * Obs: Crie um acerte no final para validar o método
   */
  @Test
  public void exercise1() {
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
  public void exercise2() {
    List<String> list = new ArrayList<>(Arrays.asList(
        "antonio", "lixo", "boteiro", "bueiro", "gavião"));

    /* YOUR CODE HERE */
  }

  /**
   * Exercise 3
   *
   * Replace every word in the list with its upper case equivalent.
   */
  @Test
  public void exercise3() {
    List<String> list = new ArrayList<>(Arrays.asList(
        "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

    /* YOUR CODE HERE */
  }

  /**
   * Exercise 4
   *
   * Convert every key-value pair of the map into a string and append them all
   * into a single string, in iteration order.
   */
  @Test
  public void exercise4() {
    Map<String, Integer> map = new TreeMap<>();
    map.put("c", 3);
    map.put("b", 2);
    map.put("a", 1);

    /* YOUR CODE HERE */
  }

  /**
   * Exercise 5
   *
   * Create a new thread that prints the numbers from the list.
   */
  @Test
  public void exercise5() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    /* YOUR CODE HERE */
  }

}
