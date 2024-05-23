/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.sistema.Model;

/**
 *
 * @author Felix Eugenio Mavila
 */
public class CargoModel {
    
    private int id;
    private String cargo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
   @Override
    public String toString(){
        return this.getCargo();
    }
    
}
