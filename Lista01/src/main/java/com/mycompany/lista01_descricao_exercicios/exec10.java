package com.mycompany.lista01_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec10 {
    public static void main(String[] args) {
        Double p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Primeira nota: "));
        Double p2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Segunda nota: "));
        double peso1 = 2;
        double peso2 = 3;
        double media = ((p1*peso1)+(p2*peso2))/(peso1+peso2);
        
        JOptionPane.showMessageDialog(null, "A média ponderada é: "+media);
    }
}
