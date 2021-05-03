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
public class spogliatoio{
   Semaforo vuoto;
   
   public spogliatoio(Semaforo vuoto){
       this.vuoto= vuoto;    
   }
   
   public void tuta(){
       vuoto.P(); //richiesta della risorsa
       System.out.println("il pilota ha indossato la tuta e il casco");
       vuoto.V(); //lascia la risorsa
   }
    public void spogliati(){
       vuoto.P(); //richiesta della risorsa
       System.out.println("il pilota si è tolta la tuta e il casco");
       vuoto.V(); //lascia la risorsa
   }
}
