package poo03.main;

import entidades.Operacion;
import java.util.Scanner;
import servicios.ServicioOperacion;

/**
 * Autor: Gonzalo Lucien Dominguez
 */
public class Poo03Operacion {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        ServicioOperacion so = new ServicioOperacion();
        Operacion op = so.crearOperacion();

        System.out.println("La suma de los números ingresados es: " + so.sumar(op) + ".");
        System.out.println("La resta de los números ingresados es: " + so.restar(op) + ".");

        if (so.multiplicar(op) == 0 || so.dividir(op) == 0) {
            System.out.println("Error: uno o ambos números es 0.");
        } else {
            System.out.println("La multiplicación de los nímeros ingresados es: " + so.multiplicar(op) + ".");
            System.out.println("La división de los números ingresados es: " + so.dividir(op) + ".");
        }
       
    } //end main

} //end Poo03Operacion class
