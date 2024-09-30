package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoItems;

    public CarrinhoDeCompras() {
        this.carrinhoItems = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoItems.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> removerItems = new ArrayList<>();
        for (Item i : carrinhoItems) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                removerItems.add(i);
            }
        }
        carrinhoItems.removeAll(removerItems);
    }

    public void calcularValorTotal() {
        int totalItems = 0;
        double valorTotalItems = 0.0;
        for (Item i : carrinhoItems) {
            totalItems += i.getQuantidade();
            valorTotalItems += i.getQuantidade() * i.getPreco();

        }
        System.out.println("Total de itens: " + totalItems);
        System.out.println("Valor total: " + valorTotalItems);

    }

    public void exibirItens(){
        System.out.println("Esses são todos os items do carrinho: \n " + carrinhoItems);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.adicionarItem("Manteiga", 5.80, 2);
        carrinhoDeCompras.adicionarItem("Manteiga", 5.80, 2);
        carrinhoDeCompras.adicionarItem("Carne", 70.80, 3);
        carrinhoDeCompras.adicionarItem("Bolacha", 12.20, 5);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("Manteiga");
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();

    }
    // adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao
    // carrinho com o nome, preço e quantidade especificados.
    // removerItem(String nome): Remove um item do carrinho com base no seu nome.
    // calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em
    // consideração o preço e a quantidade de cada item.
    // exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus
    // nomes, preços e quantidades.

}
