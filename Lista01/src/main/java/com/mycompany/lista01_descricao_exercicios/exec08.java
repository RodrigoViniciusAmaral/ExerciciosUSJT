package com.mycompany.lista01_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */
public class exec08 {
    public static void main(String[] args) {
        Double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância percorrida(em Km): "));
        Double gasolina = Double.parseDouble(JOptionPane.showInputDialog("Digite a gasolina gasta(em Litros) por Km: "));
        double total = Math.rint(distancia / gasolina);

        JOptionPane.showMessageDialog(null, "O carro gastou um total de " + total + " Litros");
    }
}
