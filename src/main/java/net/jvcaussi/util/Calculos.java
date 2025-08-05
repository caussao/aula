package net.jvcaussi.util;

public class Calculos {

    public static boolean validarTriangulo(double ladoA, double ladoB, double ladoC){
        boolean ok;

        if (ladoA + ladoB > ladoC &&
            ladoB + ladoC > ladoA &&
            ladoC + ladoA > ladoB &&
            ladoA > 0 && ladoB > 0 && ladoC > 0){
                return ok = true;
            }
        else {
            return ok = false;
        }
    }

    public static double calcularArea(double ladoA, double ladoB, double ladoC, double numS){
        double area = Math.sqrt(numS*(numS-ladoA) * (numS-ladoB) * (numS-ladoC));
        return area;
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

    public static int sort(int numA, int numB){
        if (numA > numB){
            return numB;
        }
        return numA;
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

    public static double encontrarMenor(double[] numeros) {
    double menor = numeros[0];
    for (int i = 1; i < numeros.length; i++) {
        if (numeros[i] < menor) {
            menor = numeros[i];
        }
    }
    return menor;
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

    public static double calcularMedia(double[] numeros) {
        double soma = calcularSoma(numeros);
        return soma / numeros.length;
    }

    public static double calcularSoma(double[] numeros) {
    double soma = 0;
    for (int i = 0; i < numeros.length; i++) {
        soma += numeros[i];
    }
    return soma;
    }
}
