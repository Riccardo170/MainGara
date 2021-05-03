/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Utente
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Semaforo pieno = new Semaforo(4);
        Semaforo vuoto = new Semaforo(2);
        pista mugello = new pista(pieno);
        spogliatoio tome = new spogliatoio(vuoto);
        
        Piloti p1 = new Piloti(pieno, vuoto, mugello, tome);
        Piloti p2 = new Piloti(pieno, vuoto, mugello, tome);
        Piloti p3 = new Piloti(pieno, vuoto, mugello, tome);
        Piloti p4 = new Piloti(pieno, vuoto, mugello, tome);
        Piloti p5 = new Piloti(pieno, vuoto, mugello, tome);
        Piloti p6 = new Piloti(pieno, vuoto, mugello, tome);
        Piloti p7 = new Piloti(pieno, vuoto, mugello, tome);
        Piloti p8 = new Piloti(pieno, vuoto, mugello, tome);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
    }

}
