package com.mycompany.lista02_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec03 {
    public static void main(String[] args) {
        Integer v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        Integer v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        int maior = (v1 > v2) ? v1 : v2;
        JOptionPane.showMessageDialog(null, String.format("O maior valor recebido é" + maior + "!"));
    }
}
