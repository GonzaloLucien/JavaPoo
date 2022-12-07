package servicios;

import entidades.Ahorcado;
import static pox06.main.Pox06Ahorcado.scn;

/**
 *
 */
public class ServAhorcado {

//  Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
//  Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
//  vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
//  de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
//  máximas, el valor que ingresó el usuario y encontradas en 0.
    public Ahorcado crearJuego() {
        System.out.println("Ingresa la palabra incógnita:");
        String palabra = scn.next();
        System.out.println("Ingresa las vidas del jugador:");
        int vidas = scn.nextInt();

        return new Ahorcado(cargarPalabra(palabra), 0, vidas);
    }

    public String[] cargarPalabra(String palabra) {
        String[] palabraDividida = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            palabraDividida[i] = palabra.substring(i, (i+1));
        }
        return palabraDividida;
    }

//  Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
//  buscar como se usa el vector.length.
    public int longitud(String[] vector) {
        return vector.length;
    }

//  Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
//  letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    public boolean buscar(String letra, String[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].equals(letra)) {
                return true;
            }
        }
        return false;
    }

//  Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//  cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//  devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//  busque una letra que no esté, se le restará uno a sus oportunidades.
    public boolean encontradas(String letra, Ahorcado ahorcado) {
        boolean encontrada = false;
        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            if (ahorcado.getPalabra()[i].equals(letra)) {
                ahorcado.setEncontradas(ahorcado.getEncontradas() + 1);
                encontrada = true;
            }
        }
        if (!encontrada) {
            ahorcado.setVidas(ahorcado.getVidas()-1);
        }
        System.out.println("Número de letras (encontradas, faltantes): (" + ahorcado.getEncontradas() + "," + (ahorcado.getPalabra().length - ahorcado.getEncontradas()) + ")");

        return encontrada;
    }

//  Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    public int intentos(Ahorcado ahorcado) {
        return ahorcado.getVidas();
    }

//  Método juego(): el método juego se encargará de llamar todos los métodos
//  previamente mencionados e informará cuando el usuario descubra toda la palabra o
//  se quede sin intentos. Este método se llamará en el main.
    public void juego(Ahorcado ahorcado) {
        System.out.println("Ingresa una letra nueva a buscar:");
        String letra = scn.next();
        System.out.println("Longitud de la palabra: " + longitud(ahorcado.getPalabra()));
        if (buscar(letra, ahorcado.getPalabra())) {
            System.out.println("Mensaje: La letra pertenece a la palabra.");
        } else {
            System.out.println("Mensaje: La letra NO pertenece a la palabra.");
        }
        if (encontradas(letra, ahorcado)) {
            System.out.println("Número de oportunidades restantes: " + intentos(ahorcado));
        } else {
            System.out.println("Número de oportunidades restantes: " + intentos(ahorcado));
        }
        System.out.println("----------------------------------------------");
    }

} //end ServAhorcado
