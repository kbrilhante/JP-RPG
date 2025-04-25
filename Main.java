
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
        // scan.nextLine();

        heroi = new Personagem(nome, classe);

        heroi.hp -= 20;
        heroi.mp -= 30;

        System.out.println("Nome: " + heroi.nome);
        System.out.println("Classe: " + heroi.classe);
        System.out.println("HP: " + heroi.hp + "/" + heroi.maxHp);
        System.out.println("MP: " + heroi.mp + "/" + heroi.maxMp);
    }
}
