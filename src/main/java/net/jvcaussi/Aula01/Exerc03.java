package net.jvcaussi.Aula01;

import net.jvcaussi.util.Calculos;
import net.jvcaussi.util.Entrada;

public class Exerc03 {
    public static void main(String[] args) {
        int numA = Entrada.leiaInt("Insira o número A");
        int numB = Entrada.leiaInt("Insira o número B");

        boolean isPrimoRelativo = Calculos.isPrimoRelativo(numA, numB);

        if (isPrimoRelativo) {
            Entrada.leiaChar("Os números são primos relativos", " ");
        }
        else {
            Entrada.leiaChar("Os números não são primos relativos", " ");
        }
    } 

}
