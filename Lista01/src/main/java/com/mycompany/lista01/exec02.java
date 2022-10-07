package com.mycompany.lista01;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec02 {
    public static void main(String[] args) {
        Double p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Primeira nota: "));
        Double p2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Segunda nota: "));
        Double p3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Terceira nota: "));
        double nota1 = p1*3;
        double nota2 = p2*3;
        double nota3 = p3*4;
        double media = (nota1+nota2+nota3)/10;
        
        JOptionPane.showMessageDialog(null, "A média é: "+media);
    }
}
