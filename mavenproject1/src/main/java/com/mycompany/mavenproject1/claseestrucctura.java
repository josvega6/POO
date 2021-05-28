/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Dell
 */
public class claseestrucctura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rectangulo C1=new rectangulo();
        rectangulo C2=new rectangulo();
        rectangulo C3=new rectangulo();
        System.out.println("ingrese el valor del lado a: ");
        System.out.println("ingrese el valor del lado b: ");
        C1.ingresar1(10);
        C1.ingresar2(20);
        C1.mostrar();
        System.out.println("el perimetro del rectangulo 1 es: "+C1.perimetro());
        System.out.println("el area del rectangulo 1 es: "+C1.area());
        C2.ingresar1(5);
        C2.ingresar2(20);
        C2.mostrar();
        System.out.println("el perimetro del rectangulo 2 es: "+C2.perimetro());
        System.out.println("el area del rectangulo 2 es: "+C2.area());
        C3.ingresar1(4);
        C3.ingresar2(10);
        C3.mostrar();
        System.out.println("el perimetro del rectangulo 3 es: "+C3.perimetro());
        System.out.println("el area del rectangulo 3 es: "+C3.area());

        
    }
    
}
