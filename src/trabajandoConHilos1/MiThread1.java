/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajandoConHilos1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2dam
 */
public class MiThread1 extends Thread{
    public void run(){
        for(int x = 0; x <= 50; x++){
            try {
                System.out.println(x);
                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MiThread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
