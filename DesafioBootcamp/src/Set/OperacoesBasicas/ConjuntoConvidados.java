package Set.OperacoesBasicas;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + "convidados dentro do set de convidados \n");

        conjuntoConvidados.adicionarConvidado("Alice", 12345);
        conjuntoConvidados.adicionarConvidado("Bob", 67890);
        conjuntoConvidados.adicionarConvidado("Alice", 54321);
        conjuntoConvidados.adicionarConvidado("Charlie", 13579);
        conjuntoConvidados.adicionarConvidado("Diana", 24680);
        conjuntoConvidados.adicionarConvidado("Eve", 98765);
        conjuntoConvidados.adicionarConvidado("Bob", 11223);
        conjuntoConvidados.adicionarConvidado("Frank", 33445);
        conjuntoConvidados.adicionarConvidado("Grace", 55667);
        conjuntoConvidados.adicionarConvidado("Eve", 77889);
        conjuntoConvidados.adicionarConvidado("Eve", 77889);

        conjuntoConvidados.removerConvidadoPorCodigoConvite(11223);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do set de convidados");

        conjuntoConvidados.exibirConvidados();

    }

}
