package org.example;

public class TEstaBuscaAlunosCurso {

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

        System.out.println("Quem é o aluno com matricula 659?");
       Aluno aluno = javaColecoes.buscaMatriculado(47659);
        System.out.println(aluno);
    }
}
