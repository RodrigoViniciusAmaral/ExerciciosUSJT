package com.mycompany.lista01_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec07 {
    public static void main(String[] args) {
        Double perimetro = Double.parseDouble(JOptionPane.showInputDialog("Digite o perímetro do círculo "));
        double raio = perimetro / (2 * 3.14);
        double area = Math.rint(3.14 * (Math.pow(raio, 2)));

        JOptionPane.showMessageDialog(null, "A área do círculo é: " + area);
    }
}
