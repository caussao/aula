package net.jvcaussi.Radio;

import net.jvcaussi.util.Entrada;

public class RodarRadio {
    public static void main(String[] args) {
        
        boolean estado = false;
        double estacao = 0;
        int volume = 0;

        Radio radio = new Radio(boolean estado, double estacao, int volume);

        while (radio.estado == false) {
            estado = Entrada.leiaBoolean("você deseja ligar o rádio?");
        }

        while (estado == true) {
            mostrarMenu();
            if 
        }
        
    }
}
