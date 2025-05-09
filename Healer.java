public class Healer extends Personagem{
    private int fatorCura;

    public Healer(String nome) {
        super(nome);
        this.maxMp = 180;
        this.fatorCura = 20;
        defineStats();
    }
    
    public void curaGrupo() {
        System.out.println(nome + " cura o grupo em " + fatorCura + " hp.");
    }
}
