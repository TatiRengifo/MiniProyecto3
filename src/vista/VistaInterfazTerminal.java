package vista;

import java.util.InputMismatchException;
import java.util.Scanner;

import controlador.ControladorJuego;

public class VistaInterfazTerminal implements VistaInterfaz {
    String jugada;
    String LowerCaseInput;
    @Override
    public void mostrarInterfaz(ControladorJuego controlador) {
        System.out.println("Bienvenido al Juego piedra papel o tijera");
        while(true){
            System.out.println("1. Para jugar");
            System.out.println("2. Para salir");
            try{
                Scanner scanner = new Scanner(System.in);
                int opcion = scanner.nextInt();
                if(opcion==1){
                    System.out.println("Dime tu jugada");
                    try{
                        jugada = scanner.next();
                        LowerCaseInput = jugada.toLowerCase();
                        controlador.actionPerformed(null);
                    }catch(InputMismatchException e){
                        System.out.println("Ingrese un valor valido por favor");
                        break;
                    }   
                }
                else if(opcion == 2){
                    System.out.println("Hasta la proxima....");
                    break;
                }
                else
                    System.out.println("Ingrese un valor valido (1 o 2)");

            }catch(InputMismatchException e){
                System.out.println("Ingrese un numero (1 o 2)");
            }  
        }
    }

    @Override
    public void mostrarResultadoJuego(String resultado) {
        System.out.println(resultado);
    }

    @Override
    public String getJugada() {
        return LowerCaseInput;
    }

    @Override
    public void mostrarEstadisticas(String contadorDerrota, String contadorVictoria, String contadorEmpate) {
    System.out.println("Derrotas: " + contadorDerrota +  " Victorias: "  + contadorVictoria + " Empates: " + contadorEmpate);
    }
    
}
