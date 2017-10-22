package com.juliao.adryel.guiaeaj;

/**
 * Created by ADRYEL on 22/10/2017.
 */

public class SetorEAJ {
    private String nomeSetor;
    private String horarioFuncionamento;
    private String emailResponsavel;
    private String nomeResponsavel;
    private int image;
    private String descricao;
    private int textao;



    public SetorEAJ(String nomeSetor, String horarioFuncionamento, int textao) {
        this.nomeSetor = nomeSetor;
        this.horarioFuncionamento = horarioFuncionamento;
        this.textao = textao;
    }

    public SetorEAJ(String nomeSetor, String horarioFuncionamento, String descricao) {
        this.nomeSetor = nomeSetor;
        this.horarioFuncionamento = horarioFuncionamento;
        this.descricao = descricao;
    }

    public void setTextao(int textao) {
        this.textao = textao;
    }

    public int getTextao() {

        return textao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public void setEmailResponsavel(String emailResponsavel) {
        this.emailResponsavel = emailResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public String getEmailResponsavel() {
        return emailResponsavel;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public int getImage() {
        return image;
    }
}
