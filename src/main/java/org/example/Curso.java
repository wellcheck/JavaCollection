package org.example;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private int tempoTotal;
    private List<Aula> aulas = new LinkedList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public int getTempoTotal(){
//        int tempoTotal = 0;
//        for(Aula aula : aulas){
//            tempoTotal += aula.getTempo();
//        }

        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public void adiciona(Aula aula) {
       this.aulas.add(aula);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", instrutor='" + instrutor + '\'' +
                ", tempoTotal=" + getTempoTotal() +
                ", aulas=" + aulas +
                '}';
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos(){
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Curso curso = (Curso) o;

        if (tempoTotal != curso.tempoTotal) return false;
        if (!Objects.equals(nome, curso.nome)) return false;
        if (!Objects.equals(instrutor, curso.instrutor)) return false;
        if (!Objects.equals(aulas, curso.aulas)) return false;
        return Objects.equals(alunos, curso.alunos);
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (instrutor != null ? instrutor.hashCode() : 0);
        result = 31 * result + tempoTotal;
        result = 31 * result + (aulas != null ? aulas.hashCode() : 0);
        result = 31 * result + (alunos != null ? alunos.hashCode() : 0);
        return result;
    }

    public Aluno buscaMatriculado(int numero) {
        return matriculaParaAluno.get(numero);

    }
}
