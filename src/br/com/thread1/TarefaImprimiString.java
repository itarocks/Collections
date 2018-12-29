package br.com.thread1;

public class TarefaImprimiString implements Runnable {

    private String valorString;

    TarefaImprimiString(String valor){
        this.valorString = valor;
    }

    @Override
    public void run() {
        System.out.println("O valor da string " + valorString);
    }
}
