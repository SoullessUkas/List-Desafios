import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {
    private Set<Contato> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        agendaContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(agendaContatos);
    }

    public Set<Contato> pesquisarPorNomes(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : agendaContatos) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }

        }

        return contatosPorNome;

    }

    public Contato atualizarNumeroContato(String nome, int numero) {
        Contato contatoAtualizado = null;
        for (Contato c : agendaContatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(numero);
                contatoAtualizado = c;
                System.out.println("Atualizado:" + contatoAtualizado);
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Ana Silva", 659937890);
        agendaContatos.adicionarContato("Ana Oliveira", 659937891);
        agendaContatos.adicionarContato("Carlos Santos", 659937890);
        agendaContatos.adicionarContato("Carlos Pereira", 659937892);
        agendaContatos.adicionarContato("Maria Costa", 659937893);
        agendaContatos.adicionarContato("Maria Lima", 659937890);
        agendaContatos.adicionarContato("João Souza", 659937894);
        agendaContatos.adicionarContato("João Almeida", 659937895);
        agendaContatos.adicionarContato("Luana Ferreira", 659937896);
        agendaContatos.adicionarContato("Luana Mendes", 659937890);
        // agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNomes("Ana"));

        agendaContatos.atualizarNumeroContato("Luana Mendes", 2);

        // agendaContatos.exibirContatos();

    }
}
// adicionarContato(String nome, int numero): Adiciona um contato à agenda.
// exibirContatos(): Exibe todos os contatos da agenda.
// pesquisarPorNome(String nome): Pesquisa contatos pelo nome e retorna uma
// conjunto com os contatos encontrados.
// atualizarNumeroContato(String nome, int novoNumero): Atualiza o número de
// telefone de um contato específico.