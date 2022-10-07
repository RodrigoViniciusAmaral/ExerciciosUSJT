package com.mycompany.lista01;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec04 {
     public static void main(String[] args) {
        Double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: "));
        double gratificacao = salario * 0.05;
        double impostos = salario * 0.07;
        double salarioAjustado = salario + gratificacao - impostos;

        JOptionPane.showMessageDialog(null, "Seu salário ajustado é de: " + salarioAjustado + "\nImpostos: " + impostos + "\ngratificacao: " + gratificacao);
    }
}
