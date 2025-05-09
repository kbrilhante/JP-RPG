public class Mage extends Personagem {

    public Mage(String nome) {
        super(nome);
        this.maxHp = 80;
        this.maxMp = 200;
        defineStats();
    }
    
}
