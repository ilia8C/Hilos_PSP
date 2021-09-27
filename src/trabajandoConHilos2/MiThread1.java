/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajandoConHilos2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2dam
 */
public class MiThread1 extends Thread{
        
     Scanner reader = new Scanner(System.in);
    
     
    public void run(){
        
        System.out.println("Introduce un número: ");
        int n = reader.nextInt();
        for(int x = 0; x <= n; x++){
            System.out.println(x);
            try {
                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MiThread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
