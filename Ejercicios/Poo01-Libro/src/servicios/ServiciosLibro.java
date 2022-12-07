package servicios;

import entidades.Libro;
import java.util.Scanner;

/**
 * Autor: Gonzalo Lucien Dominguez
 */
public class ServiciosLibro {

    /**
     * Crear un método para cargar un libro pidiendo los datos al usuario y
     * luego informar mediante otro método el número de ISBN, el título, el
     * autor del libro y el numero de páginas. 
     */
    
    public Scanner scn = new Scanner(System.in).useDelimiter("\n");
    
    public Libro nuevoLibro() {
        System.out.println("Ingresa el número ISBN del libro:");
        int isbn = scn.nextInt();
        System.out.println("Ingresa el título del libro:");
        String titulo = scn.next();
        System.out.println("Ingresa el autor del libro:");
        String autor = scn.next();
        System.out.println("Ingresa el número de páginas del libro:");
        int paginas = scn.nextInt();
        
        return new Libro(isbn, titulo, autor, paginas);
    }
    
} //end ServiciosLibro
