package com.mycompany.lista02;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec04 {
    public static void main(String[] args) {
        Integer v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        Integer v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        double menor = (v1 < v2) ? v1 : v2;
        JOptionPane.showMessageDialog(null, String.format("O menor valor recebido é %.2f!", menor));
    }
}
