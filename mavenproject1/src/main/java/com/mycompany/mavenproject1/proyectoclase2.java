/*
 Definir una clase para 
Realizar un programa que utilice esta clase y tenga un menu para las 4 operaciones aritmeticas, donde se tenga
una serie de pares de numeros para realizar la operacion correspondiente
 */
package com.mycompany.mavenproject1;


public class proyectoclase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones OP1=new Operaciones();
        OP1.ingresar(4, 5);
        OP1.mostrar();
       int opcion=1;
       switch(opcion){
           case 1:System.out.println("El resultado de la suma es :"+OP1.suma());break;
           case 2:System.out.println("El resultado de la resta es :"+OP1.resta());break;
           case 3:System.out.println("El resultado de la multiplicación es :"+OP1.multiplicación());break;
           case 4:System.out.println("El resultado de la división es :"+OP1.división());break;
           default: System.out.println("Operación no definida!!");
           
       }
       
        
    }
    
}
