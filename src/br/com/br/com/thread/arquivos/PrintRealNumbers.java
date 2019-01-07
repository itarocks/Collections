package br.com.br.com.thread.arquivos;

public class PrintRealNumbers implements Runnable {
    @Override
    public void run() {
        int numero = 1;
        while(numero <= 1000){
            Thread threadatual = Thread.currentThread();
            System.out.println(threadatual.getId() + " - " + numero);
            numero++;
        }

    }
}
