package br.com.br.com.thread.arquivos;

public class PrintNumbers {

    public static void main(String[] args) {
        Thread threadAssinaturas1 = new Thread(new PrintRealNumbers());
        Thread threadAssinaturas2 = new Thread(new PrintRealNumbers());
        threadAssinaturas1.start();
        threadAssinaturas2.start();
    }
}
