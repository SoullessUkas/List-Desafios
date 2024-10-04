package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

import Map.Pesquisa.ProdutoMap;
import Set.ordenacao.Produto;

public class EstoqueProdutos {
    private Map<Long, ProdutoMap> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutoMap.put(cod, new ProdutoMap(nome, quantidade, preco));
    }

    private void exibirProdutos() {
        System.out.println(estoqueProdutoMap);
    }

    public void calcularValorTotalEstoque() {
        int valorCalculado = 0;
        if (!estoqueProdutoMap.isEmpty()) {
            for (ProdutoMap p : estoqueProdutoMap.values()) {
                valorCalculado += p.getPreco() * p.getQuantidade();

            }
            System.out.println("Valor total do estoque " + valorCalculado);
        }
    }

    public void obterProdutoMaisCaro() {
        ProdutoMap produtoMaximo = null;
        for (ProdutoMap produto : estoqueProdutoMap.values()) {
            if (produtoMaximo == null || produto.getPreco() > produtoMaximo.getPreco()) {
                produtoMaximo = produto;
            }
        }
        System.out.println("Produto mais caro : " + produtoMaximo);
    }

    public void obterProdutoMaisBarato() {
        ProdutoMap produtoBarato = null;
        for (ProdutoMap produto : estoqueProdutoMap.values()) {
            if (produtoBarato == null || produto.getPreco() < produtoBarato.getPreco()) {
                produtoBarato = produto;
            }
        }
        System.out.println("Produto mais barato : " + produtoBarato);
    }

    public void obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        ProdutoMap produtoMaiorQuantidade = null;
        for (ProdutoMap produto : estoqueProdutoMap.values()) {
            if (produtoMaiorQuantidade == null || produto.getQuantidade() > produtoMaiorQuantidade.getQuantidade()) {
                produtoMaiorQuantidade = produto;
            }
        }
        System.out.println("Produto que contem maior quantidade : " + produtoMaiorQuantidade);
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(1475627L, "Pão", 2, 14.2);
        estoqueProdutos.adicionarProduto(1445627L, "Hambúrguer", 4, 20.2);
        estoqueProdutos.adicionarProduto(1234567L, "Leite", 5, 3.5);
        estoqueProdutos.adicionarProduto(7654321L, "Queijo", 1, 25.0);
        estoqueProdutos.adicionarProduto(1112223L, "Maçã", 10, 1.2);
        estoqueProdutos.adicionarProduto(9876543L, "Arroz", 2, 12.5);
        estoqueProdutos.adicionarProduto(3334445L, "Feijão", 3, 10.0);
        estoqueProdutos.adicionarProduto(5556667L, "Açúcar", 5, 4.0);
        estoqueProdutos.adicionarProduto(8889990L, "Café", 1, 18.5);
        estoqueProdutos.adicionarProduto(4445558L, "Biscoito", 6, 7.3);

        estoqueProdutos.exibirProdutos();
        estoqueProdutos.calcularValorTotalEstoque();
        estoqueProdutos.obterProdutoMaisCaro();
        estoqueProdutos.obterProdutoMaisBarato();
        estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
    }
}

// adicionarProduto(long cod, String nome, int quantidade, double preco):
// Adiciona um produto ao estoque, juntamente com a quantidade disponível e o
// preço.
// exibirProdutos(): Exibe todos os produtos, suas quantidades em estoque e
// preços.
// calcularValorTotalEstoque(): Calcula e retorna o valor total do estoque,
// considerando a quantidade e o preço de cada produto.
/// obterProdutoMaisCaro(): Retorna o produto mais caro do estoque, ou seja,
// aquele com o maior preço.
// obterProdutoMaisBarato(): Retorna o produto mais barato do estoque, ou seja,
// aquele com o menor preço.
// obterProdutoMaiorQuantidadeValorTotalNoEstoque(): Retorna o produto que está
// em maior quantidade no estoque, considerando o valor total de cada produto
// (quantidade * preço).