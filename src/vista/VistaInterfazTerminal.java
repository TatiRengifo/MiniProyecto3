package vista;

import java.util.Scanner;

import controlador.ControladorJuego;

public class VistaInterfazTerminal implements VistaInterfaz {
    String jugada;
    @Override
    public void mostrarInterfaz(ControladorJuego controlador) {
        System.out.println("Bienvenido al Juego piedra papel o tijera");
        while(true){
            System.out.println("1. Para jugar");
            System.out.println("2. Para salir");
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            if(opcion==1){
                System.out.println("Dime tu jugada");
                jugada = scanner.next();
                controlador.actionPerformed(null);
            }
            else if(opcion == 2){
                System.out.println("Hasta la proxima....");
                break;
            }
        }
    }

    @Override
    public void mostrarResultadoJuego(String resultado) {
        System.out.println(resultado);
    }

    @Override
    public String getJugada() {
        return jugada;
    }
    
}
