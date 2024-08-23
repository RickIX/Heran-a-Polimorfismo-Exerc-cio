package Exercicio01a04;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }


    public void correr() {
        System.out.println("O cachorro está correndo.");
    }
}


