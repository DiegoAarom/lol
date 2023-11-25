
package com.mycompany.ejercicio1;

import java.util.Scanner;


public class Ejercicio11 {
    public static void main(String[] args) {
        
         Scanner entrada = new Scanner(System.in);   
      
        int num = 0;
        System.out.println("Digite un numero:  ");
        num=entrada.nextInt();
        
        
        if(num %2 != 0){
            
            System.out.println("VERDADERO");
        }
        else{
            System.out.println("FALSO");
        }
        
        
        
        
    }
}
