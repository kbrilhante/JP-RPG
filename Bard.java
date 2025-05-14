

public class Bard extends Personagem {

    public Bard(String nome) {
        super(nome);
        maxHp = 90;
        maxMp = 150;
        defineStats();
    }

    @Override
    public void digaNome() {
        System.out.println("<<<~ Eu sou " + nome + ", compositor das melodias supremas. ~>>>");
    }

    @Override
    public void ataque() {
        System.out.println(nome + " canta uma canção para confundir seus inimigos.");
    }

    public void sing() {
        System.out.println(nome + " canta:\nNever gonna give you up\nNever gonna let you down\n. . .");
    }
}
