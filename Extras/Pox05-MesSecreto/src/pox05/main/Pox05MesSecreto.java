package pox05.main;

import entidades.MesSecreto;
import java.util.Scanner;
import servicios.ServMesSecreto;

/**
 * 
 * Autor: Gonzalo Lucien Dominguez
 */
public class Pox05MesSecreto {

    public static Scanner scn = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        MesSecreto adivina = new MesSecreto();
        ServMesSecreto sm = new ServMesSecreto();
        
        sm.jugar(adivina);
        
    } //end main

} //end Pox05MesSecreto class
