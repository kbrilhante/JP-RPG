public class Personagem {
    protected String nome;
    // private char classe;
    protected int maxHp, maxMp;
    protected int hp, mp;
    protected Inventario inventario;

    public Personagem(String nome) {
        this.nome = nome;
        this.maxHp = 100;
        this.maxMp = 100;
        defineStats();

        this.inventario = new Inventario(8);
        defineInventario();
    }

    protected void defineStats() {
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
        System.out.println("HP: " + hp + "/" + maxHp);
        System.out.println("MP: " + mp + "/" + maxMp);
        inventario.listaItens();
        System.out.println();
    }

    public void pegaItem(Item item) {
        int naoAdicionado = inventario.addItem(item);
        if (naoAdicionado > 0) {
            System.out.println("Inventário cheio, você derrubou " + naoAdicionado + " itens no chão.");
        }
    }
}
