package net.jvcaussi.Aula01;

import net.jvcaussi.utils.Entrada;

public class Exerc04 {
    public static void main(String[] args) {
        double[] numeros = {10.3, 3.4, 4.6, 3.9, 12.5, 23.2, 9.8, 7.3, 31.3, 5.5};

        double soma = calcularSoma(numeros);
        double media = calcularMedia(numeros);
        double maior = encontrarMaior(numeros);
        double menor = encontrarMenor(numeros);

        Entrada.leiaChar("Resultado:\n" +
                        "Soma dos números: " + soma + "\n" +
                        "Média dos números: " + media + "\n" +
                        "Maior número: " + maior + "\n" +
                        "Menor número: " + menor, " ");
    }

    public static double calcularSoma(double[] numeros) {
        double soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return soma;
    }

    public static double calcularMedia(double[] numeros) {
        double soma = calcularSoma(numeros);
        return soma / numeros.length;
    }

    public static double encontrarMaior(double[] numeros) {
        double maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }

    public static double encontrarMenor(double[] numeros) {
        double menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }
}
