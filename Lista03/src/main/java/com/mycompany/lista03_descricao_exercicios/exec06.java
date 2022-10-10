package com.mycompany.lista03_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec06 {
    public static void main(String[] args) { 
        int total = 0;
        int i = 0;
        double maior = 0;
        double menor = 9999999;
        double media = 0;
        while(i < 3) {
            Integer valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
            if(valor > maior){
                maior = valor;
            }
            if(valor < menor){
                menor = valor;
            }
            total += i;
            i ++;   
        }
        media = total/i;
        JOptionPane.showMessageDialog(null, String.format("O maior valor é: "+ maior + ".\nO menor valor é: "+ menor + ".\nA média é: "+ media + "."));
    }
}

