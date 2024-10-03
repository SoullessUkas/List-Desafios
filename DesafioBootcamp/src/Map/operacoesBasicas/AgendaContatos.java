package Map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);

        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public void pesquisarPorNome(String nome) {
        Integer numeroTelefone = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroTelefone = agendaContatoMap.get(nome);
        }
        System.out.println(" numero " + numeroTelefone);

    }

    @Override
    public String toString() {
        return "AgendaContatos [agendaContatoMap=" + agendaContatoMap + "]";
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Lucas", 659984756);
        agendaContatos.adicionarContato("Ana", 659876543);
        agendaContatos.adicionarContato("Carlos", 659123456);
        agendaContatos.adicionarContato("Maria", 659654321);
        agendaContatos.adicionarContato("João", 659789012);
        agendaContatos.adicionarContato("Fernanda", 659345678);
        agendaContatos.adicionarContato("Ricardo", 659456789);
        agendaContatos.adicionarContato("Juliana", 659234567);
        agendaContatos.adicionarContato("Roberto", 659678901);
        agendaContatos.adicionarContato("Patrícia", 659890123);

       
        agendaContatos.removerContato("Lucas");
        agendaContatos.pesquisarPorNome("Ricardo");
        agendaContatos.exibirContatos();
    }
}
