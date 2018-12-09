package br.com.arraylist;

public class TestaCurso2 {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominanado as Colecoes do Java","Paulo Silveira");
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 21));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 21));
        
    }
}
