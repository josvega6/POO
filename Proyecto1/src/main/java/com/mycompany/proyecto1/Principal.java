
package com.mycompany.proyecto1;

public class Principal {

    public static void main(String[] args) {
       
       triangulo d1=new triangulo();
       d1.fijar_dim(5, 2);
       d1.mostrar_dis();
       d1.area(d1);
       triangulo d2=new triangulo();
       d2.fijar_dim(4, 2);
       d2.mostrar_dis();
       d2.area(d2);
       triangulo d3=new triangulo();
       d3.fijar_dim(10, 5);
       d3.mostrar_dis();
       d3.area(d3);
       
       
             
    }
    
}
