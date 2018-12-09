package br.com.arraylist;

public class TesteAriane {

    public void exibirMensagem() {

        System.out.println("Ariane vai aprender programar");

    }

    public static void main(String... args){

        TesteAriane chamada = new TesteAriane();
        chamada.exibirMensagem();

        int a = 10;
        int b = 20;
        int c = 30;

        if(a > b){
           if(a > c){
               System.out.println("A é maior de todos");
           }
        }else
            if(b > c){
            System.out.println("B é maior de todos");
           }else{
              System.out.println("C é maior de todos");
            }

    }
}
