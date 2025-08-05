package net.jvcaussi.Aula01;

import net.jvcaussi.util.Calculos;
import net.jvcaussi.util.Entrada;

public class Exerc01 {
    public static void main(String[] args) {
        double ladoA=0, ladoB=0, ladoC=0;
        boolean isTriangulo = false;

        while (isTriangulo == false) {
            ladoA = Entrada.leiaDouble("Insira o tamanho do lado A");
            ladoB = Entrada.leiaDouble("Insira o tamanho do lado B");
            ladoC = Entrada.leiaDouble("Insira o tamanho do lado C");
            
            if (Calculos.validarTriangulo(ladoA, ladoB, ladoC) == true){
                isTriangulo = true;
            }
            else {
                Entrada.leiaChar("a área do triângulo não é válida, insira novamente", " ");
                }
            }
        
        double numS = ((ladoA + ladoB + ladoC) /2);

        double area = Calculos.calcularArea(ladoA, ladoB, ladoC, numS);

        Entrada.leiaChar("a área do seu triângulo é "+area, " ");

    }

}
