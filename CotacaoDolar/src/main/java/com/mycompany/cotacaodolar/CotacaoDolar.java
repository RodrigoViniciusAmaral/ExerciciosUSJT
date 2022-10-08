package com.mycompany.cotacaodolar;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
/* Ler a cotação do dolar e quantidade de dólares. Coverter pra real e mostrar o resultado */
public class CotacaoDolar {
    public static void main(String[] args) {
        Double cotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do dólar: "));
        Double dolares = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de dólares: "));
        double real = Math.rint(dolares/cotacao);
        JOptionPane.showMessageDialog(null, "A conversão para real é: R$" + real);
    }
}
