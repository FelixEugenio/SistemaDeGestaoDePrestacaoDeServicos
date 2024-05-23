/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.sistema.Model;
import com.pt.sistema.Model.FuncionariosModel;
/**
 *
 * @author Felix Eugenio Mavila
 */
public class ContratoFuncionarioModel {
    
    private int id;
    private FuncionariosModel funcionario;
    private String dataDeInicio;
    private String dataDeFim;
    private double valorDoContrato;
    private String termosEcondicoes;
    private String statusDocontrato;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FuncionariosModel getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionariosModel funcionario) {
        this.funcionario = funcionario;
    }

    public String getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(String dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public String getDataDeFim() {
        return dataDeFim;
    }

    public void setDataDeFim(String dataDeFim) {
        this.dataDeFim = dataDeFim;
    }

    public double getValorDoContrato() {
        return valorDoContrato;
    }

    public void setValorDoContrato(double valorDoContrato) {
        this.valorDoContrato = valorDoContrato;
    }

    public String getTermosEcondicoes() {
        return termosEcondicoes;
    }

    public void setTermosEcondicoes(String termosEcondicoes) {
        this.termosEcondicoes = termosEcondicoes;
    }

    public String getStatusDocontrato() {
        return statusDocontrato;
    }

    public void setStatusDocontrato(String statusDocontrato) {
        this.statusDocontrato = statusDocontrato;
    }

   

    
    
   
    
}
