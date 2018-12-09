package br.com.arraylist;

import java.util.List;

public class TestaCurso {

    public static void main(String... args){
        Curso javaColecoes = new Curso("Dominando as colecoes","Itamar");
        //List<Aula> aulas = javaColecoes.getAulas();
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 21));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 21));

        System.out.println(javaColecoes.getAulas());
    }
}
