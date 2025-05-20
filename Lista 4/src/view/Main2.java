package view;
import model.Personagem;
public class Main2 {
    public static void main(String[] args) {
        // Criando personagens de forma polimórfica
        Personagem p1 = new Guerreiro();
        Personagem p2 = new Mago();
        Personagem p3 = new Arqueiro();

        // Simulando um turno de combate
        System.out.println("=== Turno de combate ===");
        p1.atacar();
        p2.atacar();
        p3.atacar();
    }
}
