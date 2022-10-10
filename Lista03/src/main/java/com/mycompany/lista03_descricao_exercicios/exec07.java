package com.mycompany.lista03_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec07 {
    public static void main(String[] args) { 
        int total = 0;
        int i = 0;
        double media = 0;
        while(1 != 0) {
            Integer nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota final: "));
            if(nota == -1){
                break;
            }
            if(nota > 10 || nota < 0){
                JOptionPane.showMessageDialog(null, "Valor inválido.");
                break;
            }
            total += nota;
            i ++;
        }
        media = total/i;
        JOptionPane.showMessageDialog(null, String.format("A média é: "+ media + "."));
    }
}

