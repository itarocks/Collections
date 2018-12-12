package br.com.arraylist;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominanado as Colecoes do Java","Paulo Silveira");
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 21));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 21));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);
        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);
        System.out.println(aulasImutaveis);

        System.out.println(javaColecoes);


    }
}
