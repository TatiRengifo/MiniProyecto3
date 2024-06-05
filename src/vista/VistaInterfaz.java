package vista;

import controlador.ControladorJuego; //Importo el controlador para asi conectarlo con la interfaz

public interface VistaInterfaz {

    //Funcion para mostrar la interfaz GUI
    public void mostrarInterfaz(ControladorJuego controlador);
    
    //Funcion para mostrar el resultado del juego
    public void mostrarResultadoJuego(String resultado);
    
    //Funcion para obtener la jugada del humano
    public String getJugada();

    //Funcion para mostrar estadisticas
    public void mostrarEstadisticas(String contadorcontadorDerrota, String contadorVictoria, String contadorEmpate);


}
