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
public class Cocinero implements Runnable {

    Cocina cocina;

    public Cocinero(Cocina cocina) {
        this.cocina = cocina;
    }

    @Override
    public void run() {

        for (int i = 0; i < 4; i++) {

            try {
                cocina.cogerCuchillo();
                sleep(3000);
                cocina.soltarCuchillo();
            } catch (InterruptedException ex) {
                System.out.println("Error:" + ex.getMessage());
            }

        }

    }

}
