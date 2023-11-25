
package com.mycompany.ejercicio1;

import java.util.Scanner;


public class Ejercicio13 {
     public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);   
         
         int numA, numB;
         
         System.out.println("Ingrese dos numeros:       ");
         
         numA=entrada.nextInt();
         numB=entrada.nextInt();
         
         if(numA>0 && numB>0){
           System.out.println("Es verdadero");
       }
       else{
           System.out.println("Es falso");
       }
    
    
    
    }
    
}
         
   

