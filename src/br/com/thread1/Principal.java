package br.com.thread1;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("O main já é um Thread");
        Thread.sleep(30000);
    }
}
