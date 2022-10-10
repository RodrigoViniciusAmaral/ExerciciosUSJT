package com.mycompany.lista02_descricao_exercicios;
import javax.swing.JOptionPane;
import java.util.Objects;

/* @author rodrigo_vinicius_amaral */
public class exec09 {
    public static void main(String[] args) {
        Double a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira aresta: "));
        Double a2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda aresta: "));
        Double a3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira aresta: "));
        String tipo_triangulo = "";
        if((a1+a2) < a3 || (a1+a3) < a2 || (a3+a2) < a1) {
            JOptionPane.showMessageDialog(null, String.format("Não é possível formar um triângulo."));
        } 
        else {
            if(!Objects.equals(a1, a2) && !Objects.equals(a1, a3) && !Objects.equals(a2, a3)){
                tipo_triangulo = "escaleno"; 
            } 
            else if(Objects.equals(a1, a2) && Objects.equals(a1, a3) && Objects.equals(a2, a3)) {
                tipo_triangulo = "equilátero"; 
            }
            else {
                tipo_triangulo = "isósceles";
            }
            JOptionPane.showMessageDialog(null, String.format("O tipo do triângulo é: "+ tipo_triangulo));
        }
    }
}

