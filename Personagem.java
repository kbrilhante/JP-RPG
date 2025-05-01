public class Personagem {
    private String nome;
    private char classe;
    private int maxHp, maxMp;
    private int hp, mp;
    private Inventario inventario;

    public Personagem(String nome, char classe) {
        this.nome = nome;
        this.classe = classe;

        defineStats();

        this.inventario = new Inventario(8);
        defineInventario();

        // remover depois
        this.hp -= 20;
        this.mp -= 30;
    }

    private void defineStats() {
        maxHp = 100;
        maxMp = 100;

        switch(classe) {
            case 'W':
                maxHp = 150;
                maxMp = 50;
                break;
            case 'M':
                maxHp = 80;
                maxMp = 200;
                break;
            case 'H':
                maxMp = 180;
                break;
            default:
                classe = '-';
        }

        hp = maxHp;
        mp = maxMp;
    }

    private void defineInventario() {
        // vamos voltar aqui
        inventario.addItem(new Item("Poção de cura", true, 10, 20));
        inventario.addItem(new Item("Poção de mana", true, 5, 20));
        inventario.addItem(new Item("Frigideira da vovó", false, 10, 10));
    }

    public void fichaDoPersonagem() {
        System.out.println("==== Ficha do Personagem ====");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("HP: " + hp + "/" + maxHp);
        System.out.println("MP: " + mp + "/" + maxMp);
        inventario.listaItens();
        System.out.println();
    }

    public void pegaItem(Item item) {
        inventario.addItem(item);
    }
}
