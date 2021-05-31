
package com.mycompany.proyecto1;

public class triangulo {
    private double b,a;
    public void fijar_dim(double a,double b){
        this.a=a;
        this.b=b;
    }
    public void mostrar_dis(){
        System.out.println("Su base es"+b+"cm");
        System.out.println("Su altura es"+a+"cm");
    }
    public void area(triangulo d1){
        a=(d1.a*d1.b)/2;
        System.out.println("el area del triangulo es"+a+"cm^2");
    }
}
