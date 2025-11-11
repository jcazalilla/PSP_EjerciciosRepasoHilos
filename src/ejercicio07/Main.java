/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author Jesús Cazalilla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Museo museo = new Museo();

        Thread h1 = new Thread(new HilosEntrada(museo), "Puerta 1");
        Thread h2 = new Thread(new HilosEntrada(museo), "Puerta 2");
        Thread h3 = new Thread(new HilosEntrada(museo), "Puerta 3");
        Thread h4 = new Thread(new HilosEntrada(museo), "Puerta 4");

        h1.start();
        h2.start();
        h3.start();
        h4.start();

    }

}
