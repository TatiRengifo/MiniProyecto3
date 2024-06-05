package vista;

//--------------------------------------------------------------------------------
//Importaciones 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controlador.ControladorJuego;

import java.awt.Container;
import java.awt.FlowLayout;

//--------------------------------------------------------------------------------
public class VistaInterfazGUI extends JFrame implements VistaInterfaz {

//--------------------------------------------------------------------------------
    //Variables de la interfaz grafica
    Container contenedor;
    FlowLayout layout;
    JButton botonIniciarJuego;
    JTextField campoJugada;
    JLabel explicacion;
    JLabel contadorDerrotas;
    JLabel contadorVictorias;
    JLabel contadorEmpates;
//--------------------------------------------------------------------------------
    //Constructor de la clase
    public VistaInterfazGUI(){
        //Implementacion de la interfaz grafica
        contenedor = getContentPane();
        layout = new FlowLayout();
        contenedor.setLayout(layout);

        explicacion = new JLabel("Escribe tu opcion (piedra, papel, tijera)");
        contenedor.add(explicacion);

        campoJugada = new JTextField(10);
        contenedor.add(campoJugada);

        botonIniciarJuego = new JButton("Iniciar juego");
        contenedor.add(botonIniciarJuego);

        contadorDerrotas = new JLabel("Contador");
        contenedor.add(contadorDerrotas);
/*
        contadorVictorias = new JLabel("Victorias: ");
        contenedor.add(contadorVictorias);

        contadorEmpates = new JLabel("Empates: ");
        contenedor.add(contadorEmpates);
 */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
    }
//--------------------------------------------------------------------------------
//Los metodos de la interface

    //Funcion para mostrar la interfaz
    @Override
    public void mostrarInterfaz(ControladorJuego controlador) { //Por parametro se recibe el controlador
        botonIniciarJuego.addActionListener(controlador); //Se le adiciona una escucha al boton para jugar
        setVisible(true); //Mostar ventana
    }
    //Funcion para mostrar el resultado del juego
    @Override
    public void mostrarResultadoJuego(String resultado) { //Por parametro se recibe el resultado
        JOptionPane.showMessageDialog(contenedor, resultado); //Se muestra el resultado
    }
    //Funcion para obtener la jugada del humano
    @Override
    public String getJugada() {
        String jugada = campoJugada.getText(); //La jugada se saca del campo de texto
        String LowerCaseInput = jugada.toLowerCase(); //Se transforma la letra a minuscula
        return LowerCaseInput; //Se retorna la jugada
    }

//-------------------------------------------------------------------------------- 
//contadorDerrota; String contadorVictoria; String contadorEmpate;
    @Override
    public void mostrarEstadisticas(String contadorDerrota, String contadorVictoria, String contadorEmpate) {
        contadorDerrotas.setText("Derrotas: " + contadorDerrota +  " Victorias: "  + contadorVictoria + " Empates: " + contadorEmpate);
    }
}
