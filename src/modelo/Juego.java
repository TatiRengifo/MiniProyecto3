package modelo;

import java.util.Random; //Importarcion de la libreria random

public class Juego {
//--------------------------------------------------------------------------------
    //Variables
        //Variable para la jugada del humano 
    private String jugada; 
        //Array para las opciones de la maquina
    private static final String[] OPCIONES = {"Piedra","Papel","Tijeras"};
        //Variable random para elegir una opcion aleatoria por la maquina
    private Random random;
//--------------------------------------------------------------------------------
    //Constructores de la clase
        //Constructor para la jugada Humano
    public Juego(String jugada) {
        this.jugada = jugada;
    }
        //Constructor para vacio para la jugada de la maquina
    public Juego(){
        random = new Random();
    }

//--------------------------------------------------------------------------------
    //Get y Set de la variable jugada
    public String getJugada() {
        return jugada;
    }

    public void setJugada(String jugada) {
        this.jugada = jugada;
    }
//--------------------------------------------------------------------------------
    //Funcion para encontrar la opcion de la maquina
    public String getOpciones() {
        return OPCIONES[random.nextInt(OPCIONES.length)];
    }
    
}
//--------------------------------------------------------------------------------