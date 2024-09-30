package List.Ordenacao;

//import java.util.ArrayList;
import java.util.Comparator;
//import java.util.List;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private Double altura;
    private int idade;

    public Pessoa(String nome, Double altura, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", altura=" + altura + ", idade=" + idade + "]\n";
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    
}
class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
       return Double.compare(p1.getAltura(), p2.getAltura());
    }
    
}
