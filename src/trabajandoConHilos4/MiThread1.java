/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajandoConHilos4;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 2dam
 */
public class MiThread1 extends Thread {

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int n = sc.nextInt();
        System.out.println("Introduce otro número:");
        int m = sc.nextInt();

        try {
            for (int x = 1; x <= n; x++) {
                MiThread1 miThread = new MiThread1();
                System.out.println("Hilo número " + x);
                for (int y = 1; y <= m; y++) {
                    System.out.println(y);
                    sleep(100);
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(MiThread1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
