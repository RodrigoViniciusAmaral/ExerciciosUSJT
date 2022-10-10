/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.imprimirpares;

/**
 *
 * @author rodrigo_pc
 */
public class ImprimirPares {
     public static void main(String[] args) {
        int i = 0;
        while(i <= 50){
            if(i % 2 == 0){
                System.out.println(i);
                i++;
            } else{
                i++;
            }   
        }
    }
}
