package com.mycompany.lista01_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec03 {
    public static void main(String[] args) {
        Double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: "));
        double salarioAjustado = salario*1.25;
        
        JOptionPane.showMessageDialog(null, "Seu salário ajustado é: "+salarioAjustado);
    }
}
