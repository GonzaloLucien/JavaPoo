package poo11.date;

import java.util.Date;
import java.util.Scanner;

/**
 * Autor: Gonzalo Lucien Dominguez
 */

public class Poo11Date {

    /**
     * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar
     * solo con la clase Date. En este ejercicio deberemos instanciar en el
     * main, una fecha usando la clase Date, para esto vamos a tener que crear 3
     * variables, dia, mes y anio que se le pedirán al usuario para poner el
     * constructor del objeto Date. Una vez creada la fecha de tipo Date,
     * deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha
     * actual, que se puede conseguir instanciando un objeto Date con
     * constructor vacío. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
     * Ejemplo fecha actual: Date fechaActual = new Date();
     *
     * @param args
     */
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingresa dia, mes y año:");
        int dia = scn.nextInt();
        int mes = scn.nextInt();
        int anio = scn.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        System.out.println(fecha.toString());

        Date fechaActual = new Date();
        System.out.println(fechaActual.toString());

        System.out.println(fechaActual.getYear() - fecha.getYear());

    } //end main

} //end Poo11Date class
