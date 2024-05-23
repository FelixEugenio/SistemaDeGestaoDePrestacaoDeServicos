/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.sistema.Model;

/**
 *
 * @author Felix Eugenio Mavila
 */
public class ClientesModel {
    
    private int id;
    private String nomeDoCliente;
    private String email;
    private String endereco;
    private String dataDeNascimento;
    private int telefone;
    private int nif;
    private LocalidadeModel localidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public LocalidadeModel getLocalidade() {
        return localidade;
    }

    public void setLocalidade(LocalidadeModel localidade) {
        this.localidade = localidade;
    }
    
    @Override
    public String toString(){
        return this.getNomeDoCliente();
    }

    
}
