package modelo;

import java.util.Random;

public class Juego {
    
    private static final String[] OPCIONES = {"Piedra","Papel","Tijeras"};

    private Random random;

    public Juego(){
        random = new Random();
    }

    public String getOpciones() {
        return OPCIONES[random.nextInt(OPCIONES.length)];
    }
}
