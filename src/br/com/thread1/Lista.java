package br.com.thread1;

public class Lista {

    private String[] elementos = new String[1000];
    private int indice = 0;

    public synchronized void adicionaElementos(String elemento){
        this.elementos[indice] = elemento;
        this.indice++;
        try{
            Thread.sleep(10);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        if(this.indice == this.tamanho()){
            System.out.println("Lista tá cheia, notificando");
            this.notifyAll();
        }
    }
    public int tamanho(){
        return this.elementos.length;
    }

    public String pegaElemento(int posicao){
        return this.elementos[posicao];
    }
}
