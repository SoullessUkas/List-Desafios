package Map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioSet;
    

    public Dicionario() {
        this.dicionarioSet = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioSet.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioSet.isEmpty()) {
            dicionarioSet.remove(palavra);

        }

    }

    public void exibirPalavras() {

        if (!dicionarioSet.isEmpty()) {
            System.out.println(dicionarioSet);
        }
    }

    public void pesquisarPorPalavra(String palavra) {
        String descricaoPalavra = null;
        if (!dicionarioSet.isEmpty()) {
            descricaoPalavra = dicionarioSet.get(palavra);
        }
        System.out.println("Descrição: " + descricaoPalavra);
    }

    @Override
    public String toString() {
        return "Dicionario [dicionarioSet=" + dicionarioSet + "]";
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Peixe", "Animal de escamas");
        dicionario.adicionarPalavra("Gato", "Animal doméstico felino");
        dicionario.adicionarPalavra("Cachorro", "Animal doméstico canino");
        dicionario.adicionarPalavra("Árvore", "Planta perene de tronco alto");
        dicionario.adicionarPalavra("Carro", "Veículo automotor com rodas");
        dicionario.adicionarPalavra("Computador", "Máquina para processar informações");
        dicionario.adicionarPalavra("Livro", "Conjunto de folhas impressas encadernadas");
        dicionario.adicionarPalavra("Mesa", "Móvel com superfície plana");
        dicionario.adicionarPalavra("Cadeira", "Assento com encosto e pernas");
        dicionario.adicionarPalavra("Sol", "Estrela central do sistema solar");

        dicionario.removerPalavra("Peixe");
        dicionario.pesquisarPorPalavra("Livro");

        dicionario.exibirPalavras();
    }

}

