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
public class rectangulo {
    //atributos
    
    private double a;
    private double b;
    
    //metodos
    
    public double perimetro(){
        double p;
        p=2*a+2*b;
        return p;
    }
    public double area(){
        double A;
        A=a*b;
        return A;
    }
    public void ingresar1(double valor1){
        a=valor1;
    }
    public void ingresar2(double valor2){
        b=valor2;    
    }
    public void mostrar(){
        System.out.println("el valor del lado a es: "+a);
        System.out.println("el valor del lado b es: "+b);

    }
   
    
}
