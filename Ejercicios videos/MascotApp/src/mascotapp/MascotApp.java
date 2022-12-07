
package mascotapp;

import entidades.Mascota;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class MascotApp {

    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Ponele el nombre y la edad a tu mascota:");
   
        Mascota mascot = new Mascota(leer.next(),leer.nextInt(),true);
        
        System.out.println("Ingresa denuevo el nombre:");
        mascot.setNombre(leer.next());
        
        System.out.println("Tu mascota se llama " + mascot.getNombre() + " y tiene " + mascot.getEdad() + " años.");
        System.out.println("Tiene sexo? "+mascot.isSexo());
        
        System.out.println(mascot.vivir(mascot.getEdad()));
    }
    
}
