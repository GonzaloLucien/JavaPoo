
package poo12.date2;

import entidades.Persona;
import servicios.ServicioPersona;
/**
 * Autor: Gonzalo Lucien Dominguez
 */

public class Poo12Date2 {

    /**
     *@param args
     */
    

    public static void main(String[] args) {
        ServicioPersona sp = new ServicioPersona();
        Persona p1 = sp.crearPersona();

        sp.calcularEdad(p1.getNacimiento());
        
        Persona p2 = sp.crearPersona();
        
        System.out.println("La nueva persona es menor a la persona 1:" + sp.menorQue(p1.getNacimiento(), p2.getNacimiento()));  
        
    } //end main

} //end Poo12Date2 class
