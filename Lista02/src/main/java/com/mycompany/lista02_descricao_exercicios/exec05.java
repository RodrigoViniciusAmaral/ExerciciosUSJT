package com.mycompany.lista02_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec05 {
    public static void main(String[] args) {
        Integer v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        String valor = (v1 % 2 == 0) ? "par": "impar";
        JOptionPane.showMessageDialog(null, String.format("O valor digitado é "+ valor+"."));
    }
}
