package com.mycompany.ejercicio1;

public class Ejercicio7 {

    public static void main(String[] args) {

        int x = 1, y = 2, z = 3;

        if (++x > y++ || x-- > 0) {
            z++;
        } else {
            z--;
        }
        System.out.println(x + " " + y + " " + z);

    }
}
//El resultado es 1 2 3 4
