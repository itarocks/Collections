package br.com.thread1;

public class ImprimiString {
    public static void main(String[] args) {

        Runnable tarefaImprimiString = new TarefaImprimiString("Imprima");
        Thread threadMultiplicador = new Thread(tarefaImprimiString,"Parte da Multiplicacao");
        threadMultiplicador.start();
    }
}
