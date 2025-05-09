public class Mage extends Personagem {

    public Mage(String nome) {
        super(nome);
        this.maxHp = 80;
        this.maxMp = 200;
        defineStats();
    }

    @Override
    public void digaNome() {
        System.out.println("*~*~ Eu sou " + nome + ", mestre das foças arcanas! ~*~*");
    }

    @Override
    public void ataque() {
        System.out.println(nome + " não se importa com o tamanho da sala e lança uma bola de fogo!");
    }
}
