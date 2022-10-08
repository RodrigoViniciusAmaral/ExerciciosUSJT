package com.mycompany.lista02;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec15 {
    public static void main(String[] args) {
        Double prova1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota de prova: "));
        Double prova2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota de prova: "));
        Double trabalho1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota de trabalho: "));
        Double trabalho2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota de trabalho: "));
        Double trabalho3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota de trabalho: "));
        double array[] = {prova1, prova2, trabalho1, trabalho2, trabalho3};
        int qtd_notas = array.length-1;
        double soma = 0;
        double media = 0;
        String resultado = "reprovado";
        for (int i=0;i<array.length-1;i++){
            soma= soma+array[i];
        }
        media = soma/qtd_notas;
        if (media >= 6){
            resultado = "aprovado";
        } else if (media >= 4) {
            resultado = "exame";
        }
        
        if (resultado.equals("exame")){
            JOptionPane.showMessageDialog(null, String.format("O aluno não alcançou a média e terá de realizar o "+ resultado));
        } else {
            JOptionPane.showMessageDialog(null, String.format("O status do aluno é: "+ resultado));
        }
    }
}

