package com.mycompany.lista03_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec01 {
    public static void main(String[] args) {
        Integer entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtd de valores: "));
        int i = 0;
        double total = 0;
        while(i < entrada){
           Double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
           total = total + valor;
           i ++;
        }
        JOptionPane.showMessageDialog(null, String.format("O total da soma é: "+ total));
    }
}
