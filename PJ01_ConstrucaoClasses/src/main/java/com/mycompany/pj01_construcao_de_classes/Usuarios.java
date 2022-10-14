package com.mycompany.pj01_construcao_de_classes;
import javax.swing.JOptionPane;
/* @author rodrigo_vinicius_amaral */

public class Usuarios {
    public static void DefinirUsuario() {
        int i = 1;
        int numero_usuarios = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de usuarios ou 0 para sair: "));
        while(numero_usuarios != 0){
            int id_usuarioi = i;
            int tentativas = 0;
            String nome_usuarioi = "";
            int hierarquia_usuarioi = 0;
            String senha_usuarioi = "";
            while (nome_usuarioi.equals("")){
                if(tentativas == 0){
                   nome_usuarioi = JOptionPane.showInputDialog("Digite o nome do usuário: "); 
                }else{
                  nome_usuarioi = JOptionPane.showInputDialog("Nome incorreto! Digite o nome do usuário novamente: ");   
                }
                tentativas++;
            }
            tentativas = 0;
            while (hierarquia_usuarioi != 1 && hierarquia_usuarioi != 2){
                if(tentativas == 0){
                   hierarquia_usuarioi = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma hierarquia de usuario: \n (1)Aluno \n (2)Professor ")); 
                }else{
                  hierarquia_usuarioi = Integer.parseInt(JOptionPane.showInputDialog("Incorreto! Selecione uma hierarquia de usuario abaixo:\n (1)Aluno \n (2)Professor")); 
                }
                tentativas++;
            }
            tentativas = 0;
            while(senha_usuarioi.equals("")){
                if(tentativas == 0){
                    senha_usuarioi = JOptionPane.showInputDialog("Digite a senha do usuário: "); 
                }else{
                    senha_usuarioi = JOptionPane.showInputDialog("Nome incorreto! Digite a senha do usuário novamente: ");   
                }
                tentativas++;
            }
            UsuariosModel usuarioi = new UsuariosModel(id_usuarioi, nome_usuarioi, hierarquia_usuarioi, senha_usuarioi);
            usuarioi.exibirMensagem();
            if (i == numero_usuarios){
                numero_usuarios = 0;
            } else {
                i++;
            }
        }
    }
}
