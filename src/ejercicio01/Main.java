/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author jesusCazalilla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        CrearHilo h1 = new CrearHilo("Hilo 1");
        CrearHilo h2 = new CrearHilo("Hilo 2");
        CrearHilo h3 = new CrearHilo("Hilo 3");
        
        
        h1.start();
        h2.start();
        h3.start();
        
        
        
    }
    
}
