package pox06.main;

import entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;
import servicios.ServAhorcado;

/**
 * Autor: Gonzalo Lucien Dominguez
 */

public class Pox06Ahorcado {

    public static Scanner scn = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {

        ServAhorcado sa = new ServAhorcado();
        Ahorcado ahorcado1 = sa.crearJuego();
        boolean ganaste;
        
        do {
            sa.juego(ahorcado1);
            ganaste = ahorcado1.getEncontradas() == sa.longitud(ahorcado1.getPalabra());
            if (ganaste) {
                System.out.println("Acertaste! La palabra era " + Arrays.toString(ahorcado1.getPalabra()) + "!");

            } else if (ahorcado1.getVidas() == 0) {
                System.out.println("Perdiste, marmota.");
            }
        }while(!(ahorcado1.getVidas() == 0) && !ganaste);

    } //end main

} //end Pox06Ahorcado class
