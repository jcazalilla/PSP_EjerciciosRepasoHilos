/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import ejercicio02.*;

/**
 *
 * @author jesusCazalilla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Perro[] perros = new Perro[5];
        Gato[] gatos = new Gato[5];

        for (int i =0; i < 5; i++) {
            perros[i] = new Perro("Perro " +(i+1));
            gatos[i] = new Gato("Gato " + (i+1));
        }

        for (int i = 0; i < 5; i++) {
            perros[i].start();
            gatos[i].start();
        }

    }

}
