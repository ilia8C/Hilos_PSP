/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajandoConHilos2;

import java.util.Scanner;

/**
 *
 * @author 2dam
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MiThread1 t1 = new MiThread1();
        t1.start();
    }
    
}
