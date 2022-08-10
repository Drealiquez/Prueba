
package com.mycompany.ejercicio2;

import java.util.Scanner;


public class Practica_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Esciba un numero: ");
        double numero=sc.nextDouble();
        
        if (numero <0){
            System.out.println("Numero ingresado es NEGATIVO");
        }else if (numero >0){
            System.out.println("Numero ingresado es POSITIVO");
        }else 
            System.out.println("Dato no identificado");
    }
}
