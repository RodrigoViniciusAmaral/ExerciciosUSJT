package com.mycompany.lista04_poo_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */

public class Inicio {
    public static void main(String[]args)
    {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(
                "Opções:\n (1)Definir Jogador\n (2)Definir partida \n (3)Definir time \n(0)Sair "));
        
        switch(numero) {
            case 1:
                Jogadores.DefinirJogador();
                break;
            case 2:
                Partida.DefinirPartida();
                break;
            case 3:
                Time.DefinirTime();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Até logo");
                break;
        }
        
    }
}
