/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author Jesús Cazalilla
 */
public class Pintor extends Thread {

    Almacen almacen;

    public Pintor(Almacen almacen, String nombre) {
        super(nombre);
        this.almacen = almacen;
    }

    @Override
    public void run() {

        while (almacen.getVentas() < 10) {
            try {
                almacen.pintarCuadro(this.getName());
            } catch (InterruptedException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }

}
