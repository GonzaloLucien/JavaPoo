
package poxx02.timer;

import entidades.Tiempo;
import java.util.Scanner;
import servicios.ServTiempo;
/**
 * Autor: Gonzalo Lucien Dominguez
 */

public class Poxx02Timer {

    public static Scanner scn = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        ServTiempo st = new ServTiempo();
        Tiempo time = st.crearTiempo();
        st.inicializarTiempo(time);
        
    } //end main

} //end Poxx02Timer class
