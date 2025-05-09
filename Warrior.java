public class Warrior extends Personagem {

    public Warrior(String nome) {
        super(nome);
        this.maxHp = 150;
        this.maxMp = 50;
        defineStats();
    }
    
}
