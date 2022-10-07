package com.mycompany.lista01;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec12 {
    public static void main(String[] args) {
        Integer anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        Integer anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
        int idadeAtual = anoAtual - anoNascimento;

        JOptionPane.showMessageDialog(null, "Sua idade é de " + idadeAtual + "anos");
    }
}

