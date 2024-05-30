package modelo;

import java.util.Random;

public class Juego {
    
    private String jugada; 

    private static final String[] OPCIONES = {"Piedra","Papel","Tijeras"};

    private Random random;

    public Juego(String jugada) {
        this.jugada = jugada;
    }

    public Juego(){
        random = new Random();
    }


    public String getJugada() {
        return jugada;
    }

    public void setJugada(String jugada) {
        this.jugada = jugada;
    }

    public String getOpciones() {
        return OPCIONES[random.nextInt(OPCIONES.length)];
    }
}
