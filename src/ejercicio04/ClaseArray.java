/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author jesusCazalilla
 */
public class ClaseArray {

    int[] arrayEnteros = {10, 2, 4, 56, 3, 2, 78, 71, 90, 10};
    private static int suma;
    private static int resta;
    private static int producto;

    public void sumar() {

        for (int i = 0; i <= arrayEnteros.length - 1; i++) {
            suma += arrayEnteros[i];
        }

    }

    public void restar() {

        for (int i = 0; i <= arrayEnteros.length - 1; i++) {
            resta -= arrayEnteros[i];
        }

    }

    public void multiplicar() {

        for (int i = 0; i <= arrayEnteros.length - 1; i++) {

            if (i == 0) {
                //la primera vez el producto es el valor del primer elemento
                producto = arrayEnteros[i];
            } else {
                producto *= arrayEnteros[i];
            }

        }

    }

    public int getSuma() {
        return suma;
    }

    public int getResta() {
        return resta;
    }

    public int getProducto() {
        return producto;
    }
}
