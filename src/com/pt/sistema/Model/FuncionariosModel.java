/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.sistema.Model;

/**
 *
 * @author Felix Eugenio Mavila
 */
public class FuncionariosModel {
    
    private int id;
    private String nomeDoFuncionario;
    private String email;
    private String endereco;
    private String dataDeNascimento;
    private String Senha;
    private int telefone;
    private int nif;
    private int horasDeTrabalho;
    private LocalidadeModel localidade;
    private CargoModel cargo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDoFuncionario() {
        return nomeDoFuncionario;
    }

    public void setNomeDoFuncionario(String nomeDoFuncionario) {
        this.nomeDoFuncionario = nomeDoFuncionario;
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

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
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

    public int getHorasDeTrabalho() {
        return horasDeTrabalho;
    }

    public void setHorasDeTrabalho(int horasDeTrabalho) {
        this.horasDeTrabalho = horasDeTrabalho;
    }

    public LocalidadeModel getLocalidade() {
        return localidade;
    }

    public void setLocalidade(LocalidadeModel localidade) {
        this.localidade = localidade;
    }

    public CargoModel getCargo() {
        return cargo;
    }

    public void setCargo(CargoModel cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString(){
        return this.getNomeDoFuncionario();
    }

    
}
