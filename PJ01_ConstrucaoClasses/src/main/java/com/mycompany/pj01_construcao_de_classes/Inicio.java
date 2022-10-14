package com.mycompany.pj01_construcao_de_classes;
import javax.swing.JOptionPane;
/* @author rodrigo_vinicius_amaral */

public class Inicio {
    public static void main(String[]args)
    {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(
            "Opções:\n (1)Definir Usuario\n"));
        
        switch(numero) {
            case 1:
                Usuarios.DefinirUsuario();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Até logo");
                break;
        }
        
    }
}
