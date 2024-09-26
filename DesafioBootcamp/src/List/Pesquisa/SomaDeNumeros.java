package List.Pesquisa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SomaDeNumeros {
    List<Integer> numerosInteiros = new ArrayList<>();
    Random random = new Random();

    // Tive a liberdade de alterar essa adição de numeros requisitada para que se
    // torne automatica
    public void adicionarNumero(int limiteDeInteiros, int limite) {
        for (int i = 0; i < limiteDeInteiros; i++) {
            int numero = random.nextInt(limite);
            numerosInteiros.add(numero);
        }

    }

    public int calcularSoma() {
        int totalValor = 0;
        for (int i = 0; i < numerosInteiros.size(); i++) {
            totalValor += numerosInteiros.get(i);
        }
        return totalValor;
    }

    public void encontrarMenorNumero() {
        Collections.sort(numerosInteiros);
        System.out.println("Menor numero : " + numerosInteiros.get(0));
    }

    public void encontrarMaiorNumero() {
        Collections.reverse(numerosInteiros);
        System.out.println("Maior Numero: " + numerosInteiros.get(0));
    }

    public void exibirNumeros(){
        Collections.sort(numerosInteiros);
        System.out.println(numerosInteiros);
    }

    public static void main(String[] args) {
        SomaDeNumeros somaDeNumeros = new SomaDeNumeros();

        somaDeNumeros.adicionarNumero(20, 100);

        System.out.println(somaDeNumeros.calcularSoma());
        somaDeNumeros.encontrarMenorNumero();
        somaDeNumeros.encontrarMaiorNumero();

        somaDeNumeros.exibirNumeros();

    }
}
