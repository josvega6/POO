/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio_en_clase;
/**
 *
 * @author Miguel Vega
 */
public class Racionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Num_Racional f1 = new Num_Racional(); 
        Num_Racional f2 = new Num_Racional(); 
        System.out.println("ingrese el numerdor-->");
        f1.ingresar();
        System.out.println("ingrese el denominador-->");
        f2.ingresar();
        f1.imprimir();
        f2.imprimir();
        Num_Racional f3 = new Num_Racional();
        f3.sumar(f1, f2);
        System.out.println("El resultado de la suma es: ");
        f3.imprimir();
        
        Num_Racional f4 = new Num_Racional(); 
        f4.restar(f1, f2);
        System.out.println("El resultado de la resta es: ");
        f4.imprimir();
        
        Num_Racional f5 = new Num_Racional(); 
        f5.multiplicar(f1, f2);
        System.out.println("El resultado de la multiplicacion es: ");
        f5.imprimir();
        
        Num_Racional f6 = new Num_Racional(); 
        f6.dividir(f1, f2);
        System.out.println("El resultado de la division es: ");
        f6.imprimir();  
    }
    
}
