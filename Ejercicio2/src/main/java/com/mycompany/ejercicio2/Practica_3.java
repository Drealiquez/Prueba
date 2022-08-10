
package com.mycompany.ejercicio2;

import java.util.Scanner;


public class Practica_3 {
    public static void main(String[] args) {
        
        Scanner may=new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int numero1=may.nextInt();
        System.out.println("Digite un numero: ");
        int numero2 = may.nextInt();
        
        if (numero1 > numero2){
            System.out.println("Los números son: ");
            System.out.println(numero1);
            System.out.println(numero2);
        }else if (numero2 > numero1){
            System.out.println("Los números son: ");
            System.out.println(numero2);
            System.out.println(numero1);
            }else
                System.out.println("Error");
    }
 
}
