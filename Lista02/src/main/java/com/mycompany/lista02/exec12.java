package com.mycompany.lista02_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec12 {
    public static void main(String[] args) {
        String nome1 = JOptionPane.showInputDialog("Digite um nome: ");
        Integer dia = Integer.parseInt(JOptionPane.showInputDialog(String.format("Digite o dia de nascimento do " + nome1)));
        Integer mes = Integer.parseInt(JOptionPane.showInputDialog(String.format("Digite o mês de nascimento do " + nome1)));
        Integer ano = Integer.parseInt(JOptionPane.showInputDialog(String.format("Digite o ano de nascimento do " + nome1)));
        String nome2 = JOptionPane.showInputDialog("Digite outro nome: ");
        Integer dia2 = Integer.parseInt(JOptionPane.showInputDialog(String.format("Digite o dia de nascimento do " + nome2)));
        Integer mes2 = Integer.parseInt(JOptionPane.showInputDialog(String.format("Digite o mês de nascimento do " + nome2)));
        Integer ano2 = Integer.parseInt(JOptionPane.showInputDialog(String.format("Digite o ano de nascimento do " + nome2)));
        String pessoa_velha = "";
        if (ano2 > ano) {
            pessoa_velha = String.format("A pessoa mais velha é o(a) " + nome1);
        } else if (ano2 < ano) {
            pessoa_velha = String.format("A pessoa mais velha é o(a) " + nome2);
        } else {
            if (mes2 > mes) {
                pessoa_velha = String.format("A pessoa mais velha é o(a) " + nome1);
            } else if (mes2 < mes) {
                pessoa_velha = String.format("A pessoa mais velha é o(a) " + nome2);
            } else {
                if (dia2 > dia) {
                    pessoa_velha = String.format("A pessoa mais velha é o(a) " + nome1);
                } else if (dia2 < dia) {
                    pessoa_velha = String.format("A pessoa mais velha é o(a) " + nome2);
                }
            }
        }
        JOptionPane.showMessageDialog(null, pessoa_velha);
    }
}

