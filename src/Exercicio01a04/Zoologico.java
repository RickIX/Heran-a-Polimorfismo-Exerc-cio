package Exercicio01a04;

public class Zoologico {
    Animal[] jaulas = new Animal[10];

    public void enjaular(Animal animal, int index) {
        if (index >= 0 && index < jaulas.length) {
            jaulas[index] = animal;
        } else {
            System.out.println("Índice fora dos limites das jaulas.");
        }
    }
    public void percorrerJaulas(){
        for (Animal a : jaulas) {
            if (a != null) {
                a.emitirSom();
                if (a instanceof Cachorro) {
                    ((Cachorro) a).correr();
                } else if (a instanceof Cavalo) {
                    ((Cavalo) a).correr();
                }
            }
        }
    }

}
