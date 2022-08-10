package com.mycompany.ejercicio2;

import java.util.Scanner;


public class Practica_1{
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int num1=num.nextInt();
        System.out.println("Digite un numero: ");
        int num2 = num.nextInt();
        
        if (num1 == num2){
            System.out.println("Los dos números digitados son Iguales");
        }else 
            System.out.println("Los dos números digitados no son Iguales");
    }
    

}
