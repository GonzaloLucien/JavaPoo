package poo04.main;

import entidades.Rectangulo;
import java.util.Scanner;
import servicios.ServRectangulo;

/**
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo
 * privado base y un atributo privado altura. La clase incluirá un método para
 * crear el rectángulo con los datos del Rectángulo dados por el usuario.
 * También incluirá un método para calcular la superficie del rectángulo y un
 * método para calcular el perímetro del rectángulo. Por último, tendremos un
 * método que dibujará el rectángulo mediante asteriscos usando la base y la
 * altura. Se deberán además definir los métodos getters, setters y
 * constructores correspondientes. Superficie = base * altura / Perímetro =
 * (base + altura) * 2.
 * 
 * Autor: Gonzalo Lucien Dominguez
 */

public class Poo04Rectangulo {

    public static Scanner scn = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        ServRectangulo sr = new ServRectangulo();
        Rectangulo r = sr.crearRectangulo();
        System.out.println(sr.indicarSuperficie(r));
        System.out.println(sr.indicarPerimetro(r));
        sr.dibujarRectangulo(r);
    } //end main

} //end Poo04Rectangulo class
