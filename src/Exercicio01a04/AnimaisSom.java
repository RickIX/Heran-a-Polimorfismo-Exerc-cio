package Exercicio01a04;

public class AnimaisSom {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Pitu", 5);
        Preguica preguica = new Preguica("Carlos", 3);
        Cavalo cavalo = new Cavalo("Carpeado", 15);

        Animal[] animals = {cachorro, preguica, cavalo};
        for (Animal animal : animals) {
            animal.emitirSom();
        }

        Veterinario veterinario = new Veterinario();
        veterinario.examinar(cachorro);
        veterinario.examinar(preguica);
        veterinario.examinar(cavalo);

        Zoologico zoologico = new Zoologico();
        zoologico.enjaular(cachorro, 0);
        zoologico.enjaular(preguica,1 );
        zoologico.enjaular(cavalo, 2);

        zoologico.percorrerJaulas();
    }
}
