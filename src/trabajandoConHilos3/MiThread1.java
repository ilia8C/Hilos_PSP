/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajandoConHilos3;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 2dam
 */
public class MiThread1 extends Thread{
    public void run(){
        int n = Integer.valueOf(JOptionPane.showInputDialog("Introduce un número"));
        
        for(int x = 0; x <= n; x++){
            try {
                System.out.println(x);
                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MiThread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
