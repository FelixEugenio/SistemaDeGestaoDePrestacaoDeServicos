/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.sistema.Model;

/**
 *
 * @author Felix Eugenio Mavila
 */
public class EventosModel {
    
    private int id;
    private String tipoDeEvento;
    private String listaDeConvidados;
    private String enderecoDoEvento;
    private String dataDoEvento;
    private ClientesModel cliente;
    private LocalidadeModel localidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoDeEvento() {
        return tipoDeEvento;
    }

    public void setTipoDeEvento(String tipoDeEvento) {
        this.tipoDeEvento = tipoDeEvento;
    }

    public String getListaDeConvidados() {
        return listaDeConvidados;
    }

    public void setListaDeConvidados(String listaDeConvidados) {
        this.listaDeConvidados = listaDeConvidados;
    }

    public String getEnderecoDoEvento() {
        return enderecoDoEvento;
    }

    public void setEnderecoDoEvento(String enderecoDoEvento) {
        this.enderecoDoEvento = enderecoDoEvento;
    }

    public String getDataDoEvento() {
        return dataDoEvento;
    }

    public void setDataDoEvento(String dataDoEvento) {
        this.dataDoEvento = dataDoEvento;
    }

    public ClientesModel getCliente() {
        return cliente;
    }

    public void setCliente(ClientesModel cliente) {
        this.cliente = cliente;
    }

    public LocalidadeModel getLocalidade() {
        return localidade;
    }

    public void setLocalidade(LocalidadeModel localidade) {
        this.localidade = localidade;
    }

    @Override
    public String toString(){
        return this.getTipoDeEvento();
    } 
}
