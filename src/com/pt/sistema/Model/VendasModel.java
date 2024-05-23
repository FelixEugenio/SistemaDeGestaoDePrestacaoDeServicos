/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.sistema.Model;

/**
 *
 * @author Felix Eugenio Mavila
 */
public class VendasModel {
    
    private int id;
    private EventosModel evento;
    private String data_de_venda;
    private double valor_pago;
    private int quantidade_de_servicos;
    private double subtotal_de_precos;
    private double troco;
    private ClientesModel cliente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EventosModel getEvento() {
        return evento;
    }

    public void setEvento(EventosModel evento) {
        this.evento = evento;
    }

    public String getData_de_venda() {
        return data_de_venda;
    }

    public void setData_de_venda(String data_de_venda) {
        this.data_de_venda = data_de_venda;
    }

    public double getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(double valor_pago) {
        this.valor_pago = valor_pago;
    }

    public int getQuantidade_de_servicos() {
        return quantidade_de_servicos;
    }

    public void setQuantidade_de_servicos(int quantidade_de_servicos) {
        this.quantidade_de_servicos = quantidade_de_servicos;
    }

    public double getSubtotal_de_precos() {
        return subtotal_de_precos;
    }

    public void setSubtotal_de_precos(double subtotal_de_precos) {
        this.subtotal_de_precos = subtotal_de_precos;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    public ClientesModel getCliente() {
        return cliente;
    }

    public void setCliente(ClientesModel cliente) {
        this.cliente = cliente;
    }
    
    

     
    
    
    

    
    
}
