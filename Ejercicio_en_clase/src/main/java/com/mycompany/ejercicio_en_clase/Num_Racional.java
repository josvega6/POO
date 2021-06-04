/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio_en_clase;
import java.util.Scanner;

/**
 *
 * @author Miguel Vega
 */
public class Num_Racional {
    private double num;
    private double den;

    Num_Racional() {
        num = 0;
        den = 1;
    }
    Num_Racional(double n, double d) {
        num = n;
        den = d;
    }
    public void ingresar(){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el numerador ");
        num= sc.nextDouble();
        System.out.println("ingrese el deniminador ");
        den= sc.nextDouble();
    }
    
    //sumar fracciones
    public void sumar(Num_Racional a, Num_Racional b) {
        num = a.num * b.den + a.den * b.num;
        den = den * b.den;                                               
    }
   
    //restar fracciones
    public void restar(Num_Racional a, Num_Racional b) {
        num = a.num * b.den - a.den * b.num;
        den = den * b.den;
    }
   
    //multiplicar fracciones
    public void multiplicar(Num_Racional a, Num_Racional b){
        num = a.num* b.num;
        den = a.den*b.den;
   
    }

    //dividir fracciones
    public void dividir(Num_Racional a, Num_Racional b){
        num = a.num * b.den;
        den = a.den * a.num;
    }
    
      public double mcd(){
        double u = Math.abs(num);
        double v = Math.abs(den);
        if(v==0){
            return u;
        }
        double r;
        while(v!=0){
            r=u%v;
            u=v;
            v=r;
        }
        return u;
    }
         
//método para simplificar fracciones
    public void simplificar(){
        double dividir = mcd();
        num /= dividir;
        den/= dividir;
    }   
     public void imprimir(){
        simplificar();
        System.out.println("("+num+"/"+den+")");
    }

}   