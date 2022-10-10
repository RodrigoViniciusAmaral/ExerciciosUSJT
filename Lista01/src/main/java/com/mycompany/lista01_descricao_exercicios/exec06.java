package com.mycompany.lista01_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec06 {
    public static void main(String[] args) {
        Double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo: "));
        Double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo: "));
        double area = (base * altura) / 2;

        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area);
    }
}
