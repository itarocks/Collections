package br.com.arraylist;

public class Aula implements  Comparable<Aula> {

    private String titulo;
    private int tempo;

    @Override
    public String toString(){
        return "[Aula: " + this.titulo + " " + this.tempo + " minutos ";
    }

    public Aula(String titulo, int tempo){
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }
    public int getTempo() {
        return tempo;
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);
    }
}
