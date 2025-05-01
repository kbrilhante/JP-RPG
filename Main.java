
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        char classe;
        Personagem heroi;

        Scanner scan = new Scanner(System.in);
        System.out.print("Bem vindo, aventureiro! Qual é o seu nome?\n> ");
        nome = scan.nextLine();

        System.out.print("Qual é a sua classe?\n(W - Warrior | M - Mage | H - Healer)\n> ");
        classe = scan.next().charAt(0);
        classe = Character.toUpperCase(classe);
        // scan.nextLine();

        heroi = new Personagem(nome, classe);

        heroi.pegaItem(new Item("Poção de cura", true, 17, 20));
        heroi.pegaItem(new Item("Poção de cura", true, 5, 20));
        heroi.pegaItem(new Item("Poção de cura", true, 5, 20));
        heroi.pegaItem(new Item("Poção de cura", true, 5, 20));
        heroi.pegaItem(new Item("Poção de cura", true, 5, 20));
        heroi.pegaItem(new Item("Poção de cura", true, 5, 20));
        heroi.pegaItem(new Item("Poção de cura", true, 5, 20));
        heroi.pegaItem(new Item("Poção de cura", true, 5, 20));
        heroi.pegaItem(new Item("Poção de cura", true, 5, 20));
        heroi.pegaItem(new Item("Poção de cura", true, 5, 20));
        heroi.pegaItem(new Item("Poção de cura", true, 5, 20));
        heroi.pegaItem(new Item("Poção de cura", true, 5, 20));
        heroi.pegaItem(new Item("Poção de cura", true, 5, 20));
        heroi.pegaItem(new Item("Poção de cura", true, 5, 20));


        heroi.fichaDoPersonagem();
    }
}
