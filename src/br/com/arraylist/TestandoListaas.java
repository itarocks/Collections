package br.com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListaas {

    public static void main(String[] args) {
        ArrayList<String> aulas = new ArrayList<>();
        aulas.add("Itamar");
        Collections.sort(aulas);
        aulas.forEach(aula ->  System.out.println(aula));
    }
}
