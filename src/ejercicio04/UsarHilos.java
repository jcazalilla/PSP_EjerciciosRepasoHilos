/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author jesusCazalilla
 */
public class UsarHilos extends Thread {

    int operacion;
    ClaseArray ca = new ClaseArray();

    public UsarHilos(int operacion) {
        this.operacion = operacion;
    }

    @Override
    public void run() {

        switch (this.operacion) {

            case 1 ->
                ca.sumar();
            case 2 ->
                ca.restar();
            case 3 ->
                ca.multiplicar();

        }

    }
}
