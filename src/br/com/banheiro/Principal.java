package br.com.banheiro;

public class Principal {

    public static void main(String[] args) {
        Banheiro banheiro = new Banheiro();
        //Passando a tarefa e o nome do Thread
        Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "João");
        Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Pedro");
        //outros threads omitidos
        Thread limpeza = new Thread(new TarefaLimpeza(banheiro), "Limpeza");
        limpeza.setDaemon(true); //Lembrando que o método setDaemon(true) não substitui o start()

//inicialização dos outros threads omitida

        //Thread convidado3 = new Thread(new TarefaNumero1(banheiro), "Ariane");
        //Thread convidado4 = new Thread(new TarefaNumero2(banheiro), "Jennifer");

        convidado1.start();
        convidado2.start();
        limpeza.start();
        //convidado3.start();
        //convidado4.start();
    }
}
