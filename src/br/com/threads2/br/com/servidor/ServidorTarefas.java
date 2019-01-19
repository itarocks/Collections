package br.com.threads2.br.com.servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServidorTarefas {


    public static void main(String... args) throws IOException, InterruptedException {

        System.out.println("Iniciando o servidor");
        ServerSocket servidor = new ServerSocket(12345);
        ExecutorService threadPool = Executors.newFixedThreadPool(2); //pool com dois threads apenas

        while(true) {
            Socket socket = servidor.accept();
            System.out.println("Aceitando novo cliente na porta");
            DistribuirTarefas distribuirTarefas = new DistribuirTarefas(socket);
            threadPool.execute(distribuirTarefas); //novo
        }
    }

}
