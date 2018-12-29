package br.com.arraylist;

public class TestaBuscaAlunoCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominanado as Colecoes do Java","Paulo Silveira");
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 21));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 21));

        Aluno a1 = new Aluno("Rodrigo Turini", 341313);
        Aluno a2 = new Aluno("Itamar Rocha", 313379);
        Aluno a3 = new Aluno("Pedro Henrique", 565756);

        javaColecoes.matriculaAluno(a1);
        javaColecoes.matriculaAluno(a2);
        javaColecoes.matriculaAluno(a3);

    }
}
