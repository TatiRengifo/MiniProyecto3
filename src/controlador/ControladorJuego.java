package controlador;
//--------------------------------------------------------------------------------
//Importaciones
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Juego;
import vista.VistaInterfaz;

public class ControladorJuego implements ActionListener{
    //--------------------------------------------------------------------------------
    //Variables 
    ArrayList<Juego> jugadas; //Lista para almacenar las jugadas posibles por el humano
    VistaInterfaz vista; //Variable para utilizar la interfaz
    Juego jugadaMaquina2 = new Juego(); //Creo un objeto de la clase juego para encontar la opcion de la maquina

    //--------------------------------------------------------------------------------
    //Metodos de la clase
    //Constructor 
    public ControladorJuego(ArrayList<Juego> jugadas, VistaInterfaz vista) { //Por parametros recibe la lista y la vista
        this.jugadas = jugadas;
        this.vista = vista;

    }

    public void mostrarInterfaz(){ //Funcion para mostrar la interfaz grafica
        vista.mostrarInterfaz(this);
    }

    //--------------------------------------------------------------------------------
    //actionPerformed donde esta la logica
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}

