public class Personagem {
    public String nome;
    public char classe;
    public int maxHp, maxMp;
    public int hp, mp;

    public Personagem(String nome, char classe) {
        this.nome = nome;
        this.classe = classe;
        this.maxHp = 100;
        this.maxMp = 100;
        this.hp = maxHp;
        this.mp = maxMp;
    }
}
