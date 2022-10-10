package com.mycompany.lista01_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec11 {
    public static void main(String[] args) {
        Double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: "));
        Double vendas = Double.parseDouble(JOptionPane.showInputDialog("Digite a soma de todas as vendas: "));
        double comissao = vendas*4/100;
        double salarioTotal = salario+comissao;
        
        JOptionPane.showMessageDialog(null, "Seu salário esse mês foi de R$"+salarioTotal+"\n Sua comissao foi de R$"+comissao);
    }
}
