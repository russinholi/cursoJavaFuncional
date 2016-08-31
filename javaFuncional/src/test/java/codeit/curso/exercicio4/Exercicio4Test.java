package codeit.curso.exercicio4;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Exercicio4Test {
    private static final String WORD_REGEXP = "[- .:,]+";

    private static final String ARQUIVO_EXEMPLO=ClassLoader.getSystemResource("exemplo.txt").getFile();

    /**
     * Exercício 1
     *
     * Criar uma nova lista com todas as strings convertidas para minuscula
     * e imprimi-las.
     */
    @Test 
    public void exercicio1() {
        List<String> list = Arrays.asList(
                "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");

        /* SEU CÓDIGO VAI AQUI */
    }

    /**
     * Exercício 2
     *
     * Criar e imprimir uma nova lista que contenha apenas
     * strings com tamanho ímpar.
     */
    @Test 
    public void exercicio2() {
        List<String> list = Arrays.asList(
                "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");

        /* SEU CÓDIGO VAI AQUI */
    }

    /**
     * Exercício 3
     *
     * Juntar a segunda, terceira e quarta strings da lista em uma única string,
     * onde cada palavra seja separada por hífem (-). Imprima o resultado.
     */
    @Test 
    public void exercicio3() {
        List<String> list = Arrays.asList(
                "The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");

        /* SEU CÓDIGO VAI AQUI */

    }

    /**
     * Conte o número de linhas do arquivo usando o BufferedReader provido
     */
    @Test 
    public void exercicio4() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get(ARQUIVO_EXEMPLO), StandardCharsets.UTF_8)) {
            /* SEU CÓDIGO VAI AQUI */

        }
    }

    /**
     * Usando o BufferedReader para acessar o arquivo, crie uma lista das palavras
     * únicas contídas no arquivo.  Imprima as palavras.
     *
     * DICA: Use a expressão regular declarada na constante WORD_REGEXP.
     */
    @Test
    public void exercicio5() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get(ARQUIVO_EXEMPLO), StandardCharsets.UTF_8)) {
            /* SEU CÓDIGO VAI AQUI */

        }
    }

    /**
     * Usando o BufferedReader, crie uma lista de palavras do arquivo,
     * convertidas para minúsculas e removendo as palavras duplicadas (somente deve haver uma palavra de cada),
     * ordenada pela ordem natura.  Imprima o conteúdo da lista.
     */
    @Test
    public void exercicio6() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get(ARQUIVO_EXEMPLO), StandardCharsets.UTF_8)) {
            /* SEU CÓDIGO VAI AQUI */

        }
    }

    /**
     * Modifique o exercicio6 de maneira que as palavras seja ordenadas pelo tamanho
     */
    @Test
    public void exercicio7() throws IOException {
        StringReader sr = new StringReader("");

        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get(ARQUIVO_EXEMPLO), StandardCharsets.UTF_8)) {
            /* SEU CÓDIGO VAI AQUI */

        }
    }
    
}
