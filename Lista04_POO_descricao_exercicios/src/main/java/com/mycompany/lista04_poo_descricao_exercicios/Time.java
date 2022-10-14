package com.mycompany.lista04_poo_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */


public class Time {
    public static void DefinirTime() {
        int i = 1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de times ou 0 para sair: "));

        while (numero != 0) {
            String nomei = JOptionPane.showInputDialog("Nome do Time: ");
            String classei = JOptionPane.showInputDialog("Classe: ");

            TimeModel timei = new TimeModel(nomei, classei);

            timei.exibirMensagem();
            i++;
        } 
    } 
}
