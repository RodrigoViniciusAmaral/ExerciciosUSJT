package com.mycompany.imprimirimpares;

/* @author rodrigo_vinicius_amaral */
/* Usando o for imprima os números pares de 1 a 50, o contador deve ser
    inicializado com o valor 1 é incrementado 1 ao contador a cada repetição
    do bloco de código
*/

public class ImprimirImpares {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }  
        }
    }
}

