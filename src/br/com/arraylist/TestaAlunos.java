package br.com.arraylist;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String... args){
        //Collection esta acima na Hierarquia
        //Set<String> alunos = new HashSet<>();
        Set<String> alunos = new HashSet<>();
        alunos.add("Itamar Rocha");
        alunos.add("Pedro Henrique");
        alunos.add("Josimar da Rocha");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");
        System.out.println(alunos);

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });
    }

}
