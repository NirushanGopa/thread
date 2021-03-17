/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziotpsitthread;

/**
 *
 * @author informatica
 */
public class EsercizioTpsitThreadTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException{
        // TODO code application logic here
        Counter c = new Counter();
        Thread thr1 = new Thread(new ThreadDecrementa());
        Thread thr2 = new Thread(new ThreadIncrementa());

        thr1.start();
        thr2.start();

        thr1.join();
        thr2.join();

        c.stampaValoreFinale();
    }
    
}
