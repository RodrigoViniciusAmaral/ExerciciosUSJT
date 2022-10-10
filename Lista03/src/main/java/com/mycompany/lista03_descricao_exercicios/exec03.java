package com.mycompany.lista03_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec03 {
    public static void main(String[] args) {
        Integer valor = Integer.parseInt(JOptionPane.showInputDialog("Digite qual tabuada gostaria de ver: "));
        int total = 0;
        for (int j = 0; j <= 10; j++) {
            total = valor * j;
            JOptionPane.showMessageDialog(null, String.format(j + " * "+ valor + " = " + total));
        }
    } 
}
