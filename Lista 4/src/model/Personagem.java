package model;

abstract class Personagem {
    public abstract void atacar();
}

class Guerreiro extends Personagem {
    @Override
    public void atacar() {
        System.out.println("Guerreiro ataca com espada!");
    }
}

class Mago extends Personagem {
    @Override
    public void atacar() {
        System.out.println("Mago lança uma bola de fogo!");
    }
}

class Arqueiro extends Personagem {
    @Override
    public void atacar() {
        System.out.println("Arqueiro dispara uma flecha certeira!");
    }
}

