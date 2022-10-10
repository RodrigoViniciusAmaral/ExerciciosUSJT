package com.mycompany.lista02_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec02 {
    public static void main(String[] args) {
        Double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
        String sexo = "indefinido";
        double peso = 0;
        Integer sexo_times = 0;
        while (!sexo.equals("m") && !sexo.equals("f")){
            if (sexo_times.equals(0)){
                sexo = JOptionPane.showInputDialog("Digite seu sexo (M ou F):").toLowerCase();
            } else {
                sexo = JOptionPane.showInputDialog("Caractere incorreto, digite seu sexo novamente (M ou F):").toLowerCase();
            }
            sexo_times += 1;
        }
        
        if(sexo.equals("m")){
            peso = 72.7 * altura - 58;
        } else if(sexo.equals("f")){
            peso =  62.1 * altura - 44.7;
        }
        JOptionPane.showMessageDialog(null, "Seu peso ideal é: " + peso);            
    }
}