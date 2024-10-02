package Set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtos.add(new Produto(nome, codigo, preco, quantidade));
    }

    public void exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtos);
        System.out.println(produtosPorNome);
    }

    public void exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorProdutoPreco());
        produtosPorPreco.addAll(produtos);
        System.out.println(produtosPorPreco);
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(144457, "Coca", 8.70, 2);
        cadastroProdutos.adicionarProduto(144458, "Pepsi", 8.50, 3);
        cadastroProdutos.adicionarProduto(144459, "Fanta", 7.90, 5);
        cadastroProdutos.adicionarProduto(144460, "Sprite", 8.00, 4);
        cadastroProdutos.adicionarProduto(144461, "Guaraná", 7.50, 6);
        cadastroProdutos.adicionarProduto(144462, "Schweppes", 9.00, 1);
        cadastroProdutos.adicionarProduto(144463, "H2O", 5.00, 10);
        cadastroProdutos.adicionarProduto(144464, "Monster", 12.00, 2);
        cadastroProdutos.adicionarProduto(144465, "Red Bull", 15.00, 3);
        cadastroProdutos.adicionarProduto(144466, "Cerveja", 10.00, 4);
        cadastroProdutos.adicionarProduto(144467, "Vinho", 30.00, 1);
        
        cadastroProdutos.exibirProdutosPorNome();
        cadastroProdutos.exibirProdutosPorPreco();

    }
}
