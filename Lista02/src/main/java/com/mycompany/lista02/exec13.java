package com.mycompany.lista02_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec13 {
    public static void main(String[] args) {
        Integer cc = Integer.parseInt(JOptionPane.showInputDialog("Digite as cilindradas do veículo: "));
        String categoria;
        if (cc >= 0 && cc <= 120) {
            categoria = "Sub Production";
        } else if (cc >= 121 && cc < 240) {
            categoria = "Production";
        } else if(cc >= 240) {
            categoria = "Super Production";
        } else {
            categoria = "Não encontrada";
        }
        JOptionPane.showMessageDialog(null, String.format("O veículo é da categoria: "+ categoria));
    }
}

