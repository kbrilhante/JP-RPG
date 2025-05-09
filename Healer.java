public class Healer extends Personagem {
    private int fatorCura;

    public Healer(String nome) {
        super(nome);
        this.maxMp = 180;
        this.fatorCura = 20;
        defineStats();
    }

    @Override
    public void digaNome() {
        System.out.println("++++ Eu sou " + nome + ", guardião do poder da cura e natureza! ++++");
    }

    @Override
    public void ataque() {
        System.out.println(nome + " acerta a cabeça do inimigo com seu cajado.");
    }

    public void curaGrupo() {
        System.out.println(nome + " cura o grupo em " + fatorCura + " hp.");
    }
}
