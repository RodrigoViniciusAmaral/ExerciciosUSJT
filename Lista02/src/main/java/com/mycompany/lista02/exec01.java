
package com.mycompany.lista02;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec01 {
    public static void main(String[] args) {
        Double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        Double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        double media = Math.rint((n1+n2)/2);
        String msg;
        if(media >= 6){
            msg = "Aprovado";
        } else {
            msg = "Reprovado";
        }
        JOptionPane.showMessageDialog(null, "A média das notas é: " + media+"\nO aluno foi "+ msg);
    }
}