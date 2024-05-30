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
    public void actionPerformed(ActionEvent e) { //Recibe el evento, en este caso seria el boton "Iniciar Juego"
        String jugadaMaquina = jugadaMaquina2.getOpcionAleatoria(); // Encontramos la jugada de la maquina
        String jugada = vista.getJugada(); //Capturamos la jugada del humano 
        for(int i = 0; i < jugadas.size(); i++){ //Hacemos un for del tamaño de la lista
            if(jugadas.get(i).getJugada().equals(jugada)){ //Verificamos que la jugadaHumano sea correcta (piedra,papel,tijera)
                if(jugada.equals(jugadaMaquina)){ //Comparacion para el empate
                    vista.mostrarResultadoJuego("Empate" + " (Tu: " + jugada + ", Máquina: " + jugadaMaquina + ")");
                } else if((jugada.equals("piedra") && jugadaMaquina.equals("tijera")) ||
                (jugada.equals("papel") && jugadaMaquina.equals("piedra")) ||
                (jugada.equals("tijera") && jugadaMaquina.equals("papel"))){ //Comparacion para el caso de ganar
                    vista.mostrarResultadoJuego("Ganaste" + " (Tu: " + jugada + ", Máquina: " + jugadaMaquina + ")");
                     
                }else{ //Si no se cumple es por que perdio 
                    vista.mostrarResultadoJuego("Perdiste" + " (Tu: " + jugada + ", Máquina: " + jugadaMaquina + ")");
                    
                }
            }
        }
    }
//--------------------------------------------------------------------------------
}     
    
    


