
package com.mycompany.ejercicio_4;

import java.util.Scanner;


public class Practica_1 {
    
    public static void digitar(){

       
    int dimensiones [][] = new int[5][4];
       
    for (int i=0; i < dimensiones.length; i++){
            for (int e=0; e < dimensiones[i].length; e++){ 
            Scanner datos = new Scanner(System.in);
            System.out.println("Digite un número: ");
            dimensiones[i][e] = datos.nextInt();      
            
            }  
        }
    
    System.out.println("___________________________");
    for (int i=0; i < dimensiones.length; i++){
         System.out.print("|");
            for (int e=0; e < dimensiones[i].length; e++){
                
            System.out.print (dimensiones[i][e]);
            
            if (e!=dimensiones[i].length-1) System.out.print("\t");
            }
            System.out.println("|");
     }
        System.out.print("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
    }
    
    public static void main(String[] args) {
        System.out.println("Digite 20 Numeros de uno en uno: ");
       digitar();
       
    }
    
}
