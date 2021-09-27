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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiThread t1 = new MiThread();
        MiThread2 t2 = new MiThread2();
        t1.start();
        t2.start();
        System.out.println("Hola desde el principal");
        System.out.println("Hola desde el principal");
        System.out.println("Hola desde el principal");
        System.out.println("Hola desde el principal");
        System.out.println("Hola desde el principal");
        System.out.println("Hola desde el principal");
    }
    
}
