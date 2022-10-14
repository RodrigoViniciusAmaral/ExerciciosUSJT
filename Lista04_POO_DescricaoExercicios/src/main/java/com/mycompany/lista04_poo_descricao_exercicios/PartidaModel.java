package com.mycompany.lista04_poo_descricao_exercicios;
import javax.swing.JOptionPane;

/* @author rodrigo_vinicius_amaral */


class PartidaModel {
    private String time1;
    private String time2;
    private int time1_gols;
    private int time2_gols;
    private String ganhador;
    
    Random gerador = new Random();
            
    public PartidaModel(String time1, String time2) {
        this.time1 = time1;
        this.time2 = time2;
        this.time1_gols = gerador.nextInt(8);
        this.time2_gols = gerador.nextInt(8);
        
        if(getTime1_gols() > getTime2_gols()){
            this.ganhador = time1;
        } else {
            this.ganhador = time2;
        }
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public final int getTime1_gols() {
        return time1_gols;
    }

    public void setTime1_gols(int time1_gols) {
        this.time1_gols = time1_gols;
    }

    public final int getTime2_gols() {
        return time2_gols;
    }

    public void setTime2_gols(int time2_gols) {
        this.time2_gols = time2_gols;
    }

    public String getGanhador() {
        return ganhador;
    }

    public void setGanhador(String ganhador) {
        this.ganhador = ganhador;
    }
    
    public void exibirMensagem()
    {
        JOptionPane.showMessageDialog(null, String.format("O ganhador foi o %s; com o placar de %d x %d", 
            getGanhador(), getTime1_gols(), getTime2_gols()));
    }
}
