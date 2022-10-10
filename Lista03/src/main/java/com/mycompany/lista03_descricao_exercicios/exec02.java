package com.mycompany.lista03_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec02 {
    public static void main(String[] args) {
        int i = 0;
        int total = 0;
        double media = 0;
        while(1 != 0){
           Integer valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
           if(valor == 0){
               break;
           }
           else{
               i ++;
               total += valor;
           }
           media = total/i;
        }
        JOptionPane.showMessageDialog(null, String.format("A média é: "+ media));
    }
}
