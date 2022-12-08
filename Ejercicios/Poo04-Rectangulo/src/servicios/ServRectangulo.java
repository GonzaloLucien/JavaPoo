
package servicios;

import entidades.Rectangulo;
import static poo04.main.Poo04Rectangulo.scn;

/**
 *
 */

public class ServRectangulo {

    public Rectangulo crearRectangulo(){
        System.out.println("Ingresa la base del rectángulo:");
        int base = scn.nextInt();
        System.out.println("Ingresa la altura del rectángulo:");
        int altura = scn.nextInt();
        return new Rectangulo(base, altura);
    }

    public int perimetro(Rectangulo rect){
        return (rect.getBase() + rect.getAltura()) * 2;
    }
    
    public String indicarPerimetro(Rectangulo rect){
        return "El perímetro del rectángulo es " + perimetro(rect) + ".";
    }
    
    public int superficie(Rectangulo rect){
        return rect.getBase() * rect.getAltura();
    }
    
    public String indicarSuperficie(Rectangulo rect){
        return "La superfície del rectángulo es " + superficie(rect) + ".";
    }
    
    public void dibujarRectangulo(Rectangulo rect){
        for (int i = 0; i < rect.getAltura(); i++) {
            for (int j = 0; j < rect.getBase(); j++) {
                if (i==0 || i==rect.getAltura()-1 || j==0 || j==rect.getBase()-1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    
} //end ServRectangulo
