import java.util.ArrayList;

public class Inventario {
    private int capacidade;
    private ArrayList<Item> itens;

    public Inventario(int capacidade) {
        this.capacidade = capacidade;
        this.itens = new ArrayList<>();
    }

    public void listaItens() {
        if (itens.size() == 0) {
            System.out.println("Inventário vazio");
            return;
        }
        System.out.println("Inventário:");
        for (Item item : itens) {
            System.out.println("- " + item.getNome() + ": " + item.getQuantidade());
        }
    }

    public int addItem(Item item) {
        // vamos retornar quantos itens não foram adicionados ao invetário
        int excedente = item.getQuantidade();
        for (Item itemInvetario : itens) {
            if (itemInvetario.getNome().equals(item.getNome()) && item.isEmpilhavel()){
                int podeAdicionar = itemInvetario.getTamanhoPilha() - itemInvetario.getQuantidade();
                if (podeAdicionar > 0) {
                    int add = Math.min(podeAdicionar, excedente);
                    itemInvetario.addQuantidade(add);
                    excedente -= add;
                    if (excedente == 0) {
                        return 0;
                    }
                }
            }
        }
        if (itens.size() < capacidade) {
            itens.add(new Item(item.getNome(), item.isEmpilhavel(), excedente, item.getTamanhoPilha()));
            return 0;
        }
        return excedente;
    }
}
