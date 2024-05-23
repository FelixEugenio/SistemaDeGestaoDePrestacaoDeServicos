/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.sistema.Model;

/**
 *
 * @author Felix Eugenio Mavila
 */
public class ServicoModel {
    
    private int id;
    private String tipoDeServico;
    private double preco;
    private int duracao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoDeServico() {
        return tipoDeServico;
    }

    public void setTipoDeServico(String tipoDeServico) {
        this.tipoDeServico = tipoDeServico;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString(){
        return this.getTipoDeServico();
    }
    
    
}
