package com.mycompany.pj01_construcao_de_classes;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */

public class UsuariosModel {
    private int id_usuario;
    private String nome_usuario;
    private int hierarquia_usuario;
    private String senha_usuario;
    
    public UsuariosModel(int id_usuario, String nome_usuario, int hierarquia_usuario, String senha_usuario)
    {
        this.id_usuario = id_usuario;
        this.nome_usuario = nome_usuario;
        this.hierarquia_usuario = hierarquia_usuario;
        this.senha_usuario = senha_usuario;
    }
     
    public String getNomeUsuario()
    {
        return nome_usuario;
    }
    
    public void setNomeUsuario(String nome_usuario)
    {
        this.nome_usuario = nome_usuario;
    }

    public int getHierarquiaUsuario()
    {
        return hierarquia_usuario;
    }
    
    public void setHierarquiaUsuario(int hierarquia_usuario)
    {
        this.hierarquia_usuario = hierarquia_usuario;
    }
    
    public String getSenhaUsuario()
    {
        return senha_usuario;
    }
    
    public void setSenhaUsuario(int hierarquia_usuario)
    {
        this.senha_usuario = senha_usuario;
    }
    
    public void exibirMensagem()
    {
        JOptionPane.showMessageDialog(null, String.format(
            "NomeUsuario: %s;\n HierarquiaUsuario: %d;\n SenhaUsuario: %s;", 
            getNomeUsuario(), getHierarquiaUsuario(), getSenhaUsuario()
        ));
    }
}
