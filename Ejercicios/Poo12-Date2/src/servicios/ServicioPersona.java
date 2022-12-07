package servicios;

import entidades.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * Autor: Gonzalo Lucien Dominguez
 */
public class ServicioPersona {

//  Agregar un método de creación del objeto que respete la siguiente firma:
//  crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
//  usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
//  fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    
    public Persona crearPersona() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la persona:");
        String name = scn.next();
        System.out.println("Ingresa tu fecha de nacimiento: dia, mes y año:");
        int dia = scn.nextInt();
        int mes = scn.nextInt();
        int anio = scn.nextInt();
        LocalDate nacio = LocalDate.of(anio, mes, dia);
        return new Persona(name, nacio);
    } //metodo CrearPersona

//    Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
//  en cuenta que para conocer la edad de la persona también se debe conocer la fecha
//  actual.
    public void calcularEdad(LocalDate fn) {

//        LocalDate fa = LocalDate.now();
//        LocalDate edad;
//        System.out.println(fa);
//        int anioEdad = fa.getYear() - fn.getYear();
//        int mesEdad = fa.getMonthValue() - fn.getMonthValue();
//        int diaEdad = fa.getDayOfMonth() - fn.getDayOfMonth();
//        edad = LocalDate.of(anioEdad, mesEdad, diaEdad);
//
//        return edad;

        LocalDate fa = LocalDate.now();
        Period periodo = Period.between(fn, fa);

        System.out.print("Tu edad es: " + periodo.getYears() +" años, "+ periodo.getMonths() +" meses, "+ periodo.getDays() + " dias.");
        System.out.println("");
    }   

//    Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
//  edad y retorna true en caso de que el receptor tenga menor edad que la persona que
//  se recibe como parámetro, o false en caso contrario.
    public boolean menorQue(LocalDate fn, LocalDate f2){
        Period periodo = Period.between(fn, f2);
        
        return (periodo.getDays()<0);
    }
    
} //end ServicioPersona
