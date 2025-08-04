package net.jvcaussi.Aula01;

import net.jvcaussi.utils.Entrada;

public class Exerc01 {
    public static void main(String[] args) {
        double ladoA=0, ladoB=0, ladoC=0;
        boolean isTriangulo = false;

        while (isTriangulo == false) {
            ladoA = Entrada.leiaDouble("Insira o tamanho do lado A");
            ladoB = Entrada.leiaDouble("Insira o tamanho do lado B");
            ladoC = Entrada.leiaDouble("Insira o tamanho do lado C");
            
            if (ladoA + ladoB > ladoC &&
                ladoA + ladoC > ladoB &&
                ladoB + ladoC > ladoA) {
                isTriangulo = true;
                }
            else {
                Entrada.leiaChar("a área do triângulo não é válida, insira novamente", " ");
                }
            }
        
        double numS = ((ladoA + ladoB + ladoC) /2);

        double area = calcularArea(ladoA, ladoB, ladoC, numS);

        Entrada.leiaChar("a área do seu triângulo é "+area, " ");

    }

    public static double calcularArea(double ladoA, double ladoB, double ladoC, double numS){
        double area = Math.sqrt(numS*(numS-ladoA) * (numS-ladoB) * (numS-ladoC));
        return area;
    }

}
