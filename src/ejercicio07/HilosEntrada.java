/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author Jesús Cazalilla
 */
public class HilosEntrada implements Runnable {

    Museo museo;

    public HilosEntrada(Museo museo) {
        this.museo = museo;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 20; i++) {

            museo.incrementar();
        }

    }

}
