/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import ejercicio02.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jesusCazalilla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Thread> perros = new ArrayList<>();
        List<Thread> gatos = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            Thread gato = new Thread(new Gato(), "Gato " + (i + 1));
            Thread perro = new Thread(new Perro(), "Perro " + (i + 1));

            gatos.add(gato);
            perros.add(perro);
        }

        for (int i = 0; i < 5; i++) {
            gatos.get(i).start();
            perros.get(i).start();
        }

    }

}
