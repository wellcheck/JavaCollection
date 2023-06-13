package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Wellington Paixão");
        alunos.add("Danilo Paixão");
        alunos.add("Edna Paixão");
        alunos.add("Thays Paixão");
        alunos.add("Melissa Paixão");
        alunos.add("Bartira Paixão");

        boolean wellingtonMatriculado = alunos.contains("Wellington Paixão");
        System.out.println(wellingtonMatriculado);

        for (String aluno: alunos
             ) {
            System.out.println(aluno);
        }

        System.out.println(alunos);

        List<String> alunosEmLista = new ArrayList<>(alunos);

    }

}
