package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // atributo

    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }

        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorintervaloDeAnos = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorintervaloDeAnos.add(l);
                }
            }
        }
        return livrosPorintervaloDeAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        // livros gerados por IA
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        catalogoLivros.adicionarLivro("1984", "George Orwell", 1949);
        catalogoLivros.adicionarLivro("A Revolução dos Bichos", "George Orwell", 1945);
        catalogoLivros.adicionarLivro("Dom Casmurro", "Machado de Assis", 1899);
        catalogoLivros.adicionarLivro("A Moreninha", "Joaquim Manuel de Macedo", 1844);
        catalogoLivros.adicionarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        catalogoLivros.adicionarLivro("O Hobbit", "J.R.R. Tolkien", 1937);
        catalogoLivros.adicionarLivro("Cem Anos de Solidão", "Gabriel García Márquez", 1967);
        catalogoLivros.adicionarLivro("A Menina que Roubava Livros", "Markus Zusak", 2005);
        catalogoLivros.adicionarLivro("A Menina que Roubava Livros", "Markus Zusak", 2005);
        catalogoLivros.adicionarLivro("O Alquimista", "Paulo Coelho", 1988);
        catalogoLivros.adicionarLivro("A Culpa é das Estrelas", "John Green", 2012);
        catalogoLivros.adicionarLivro("O Código Da Vinci", "Dan Brown", 2003);
        catalogoLivros.adicionarLivro("Orgulho e Preconceito", "Jane Austen", 1813);
        catalogoLivros.adicionarLivro("Moby Dick", "Herman Melville", 1851);
        catalogoLivros.adicionarLivro("A Arte da Guerra", "Sun Tzu", -500);
        catalogoLivros.adicionarLivro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
        catalogoLivros.adicionarLivro("Harry Potter e a Câmara Secreta", "J.K. Rowling", 1998);
        catalogoLivros.adicionarLivro("O Senhor dos Anéis: As Duas Torres", "J.R.R. Tolkien", 1954);
        catalogoLivros.adicionarLivro("O Senhor dos Anéis: O Retorno do Rei", "J.R.R. Tolkien", 1955);
        catalogoLivros.adicionarLivro("A Rainha do Sul", "Arturo Pérez-Reverte", 2002);
        catalogoLivros.adicionarLivro("O Caçador de Pipas", "Khaled Hosseini", 2003);
        catalogoLivros.adicionarLivro("O Lobo de Wall Street", "Jordan Belfort", 2007);
        catalogoLivros.adicionarLivro("Sapiens: Uma Breve História da Humanidade", "Yuval Noah Harari", 2011);
        catalogoLivros.adicionarLivro("Como Fazer Amigos e Influenciar Pessoas", "Dale Carnegie", 1936);
        catalogoLivros.adicionarLivro("O Homem mais Rico da Babilônia", "George S. Clason", 1926);
        catalogoLivros.adicionarLivro("As Crônicas de Nárnia", "C.S. Lewis", 1950);
        // testes
        // System.out.println(catalogoLivros.pesquisarPorAutor("J.R.R. Tolkien"));

        // System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2003, 2012));

        // System.out.println(catalogoLivros.pesquisarPorTitulo("A Menina que Roubava
        // Livros"));
    }
}
