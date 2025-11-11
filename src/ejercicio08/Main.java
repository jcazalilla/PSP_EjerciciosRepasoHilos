/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author Jesús Cazalilla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cocina cocina = new Cocina();

        Thread h1 = new Thread(new Cocinero(cocina), "Concinero 1");
        Thread h2 = new Thread(new Cocinero(cocina), "Concinero 2");
        Thread h3 = new Thread(new Cocinero(cocina), "Concinero 3");
        Thread h4 = new Thread(new Cocinero(cocina), "Concinero 4");
        Thread h5 = new Thread(new Cocinero(cocina), "Concinero 5");
        Thread h6 = new Thread(new Cocinero(cocina), "Concinero 6");
        Thread h7 = new Thread(new Cocinero(cocina), "Concinero 7");
        Thread h8 = new Thread(new Cocinero(cocina), "Concinero 8");
        Thread h9 = new Thread(new Cocinero(cocina), "Concinero 9");

        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        h6.start();
        h7.start();
        h8.start();
        h9.start();

    }

}
