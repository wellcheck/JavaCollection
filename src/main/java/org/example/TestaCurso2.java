package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando Coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
        javaColecoes.adiciona(new Aula("Criando Aula", 15));
        javaColecoes.adiciona(new Aula("Modelando coleções", 18));

        List<Aula> aulasImultaveis = javaColecoes.getAulas();
        System.out.println(aulasImultaveis);

        List<Aula> aulas = new ArrayList<>(aulasImultaveis);

        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(javaColecoes.getTempoTotal());
        System.out.println(javaColecoes);
    }
}
