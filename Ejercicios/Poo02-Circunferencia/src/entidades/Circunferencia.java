package entidades;

/**
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el
 * radio de tipo real. A continuación, se deben crear los siguientes métodos: a) Método constructor
 * que inicialice el radio pasado como parámetro. b) Métodos get y set para el
 * atributo radio de la clase Circunferencia.
 * 
 * Autor: Gonzalo Lucien Dominguez
 */
public class Circunferencia {

    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }

} //end Circunferencia
