package servicios;

import entidades.MesSecreto;
import static pox05.main.Pox05MesSecreto.scn;

/**
 * El programa debe pedir al usuario que adivine el mes secreto. Si el usuario
 * acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
 * adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser
 * este: Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:
 * febrero No ha acertado. Intente adivinarlo introduciendo otro mes: agosto ¡Ha
 * acertado!
 *
 */
public class ServMesSecreto {

    public boolean acertaste(String mes1, String mes2) {
        return mes1.equalsIgnoreCase(mes2);
    }   //end acertaste

    public String mensaje(boolean acertaste, String mes) {
        if (acertaste) {
            return "Acertaste! el mes secreto era " + mes + ".";
        }
        return "Sigue intentando! " + mes + " no era el mes secreto.";
    }   //end mensaje

    public void jugar(MesSecreto ms) {
        boolean acerto;
        System.out.println("Bienvenido a Adivina el Mes Secreto!");
        do {
            System.out.println("Ingresa un mes para adivinar si es el mes secreto: ");
            String mes = scn.next();
            acerto = acertaste(mes, ms.getMesSecreto());
            System.out.println(mensaje(acerto, mes));
            System.out.println("");
        } while (!acerto);
    }  //end jugar

} //end ServMesSecreto
