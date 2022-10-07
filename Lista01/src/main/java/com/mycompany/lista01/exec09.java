package com.mycompany.lista01;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec09 {
    public static void main(String[] args) {
        Integer idadeAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        Integer anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
        int idadeViradaSeculo = 2100 - anoAtual + idadeAtual;

        JOptionPane.showMessageDialog(null, "Você terá " + idadeViradaSeculo + "anos de idade no próximo século");
    }
}
