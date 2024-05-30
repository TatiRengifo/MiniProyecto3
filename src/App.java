import java.util.ArrayList;

import controlador.ControladorJuego;
import modelo.Juego;
import vista.VistaInterfazGUI;
import vista.VistaInterfazTerminal;



public class App {
    public static void main(String[] args) throws Exception {
//--------------------------------------------------------------------------------
    //Creacion de las variables
        
        Juego piedra = new Juego("piedra");
        Juego papel = new Juego("papel");
        Juego tijera = new Juego("tijera");
        ArrayList<Juego> listaJuegos = new ArrayList<Juego>(); //Creo la lista
        //Adiciono los objetos a la lista
        listaJuegos.add(piedra);
        listaJuegos.add(papel);
        listaJuegos.add(tijera);

//--------------------------------------------------------------------------------
//Eleccion del juego


        //VistaInterfazGUI vista = new VistaInterfazGUI();
        VistaInterfazTerminal vista = new VistaInterfazTerminal();
        ControladorJuego controlador = new ControladorJuego(listaJuegos, vista);
        controlador.mostrarInterfaz();

    }
}


