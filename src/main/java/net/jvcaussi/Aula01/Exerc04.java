package net.jvcaussi.Aula01;

import net.jvcaussi.util.Calculos;
import net.jvcaussi.util.Entrada;

public class Exerc04 {
    public static void main(String[] args) {
        double[] numeros = {10.3, 3.4, 4.6, 3.9, 12.5, 23.2, 9.8, 7.3, 31.3, 5.5};

        double soma = Calculos.calcularSoma(numeros);
        double media = Calculos.calcularMedia(numeros);
        double maior = Calculos.encontrarMaior(numeros);
        double menor = Calculos.encontrarMenor(numeros);

        Entrada.leiaChar("Resultado:\n" +
                        "Soma dos números: " + soma + "\n" +
                        "Média dos números: " + media + "\n" +
                        "Maior número: " + maior + "\n" +
                        "Menor número: " + menor, " ");
    }

}
