package servicios;

import entidades.Tiempo;
import static poxx02.timer.Poxx02Timer.scn;

/**
 *
 */
public class ServTiempo {

    public Tiempo crearTiempo() {
        int hs, min, seg;
        Tiempo hora = new Tiempo();
        System.out.println("Ingresa una hora, con minutos y segundos.");
        System.out.println("Ingresa la hora:");
        hora.setHs(hora());
        System.out.println("Ingresa los minutos:");
        hora.setMin(minYSeg());
        System.out.println("Ingresa los segundos:");
        hora.setSeg(minYSeg());
        return hora;

    }

    public int hora() {
        int hs;
        do {
            hs = scn.nextInt();
        } while (hs < 0 || hs > 24);
        return hs;
    }

    public int minYSeg() {
        int num;
        do {
            num = scn.nextInt();
        } while (num < 0 || num > 59);
        return num;
    }
    
    public void ajustarTiempo(Tiempo tiempo) {
        if (tiempo.getSeg() == 59) {
                tiempo.setSeg(0);
                if (tiempo.getMin() == 59) {
                    tiempo.setMin(0);
                    if (tiempo.getHs() == 23) {
                        tiempo.setHs(0);
                    } else {
                        tiempo.setHs(tiempo.getHs() + 1);
                    }
                } else {
                    tiempo.setMin(tiempo.getMin() + 1);
                }
            } else {
                tiempo.setSeg(tiempo.getSeg() + 1);
            }
    }

    public static void esperar(int miliSec) {
        try {
            Thread.sleep(miliSec);
        } catch (InterruptedException ignored) {
        }
    }

    public void inicializarTiempo(Tiempo tiempo) {
        System.out.println("Iniciando hora...");
        try {
            Thread.sleep(700);
        } catch (InterruptedException ignored) {
        }

        do {
            System.out.println(tiempo);
            ajustarTiempo(tiempo);
            esperar(500);
        } while (true);
    }

} //end ServTiempo
