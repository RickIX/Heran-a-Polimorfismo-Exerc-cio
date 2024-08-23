package Exercicio01a04;

public class Preguica extends Animal {


    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A preguiça da esse gritinho: https://www.youtube.com/watch?v=ZUnEoyIBuxM");
    }


    public void subirEmArvores() {
        System.out.println("A preguiça está subindo na árvore.");
    }
}

