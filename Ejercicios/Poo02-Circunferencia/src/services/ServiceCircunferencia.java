package services;

import entidades.Circunferencia;
import static poo02.main.Poo02Circunferencia.scn;

/**
 * c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el
 * atributo del objeto. d) Método area(): para calcular el área de la
 * circunferencia (Area = π ∗ radio2). e) Método perimetro(): para calcular el
 * perímetro (Perimetro = 2 ∗ π ∗ radio).
 *
 * Autor: Gonzalo Lucien Dominguez
 */
public class ServiceCircunferencia {

    public Circunferencia crearCircunferencia() {
        System.out.println("Ingresa el radio de la circunferencia:");
        return new Circunferencia(scn.nextDouble());
    }

    public double area(Circunferencia circ) {
        return Math.PI * Math.sqrt(circ.getRadio());
    }
    
    public double perimetro(Circunferencia circ) {
        return 2 * Math.PI * circ.getRadio();
    }
} //end ServiceCircunferencia
