/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author Jesús Cazalilla
 */
public class Vendedor extends Thread {

    Almacen almacen;

    public Vendedor(Almacen almacen, String nombre) {
        super(nombre);
        this.almacen = almacen;
    }

    @Override
    public void run() {

        while (almacen.getVentas() < 10) {
            try {
                almacen.venderCuadro(this.getName());
            } catch (InterruptedException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }

}
