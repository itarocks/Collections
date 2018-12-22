package br.com.arraylist;

public class TestaCursoComAluno {
    public static void main(String... args){
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

        System.out.println("Todos os alunos matriculados");
        javaColecoes.getAlunos().forEach(a -> System.out.println(a));
        System.out.println("O aluno " + a1.getNome() + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno turini = new Aluno("Rodrigo Turini",34672);
        System.out.println("E esse turini esta matriculado?");
        System.out.println(javaColecoes.estaMatriculado(turini));

        System.out.println("O a1 é equals ao Turini?");
        System.out.println(a1.equals(turini));

    }
}
