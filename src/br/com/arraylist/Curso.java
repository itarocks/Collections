package br.com.arraylist;

import java.util.*;

public class Curso {

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private List<Professores> professores = new ArrayList<Professores>();

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }


    //Qual a diferença de trabalhar com o List ou ArrayList
    //Usamos List para encapsular quem está dentro da lista
    //LinkedList ? O que é?

    // Array
    // Problema quando precisamos inserir elementos no meio do Array.

    public void adiciona(Aula aula ){

        this.aulas.add(aula);
    }

    public int getTempoTotal(){
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }
    @Override
    public String toString() {
        return "[Curso: " + this.getNome() + ", tempo total: " + this.getTempoTotal()
                + ", aulas: + " + this.aulas + "]";
    }
}
