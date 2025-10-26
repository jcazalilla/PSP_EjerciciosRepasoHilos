/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author jesusCazalilla
 */
class CrearHilo extends Thread {

    public CrearHilo(String name) {
        super(name);
    }
    
    
    
    @Override
    public void run(){
        
        
        for (int i = 1; i <= 10; i++) {
            
            System.out.printf("%s: %d\n",this.getName(),i);
        }
    }
}
