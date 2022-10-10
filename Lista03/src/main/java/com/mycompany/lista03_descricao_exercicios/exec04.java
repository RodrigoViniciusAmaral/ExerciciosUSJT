package com.mycompany.lista03_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec04 {
    public static void main(String[] args) {
        int total = 1;
        Integer valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        for (int j = 1; j <= valor; j++) {
            total = total * j;
        }
        JOptionPane.showMessageDialog(null, String.format("O total é: " + total + "."));
    }
}
