package net.jvcaussi.Aula01;

import net.jvcaussi.util.Calculos;
import net.jvcaussi.util.Entrada;

public class Exerc02 {
    public static void main(String[] args) {
        int num = Entrada.leiaInt("Insira o número");

        int divisores = Calculos.quantosDivisores(num);
        String parOuImpar = Calculos.parOuImpar(num);
        String isPrimo = Calculos.isPrimo(divisores);
        
        Entrada.leiaChar("Resultado:\n" +
                        "Divisores = " + divisores + "\n" +
                        parOuImpar + "\n" +
                        isPrimo, " ");
    }

}
