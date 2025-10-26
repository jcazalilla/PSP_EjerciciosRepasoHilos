/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author jesusCazalilla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //hilos mediante interfaz Runnable
        Gato gato = new Gato();
        Perro perro = new Perro();

        Thread g = new Thread(gato);
        Thread p = new Thread(perro);

        g.start();
        p.start();

    }

}
