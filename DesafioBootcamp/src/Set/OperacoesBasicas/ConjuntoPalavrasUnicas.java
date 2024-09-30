package Set.OperacoesBasicas;

import java.util.Set;
import java.util.HashSet;;

public class ConjuntoPalavrasUnicas {
    Set<String> palavrasUnicas = new HashSet<>();

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraRemover = null;
        for (String p : palavrasUnicas) {
            if (p.equalsIgnoreCase(palavra)) {
                palavraRemover = p;
            }
            
        }
        palavrasUnicas.remove(palavraRemover);
    }

    public void verificarPalavra(String palavra) {
        boolean encontrada = false; // Variável para rastrear se a palavra foi encontrada
    
        for (String p : palavrasUnicas) {
            if (p.equalsIgnoreCase(palavra)) {
                System.out.println("A palavra está no conjunto: " + palavra);
                encontrada = true; // Marca como encontrada
                break; // Sai do loop
            }
        }
    
        if (!encontrada) {
            System.out.println("A palavra " + palavra + " não está no conjunto.");
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicas);
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas [palavrasUnicas=" + palavrasUnicas + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((palavrasUnicas == null) ? 0 : palavrasUnicas.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
        if (palavrasUnicas == null) {
            if (other.palavrasUnicas != null)
                return false;
        } else if (!palavrasUnicas.equals(other.palavrasUnicas))
            return false;
        return true;
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("Gato");
        conjuntoPalavrasUnicas.adicionarPalavra("Cachorro");
        conjuntoPalavrasUnicas.adicionarPalavra("Pássaro");
        conjuntoPalavrasUnicas.adicionarPalavra("Peixe");
        conjuntoPalavrasUnicas.adicionarPalavra("Coelho");
        conjuntoPalavrasUnicas.adicionarPalavra("Tigre");
        conjuntoPalavrasUnicas.adicionarPalavra("Leão");
        conjuntoPalavrasUnicas.adicionarPalavra("Elefante");
        conjuntoPalavrasUnicas.adicionarPalavra("Cavalo");
        conjuntoPalavrasUnicas.adicionarPalavra("Gato");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Cavalo");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("Gato");

    }
}

// adicionarPalavra(String palavra): Adiciona uma palavra ao conjunto.
// removerPalavra(String palavra): Remove uma palavra do conjunto.
// verificarPalavra(String palavra): Verifica se uma palavra está presente no
// conjunto.
// exibirPalavrasUnicas(): Exibe todas as palavras únicas do conjunto.
