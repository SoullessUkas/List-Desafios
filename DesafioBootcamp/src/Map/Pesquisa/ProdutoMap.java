package Map.Pesquisa;

import java.util.Comparator;

public class ProdutoMap {
private String nome;
private int quantidade;
private double preco;

public ProdutoMap(String nome, int quantidade, double preco) {
    this.nome = nome;
    this.quantidade = quantidade;
    this.preco = preco;
}
public String getNome() {
    return nome;
}
public int getQuantidade() {
    return quantidade;
}
public double getPreco() {
    return preco;
}
@Override
public String toString() {
    return "[nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]\n";
}

 
}


//long cod, String nome, int quantidade, double preco