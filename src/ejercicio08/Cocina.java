/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

import static java.lang.Thread.sleep;

/**
 *
 * @author Jesús Cazalilla
 */
public class Cocina {

    private int cuchillos = 5;

    public synchronized void cogerCuchillo() throws InterruptedException {

        while (cuchillos < 1) {
            System.out.println(Thread.currentThread().getName()+" esperando cuchillo,");
            wait();
        }

        cuchillos--;
        System.out.println(Thread.currentThread().getName() + ": cojo el cuchillo.  Cuchillos: " + cuchillos);

    }

    public synchronized void soltarCuchillo() throws InterruptedException {

        cuchillos++;
        System.out.println(Thread.currentThread().getName() + ": suelto el cuchillo.  Cuchillos: " + cuchillos);
        notifyAll();
    }

}
