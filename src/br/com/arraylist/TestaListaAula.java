package br.com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaAula {
    public static void main(String[] args) {

        Aula a1 = new Aula("Revisando as ArrayList", 21);
        Aula a2 = new Aula("Lista de objetos", 12);
        Aula a3 = new Aula("Relacionamento de lista e objetos", 14);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        System.out.println(aulas);
        //ele não sabe como ordenar
        //Collections.sort(aulas);

        System.out.println("itamar".compareTo("itamar"));

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo));

    }
}
