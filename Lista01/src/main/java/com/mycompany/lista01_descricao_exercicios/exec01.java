package com.mycompany.lista01_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec01 {
    public static void main(String[] args) {
        Double v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro valor: "));
        Double v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo valor: "));
        Double v3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Terceiro valor: "));
        double total = v1 * v2 * v3;
        JOptionPane.showMessageDialog(null, "O resultado é: " + total);
    }
}
