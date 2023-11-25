
package com.mycompany.ejercicio1;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Digite un numero de 1 al 7:   ");

        numero = entrada.nextInt();

        switch (numero) {

            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número fuera de rango. Ingresa un número del 1 al 7.");
                break;

        }

    }

}
