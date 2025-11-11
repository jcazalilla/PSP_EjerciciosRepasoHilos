/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author jesusCazalilla
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        ClaseArray ca = new ClaseArray();

        //1=sumar ; 2=restar; 3=multiplicar
        UsarHilos uh1 = new UsarHilos(ca,1);
        UsarHilos uh2 = new UsarHilos(ca,2);
        UsarHilos uh3 = new UsarHilos(ca,3);

        uh1.start();
        uh2.start();
        uh3.start();

        uh1.join();
        uh2.join();
        uh3.join();

        System.out.println("La suma total de los elementos del array es: " + ca.getSuma());
        System.out.println("La resta total de los elementos del array es: " + ca.getResta());
        System.out.println("El producto total de los elementos del array es: " + ca.getProducto());

    }

}
