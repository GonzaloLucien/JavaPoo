package poo02.main;

import entidades.Circunferencia;
import java.util.Scanner;
import services.ServiceCircunferencia;

/**
 * Autor: Gonzalo Lucien Dominguez
 */
public class Poo02Circunferencia {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        ServiceCircunferencia sc = new ServiceCircunferencia();
        Circunferencia circ = sc.crearCircunferencia();
        System.out.println("El área de la circunferencia es: " +  sc.area(circ) + " unidades cuadráticas.");
        System.out.println("El perímetro de la circunferencia es: " +  sc.perimetro(circ) + " unidades.");
        
    } //end main

} //end Poo02Circunferencia class
