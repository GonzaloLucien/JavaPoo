
package entidades;

import java.util.Arrays;

/**
 ** Crea una clase en Java donde declares una variable de tipo array de Strings
 * que contenga los doce meses del año, en minúsculas. A continuación, declara
 * una variable mesSecreto de tipo String, y hazla igual a un elemento del array
 * (por ejemplo, mesSecreto = mes[9]. 
 */

public class MesSecreto {
    private final String[] meses = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private final String mesSecreto = meses[8];

    public MesSecreto() {
    }

    public String[] getMeses() {
        return meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    @Override
    public String toString() {
        return "Meses = " + Arrays.toString(meses) + ", Mes Secreto = " + mesSecreto + '.';
    }
    
    
    

} //end MesSecreto
