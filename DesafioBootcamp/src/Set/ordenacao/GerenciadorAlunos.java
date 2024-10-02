package Set.ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> listaAlunos = new HashSet<>();

    private void adicionarAluno(String nome, Long matricula, double nota) {
        listaAlunos.add(new Aluno(nome, matricula, nota));
    }

    private void removerAluno(long matricula) {
        Aluno alunoRemover = null;
        for (Aluno a : listaAlunos) {
            if (a.getMatricula() == matricula) {
                alunoRemover = a;
                break;
            }
        }
        listaAlunos.remove(alunoRemover);
        System.out.println("Aluno: " + matricula + "removido da lista");
    }

    private void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(listaAlunos);
        System.out.println(alunosPorNome);
    }

    private void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparaPorNota());
        alunosPorNota.addAll(listaAlunos);
        System.out.println(alunosPorNota);

    }

    private void exibirAlunos() {
        System.out.println(listaAlunos);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Lucas", 144466L, 10.0);
        gerenciadorAlunos.adicionarAluno("Maria", 144467L, 9.5);
        gerenciadorAlunos.adicionarAluno("João", 144468L, 8.0);
        gerenciadorAlunos.adicionarAluno("Ana", 144469L, 9.0);
        gerenciadorAlunos.adicionarAluno("Pedro", 144470L, 7.5);
        gerenciadorAlunos.adicionarAluno("Luana", 144471L, 10.0);
        gerenciadorAlunos.adicionarAluno("Rafael", 144472L, 6.0);
        gerenciadorAlunos.adicionarAluno("Bianca", 144473L, 8.5);
        gerenciadorAlunos.adicionarAluno("Felipe", 144474L, 9.8);
        gerenciadorAlunos.adicionarAluno("Carla", 144475L, 7.2);
        //gerenciadorAlunos.exibirAlunos();
       //gerenciadorAlunos.exibirAlunosPorNome();
        //gerenciadorAlunos.exibirAlunosPorNota();
    }

}
