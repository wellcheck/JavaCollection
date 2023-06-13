package org.example;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando Coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
        javaColecoes.adiciona(new Aula("Criando Aula", 15));
        javaColecoes.adiciona(new Aula("Modelando coleções", 18));

        Aluno a1 = new Aluno("Wellington Paixão", 47659);
        Aluno a2 = new Aluno("Melissa Paixão", 50179);
        Aluno a3 = new Aluno("Danilo Paixão", 45689);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os aluno matriculados.");

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> itaretor = alunos.iterator();
        while (itaretor.hasNext()){
            Aluno proximo = itaretor.next();
            System.out.println(proximo);
        }

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });
        System.out.println(javaColecoes.estaMatriculado(a1));

        String alunoProcurado = "Rodrigo Turini";
        Aluno turini = new Aluno("Wellington Paixão", 47659);
        System.out.println("E esse Turini, está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(turini));

        System.out.println(a1.equals(turini));

    }
}
