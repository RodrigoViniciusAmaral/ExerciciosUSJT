package com.mycompany.lista03_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec05 {
    public static void main(String[] args) {
        Integer valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        int total = 0;
        int i = 0;
        while(i <= valor) {
            total += i;
            i ++;   
        }
        JOptionPane.showMessageDialog(null, String.format("O total é: " + total));
    }
}

