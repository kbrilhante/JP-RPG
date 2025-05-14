
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        char classe;
        boolean classeValida = false;
        ArrayList<Personagem> grupo = new ArrayList<>();
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Bem vindo, aventureiro! Qual é o seu nome?\n> ");
        nome = scan.nextLine();

        while (!classeValida) {
            System.out.print("Qual é a sua classe?\n(W - Warrior | M - Mage | H - Healer | B - Bard)\n> ");
            classe = scan.next().charAt(0);
            classe = Character.toUpperCase(classe);
            scan.nextLine();

            classeValida = true;
            switch(classe) {
                case 'W' -> grupo.add(new Warrior(nome));
                case 'M' -> grupo.add(new Mage(nome));
                case 'H' -> grupo.add(new Healer(nome));
                case 'B' -> grupo.add(new Bard(nome));
                default -> {
                    System.out.println("Essa não é uma classe válida.\nDigite novamente");
                    classeValida = false;
                }
            }
        }
        
        // grupo.add(new Personagem("Bob"));
        grupo.add(new Warrior("Carlos"));
        grupo.add(new Mage("Roxério"));
        grupo.add(new Healer("Cleudesvaldo"));
        grupo.add(new Bard("Fagner"));

        for (Personagem heroi : grupo) {
            heroi.fichaDoPersonagem();
        }
        System.out.println("-------------------------------------\n");
        for (Personagem heroi : grupo) {
            heroi.digaNome();
            heroi.ataque();
            if (heroi instanceof Healer healer) {
                healer.curaGrupo();                
            }
            if (heroi instanceof Bard rick) {
                rick.sing();                
            }
            System.out.println();
        }
        System.out.println("-------------------------------------\n");
    }
}


