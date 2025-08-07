package net.jvcaussi.Aula03;

import net.jvcaussi.util.Entrada;

public class mainTesteCarro {
    public static void main(String[] args) {
        
        String marca = Entrada.leiaString("marca do carro");
        String modelo = Entrada.leiaString("modelo do carro");
        int anoFabricacao = Entrada.leiaInt("ano de fabricação do carro");
        int anoModelo = Entrada.leiaInt("ano do modelo");
        double velocidade = 0;


        Carro carro = new Carro(marca, modelo, anoFabricacao, anoModelo, velocidade);


        carro.acelerar(Entrada.leiaDouble("acelerar novamente"));
        carro.frear(Entrada.leiaDouble("freiar"));

        System.out.println();
        System.out.println(carro.getVelocidade());

    }
}
