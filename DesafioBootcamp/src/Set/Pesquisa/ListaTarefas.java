import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }

    private void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao, false));
    }

    private void removerTarefa(String descricao) {
        Tarefa tarefaRemover = null;
        for (Tarefa t : listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaRemover = t;
                break;
            }
        }
        listaTarefas.remove(tarefaRemover);
    }

    private void exibirTarefas() {
        System.out.println(listaTarefas);
    }

    private int contarTarefas() {
        return listaTarefas.size();
    }

    private void marcarTarefaConcluida(String descricao) {
        Tarefa tarefaConcluida = null;
        for (Tarefa t : listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
                System.out.println("Tarefa " + descricao + " concluida: " + t.isConcluida());
            }
        }
    }

    private void marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendente = null;
        for (Tarefa t : listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(false);
                System.out.println("Tarefa " + descricao + " pendente: " + t.isConcluida());
            }
        }
    }

    private Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : listaTarefas) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);

            }
        }
        System.out.println(" Tarefas Concluidas : \n" + tarefasConcluidas);
        return tarefasConcluidas;
    }

    private Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : listaTarefas) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);

            }
        }
        System.out.println(" Tarefas Pendentes : \n" + tarefasPendentes);
        return tarefasPendentes;
    }

    private void limparListaTarefas() {
        listaTarefas.removeAll(listaTarefas);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Limpar");
        listaTarefas.adicionarTarefa("Escovar");
        listaTarefas.adicionarTarefa("Cozinhar");
        listaTarefas.adicionarTarefa("Fixar");
       // listaTarefas.exibirTarefas();
        // listaTarefas.removerTarefa("Cozinhar");
        // listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.contarTarefas());
        listaTarefas.marcarTarefaConcluida("Limpar");
        listaTarefas.marcarTarefaConcluida("Fixar");
        listaTarefas.marcarTarefaConcluida("Escovar");

        //listaTarefas.obterTarefasConcluidas();
        //listaTarefas.obterTarefasPendentes();

        listaTarefas.removerTarefa("Escovar");
        listaTarefas.marcarTarefaPendente("Limpar");
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
