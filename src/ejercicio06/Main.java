/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author Jesús Cazalilla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Almacen almacen = new Almacen();

        new Pintor(almacen, "Pintor").start();

        new Vendedor(almacen, "Vendedor 1").start();
        new Vendedor(almacen, "Vendedor 2").start();

    }

}
