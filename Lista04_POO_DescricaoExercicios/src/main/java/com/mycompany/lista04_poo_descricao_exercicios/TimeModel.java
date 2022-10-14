package com.mycompany.lista04_poo_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */

public class TimeModel {
    private String nome;
    private String classe;
    
    public TimeModel(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void exibirMensagem()
    {
        JOptionPane.showMessageDialog(null, String.format(
            "Time: %s; Classe: %s", getNome(), getClasse()));
    }    
}
