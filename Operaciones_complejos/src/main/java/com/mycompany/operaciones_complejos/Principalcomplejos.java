/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.operaciones_complejos;

/**
 *
 * @author Dell
 */
public class Principalcomplejos {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {                                                 
        // declaración de números complejos
        Complejo c1 = new Complejo(1.0, 1.0);
        Complejo c2 = new Complejo(2.0, 2.0);
        Complejo c3;
        // operadores aritméticos
        c3 = c1.sumar(c2);
        System.out.println(c1 + " + " + c2 + " = " + c3);
        c3 = c1.restar(c2);
        System.out.println(c1 + " - " + c2 + " = " + c3);
        c3 = c1.dividir(c2);
        System.out.println(c1 + " / " + c2 + " = " + c3);
        c3 = c1.multiplicar(c2);
        System.out.println(c1 + " * " + c2 + " = " + c3);
        
   }
}