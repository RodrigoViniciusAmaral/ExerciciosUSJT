package com.mycompany.lista04_poo_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */


public class Partida {
    public static void DefinirPartida()
    {
        String time1 = JOptionPane.showInputDialog("Digite o nome do primeiro time: ");
        String time2 = JOptionPane.showInputDialog("Digite o nome do segundo time: ");

        PartidaModel partidai = new PartidaModel(time1, time2);

        partidai.exibirMensagem();
    }  
}
