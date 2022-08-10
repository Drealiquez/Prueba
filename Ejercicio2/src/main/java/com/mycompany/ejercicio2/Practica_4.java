
package com.mycompany.ejercicio2;

import java.util.Scanner;


public class Practica_4 {
    public static void main(String[] args) {
        Scanner men=new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int dato1=men.nextInt();
        System.out.println("Digite un numero: ");
        int dato2 = men.nextInt();
        System.out.println("Digite un numero: ");
        int dato3 = men.nextInt();
        
        if (dato1 > dato2 && dato2 > dato3){
            System.out.println("Los números son: ");
            System.out.println(dato1);
            System.out.println(dato2);
            System.out.println(dato3);
        }else if (dato1 > dato3 && dato3 > dato2){
            System.out.println("Los números son: ");
            System.out.println(dato1);
            System.out.println(dato3);
            System.out.println(dato2);
        }else if (dato2 > dato1 && dato1 > dato3){
            System.out.println("Los números son: ");
            System.out.println(dato2);
            System.out.println(dato1);
            System.out.println(dato3);
        }else if (dato2 > dato3 && dato3 > dato1){
            System.out.println("Los números son: ");
            System.out.println(dato2);
            System.out.println(dato3);
            System.out.println(dato1);
        }else if (dato3 > dato1 && dato1 > dato2){
            System.out.println("Los números son: ");
            System.out.println(dato3);
            System.out.println(dato1);
            System.out.println(dato2);
        }else if (dato3 > dato2 && dato2 > dato1){
            System.out.println("Los números son: ");
            System.out.println(dato3);
            System.out.println(dato2);
            System.out.println(dato1);
        }else
                System.out.println("Error");
    }
}
