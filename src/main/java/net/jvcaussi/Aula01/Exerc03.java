package net.jvcaussi.Aula01;

import net.jvcaussi.utils.Entrada;

public class Exerc03 {
    public static void main(String[] args) {
        int numA = Entrada.leiaInt("Insira o número A");
        int numB = Entrada.leiaInt("Insira o número B");

        boolean isPrimoRelativo = isPrimoRelativo(numA, numB);

        if (isPrimoRelativo) {
            Entrada.leiaChar("Os números são primos relativos", " ");
        }
        else {
            Entrada.leiaChar("Os números não são primos relativos", " ");
        }
    }

    public static boolean isPrimoRelativo(int numA, int numB){
        int soma = 0;
        int menor = sort(numA, numB);
        for (int i=1; i < menor; i++) {
            if ((numA % i == 0) && (numB % i == 0)){
                soma++;
            }
        }
        if (soma > 1){
            return false;
        } 
        return true; 
    }

    public static int sort(int numA, int numB){
        if (numA > numB){
            return numB;
        }
        return numA;
    }
}
