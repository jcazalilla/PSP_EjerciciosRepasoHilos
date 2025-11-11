/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author Jesús Cazalilla
 */
public class Almacen {

    private int ventas = 0;
    private int stock = 0;

    public synchronized void pintarCuadro(String nombre) throws InterruptedException {

        if (stock == 1) {
            wait();
        }

        if (getVentas() < 10) {
            stock = 1;
            System.out.println(nombre + " pintó un cuadro.");
        }
        notifyAll();
    }

    public synchronized void venderCuadro(String nombre) throws InterruptedException {

        if (stock == 0) {
            wait();
        }

        stock = 0;
        ventas++;
        System.out.println(nombre + " vendió un cuadro.");
        notifyAll();
    }

    public int getVentas() {
        return ventas;
    }

}
