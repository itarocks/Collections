package br.com.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Curso {

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new Vector<Aula>();
    private List<Professores> professores = new ArrayList<Professores>();

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    //Qual a diferença de trabalhar com o List ou ArrayList
    //Usamos List para encapsular quem está dentro da lista
    //LinkedList ? O que é?

    // Array
    // Problema quando precisamos inserir elementos no meio do Array.

    public void adiciona(Aula aula ){
        this.aulas.add(aula);
    }
}
