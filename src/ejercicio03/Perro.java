/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

import ejercicio02.*;

/**
 *
 * @author jesusCazalilla
 */
public class Perro extends Thread {

   
    

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+": Guau!");

    }

}
