public class Item {
    private String nome;
    private boolean empilhavel;
    private int quantidade;
    private int tamanhoPilha;

    public Item(String nome, boolean empilhavel, int quantidade, int tamanhoPilha) {
        this.nome = nome;
        this.empilhavel = empilhavel;
        this.quantidade = empilhavel ? quantidade : 1;
        this.tamanhoPilha = empilhavel ? tamanhoPilha : 1;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getTamanhoPilha() {
        return tamanhoPilha;
    }

    public boolean isEmpilhavel() {
        return empilhavel;
    }

    public void addQuantidade (int quantidade) {
        this.quantidade = Math.min(tamanhoPilha, this.quantidade + quantidade);
    }
}
