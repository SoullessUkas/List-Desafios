package List.Ordenacao;
//"Pessoa" como atributo. Cada pessoa possui atributos como nome, idade e altura. Implemente os seguintes métodos:

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas() {
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, double altura, int idade) {
        listaPessoas.add(new Pessoa(nome, altura, idade));

    }

    public List<Pessoa> OrdenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> OerdernarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Alice", 1.65, 28);
        ordenacaoPessoas.adicionarPessoa("Bruno", 1.80, 35);
        ordenacaoPessoas.adicionarPessoa("Carla", 1.70, 22);
        ordenacaoPessoas.adicionarPessoa("Daniel", 1.75, 30);
        ordenacaoPessoas.adicionarPessoa("Eduarda", 1.60, 26);
        ordenacaoPessoas.adicionarPessoa("Felipe", 1.85, 40);
        ordenacaoPessoas.adicionarPessoa("Gabriela", 1.68, 33);
        ordenacaoPessoas.adicionarPessoa("Hugo", 1.77, 29);
        ordenacaoPessoas.adicionarPessoa("Isabela", 1.62, 25);
        ordenacaoPessoas.adicionarPessoa("João", 1.90, 38);

        System.out.println(" Por idade \n ------------- \n" + ordenacaoPessoas.OrdenarPorIdade());
        System.out.println(" Por altura \n ------------- \n " + ordenacaoPessoas.OerdernarPorAltura());

    }
}
