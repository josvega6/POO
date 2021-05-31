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
public class Operaciones {
    private double operando1, operando2;
    
    public double suma(){
        return(operando1+operando2);
    }
    public double resta(){
        return(operando1-operando2);
    }
    public double multiplicación(){
        return(operando1*operando2);
    }
    public double división(){
        if(operando2==0){
            System.out.println("no existe numero dividido para 0");
            return(0.0);
        }else
            return(operando1/operando2);
    }
    public void ingresar(double op1,double op2){
        operando1=op1;
        operando2=op2;
    
    }
    public void mostrar(){
        System.out.println("el primer operando es: "+operando1);
        System.out.println("el segundo operando es: "+operando2);
    }
}
