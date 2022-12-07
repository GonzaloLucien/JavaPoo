package servicios;

import entidades.Operacion;
import static poo03.main.Poo03Operacion.scn;

/**
 * d) Método para crearOperacion(): que le pide al usuario los dos números y los
 * guarda en los atributos del objeto.
 *
 * e) Método sumar(): calcular la suma de los números y devolver el resultado al
 * main.
 *
 * f) Método restar(): calcular la resta de los números y devolver el resultado
 * al main.
 *
 * g) Método multiplicar(): primero valida que no se haga una multiplicación por
 * cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa
 * al usuario el error. Si no, se hace la multiplicación y se devuelve el
 * resultado al main
 *
 * h) Método dividir(): primero valida que no se haga una división por cero, si
 * fuera a pasar una división por cero, el método devuelve 0 y se le informa al
 * usuario el error. Si no, se hace la división y se devuelve el resultado al
 * main.
 */
public class ServicioOperacion {

    public Operacion crearOperacion() {
        System.out.println("Ingresa 2 números:");
        return new Operacion(scn.nextDouble(), scn.nextDouble());
    }

    public double sumar(Operacion op) {
        return op.getNumero1() + op.getNumero2();
    }

    public double restar(Operacion op) {
        return op.getNumero1() - op.getNumero2();
    }

    public double multiplicar(Operacion op) {
        if (op.getNumero1() == 0 || op.getNumero2() == 0) {
            return 0;
        }
        return op.getNumero1() * op.getNumero2();
    }
    
    public double dividir(Operacion op) {
        if (op.getNumero1() == 0 || op.getNumero2() == 0) {
            return 0;
        }
        return op.getNumero1() / op.getNumero2();
    }

} //end ServicioOperacion
