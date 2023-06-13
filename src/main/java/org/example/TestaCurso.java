package org.example;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

      List<Aula> aulas =  javaColecoes.getAulas();

        javaColecoes.adiciona(new Aula("Trabahando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando AUla", 15));
        javaColecoes.adiciona(new Aula("Modelando coleções", 30));
        System.out.println(aulas);

        System.out.println(javaColecoes.getAulas());

        System.out.println(javaColecoes.getTempoTotal());
    }
}
