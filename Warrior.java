public class Warrior extends Personagem {

    public Warrior(String nome) {
        super(nome);
        this.maxHp = 150;
        this.maxMp = 50;
        defineStats();
    }

    @Override
    public void digaNome() {
        System.out.println(">>>> Eu sou " + nome + ", a fúria do machado <<<<");
    }

    @Override
    public void ataque() {
        System.out.println(nome + " ataca com seu machado poderoso e força sobrehumana.");
    }
}
