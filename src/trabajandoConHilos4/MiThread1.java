/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajandoConHilos4;

import javax.swing.JOptionPane;

/**
 *
 * @author 2dam
 */
public class MiThread1 extends Thread{
    public void run(){
        int n = Integer.valueOf(JOptionPane.showInputDialog("Introduce un número"));
        int m = Integer.valueOf(JOptionPane.showInputDialog("Introduce un número"));
    }
}
