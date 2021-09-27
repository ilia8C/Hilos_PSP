/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author 2dam
 */
public class MiThread2 extends Thread{
     public void run(){
        System.out.println("Soy el hilo 2 creado. Voy a contar");
        for(int x = 101; x <= 200; x++){
            System.out.println(x);
        }
    }
}
