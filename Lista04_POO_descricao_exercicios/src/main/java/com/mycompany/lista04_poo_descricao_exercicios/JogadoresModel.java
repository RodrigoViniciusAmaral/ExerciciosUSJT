package com.mycompany.lista04_poo_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */

public class JogadoresModel {
    private String nome;
    private String selecao;
    private String posicao;
    private int numero;
    
    public JogadoresModel(String selecao, int numero, String nome, String posicao) {
        this.nome = nome;
        this.selecao = selecao;
        this.posicao = posicao;
        this.numero = numero;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getSelecao() {
        return selecao;
    }

    public void setSelecao(String selecao) {
        this.selecao = selecao;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void exibirMensagem()
    {
        JOptionPane.showMessageDialog(null, String.format(
            "Jogador: %s; Camisa: %d; Seleção: %s; Posição: %s", 
            getNome(), getNumero(), getSelecao(), getPosicao()
        ));
    }
}
