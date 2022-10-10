package com.mycompany.lista01_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec05 {
    public static void main(String[] args) {
        Double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do retângulo: "));
        Double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retângulo: "));
        double area = base*altura;
        
        JOptionPane.showMessageDialog(null, "A área do retângulo é: "+area);
    }
}
