package net.jvcaussi.Aula01;

import net.jvcaussi.utils.Entrada;

public class Exerc02 {
    public static void main(String[] args) {
        int num = Entrada.leiaInt("Insira o número");

        int divisores = quantosDivisores(num);
        String parOuImpar = parOuImpar(num);
        String isPrimo = isPrimo(divisores);
        
        Entrada.leiaChar("Resultado:\n" +
                        "Divisores = " + divisores + "\n" +
                        parOuImpar + "\n" +
                        isPrimo, " ");
    }

    public static int quantosDivisores(int num){
        int divisores = 0;
        for (int i=1; i <= num; i++)
            if ((num % i) == 0) {
                divisores++;
            }
        return divisores;
    }

    public static String parOuImpar(int num){
        String resultado = "";
        if (num % 2 == 0){
            return resultado = "é par";
        }
        return resultado = "é ímpar";
    }

    public static String isPrimo(int divisores){
        String resultado = "";
        if (divisores > 2) {
            return resultado = "não é primo";
        }
        return resultado = "é primo";
    }
}
