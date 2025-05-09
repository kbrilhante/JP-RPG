
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        char classe;
        // ArrayList<Personagem> grupo = new ArrayList<>();
        Personagem heroi;
        

        Scanner scan = new Scanner(System.in);
        System.out.print("Bem vindo, aventureiro! Qual é o seu nome?\n> ");
        nome = scan.nextLine();

        System.out.print("Qual é a sua classe?\n(W - Warrior | M - Mage | H - Healer)\n> ");
        classe = scan.next().charAt(0);
        classe = Character.toUpperCase(classe);
        // scan.nextLine();

        switch(classe) {
            case 'W' -> heroi = new Warrior(nome);
            case 'M' -> heroi = new Mage(nome);
            case 'H' -> heroi = new Healer(nome);
            default -> {
                heroi = new Personagem(nome);
            }
        }
        
        Personagem bob = new Personagem("Bob");
        Warrior warrior = new Warrior("Carlos");
        Mage mage = new Mage("Roxério");
        Healer healer = new Healer("Cleudesvaldo");

        heroi.fichaDoPersonagem();
        bob.fichaDoPersonagem();
        warrior.fichaDoPersonagem();
        mage.fichaDoPersonagem();
        healer.fichaDoPersonagem();
        healer.curaGrupo();
        System.out.println();
    }
}


