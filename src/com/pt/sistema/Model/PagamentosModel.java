/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.sistema.Model;
import com.pt.sistema.Model.EventosModel;

/**
 *
 * @author Felix Eugenio Mavila
 */
public class PagamentosModel {
    
    private int id;
    private double valor_Pago;
    private double totalApagar;
    private int quantidade_de_servicos ;
    private int troco ;
    private String datadepagamento;
    private EventosModel  evento;
    private String metododePagamento;
    private String StatusdoPagamento;
    private ClientesModel cliente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor_Pago() {
        return valor_Pago;
    }

    public void setValor_Pago(double valor_Pago) {
        this.valor_Pago = valor_Pago;
    }

    public double getTotalApagar() {
        return totalApagar;
    }

    public void setTotalApagar(double totalApagar) {
        this.totalApagar = totalApagar;
    }

    public int getQuantidade_de_servicos() {
        return quantidade_de_servicos;
    }

    public void setQuantidade_de_servicos(int quantidade_de_servicos) {
        this.quantidade_de_servicos = quantidade_de_servicos;
    }

    public int getTroco() {
        return troco;
    }

    public void setTroco(int troco) {
        this.troco = troco;
    }

    public String getDatadepagamento() {
        return datadepagamento;
    }

    public void setDatadepagamento(String datadepagamento) {
        this.datadepagamento = datadepagamento;
    }

    public EventosModel getEvento() {
        return evento;
    }

    public void setEvento(EventosModel evento) {
        this.evento = evento;
    }

    public String getMetododePagamento() {
        return metododePagamento;
    }

    public void setMetododePagamento(String metododePagamento) {
        this.metododePagamento = metododePagamento;
    }

    public String getStatusdoPagamento() {
        return StatusdoPagamento;
    }

    public void setStatusdoPagamento(String StatusdoPagamento) {
        this.StatusdoPagamento = StatusdoPagamento;
    }

    public ClientesModel getCliente() {
        return cliente;
    }

    public void setCliente(ClientesModel cliente) {
        this.cliente = cliente;
    }

    
    

    
    
}
