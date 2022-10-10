package com.mycompany.imprimirpares;

/* @author rodrigo_vinicius_amaral */
/* Usando o while imprima os números pares de 1 a 50, 
    o contador deve ser inicializado com o valor 1 
    é incrementado 1 ao contador a cada repetição do bloco de código 
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
