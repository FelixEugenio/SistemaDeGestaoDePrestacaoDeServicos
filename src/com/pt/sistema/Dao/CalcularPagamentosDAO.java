/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.sistema.Dao;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import com.pt.sistema.Jdbc.ConexaoBanco;
import com.pt.sistema.Model.CalcularPagamentoModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Felix Eugenio Mavila
 */
public class CalcularPagamentosDAO {
    
    private Connection conn;
    
    public CalcularPagamentosDAO(){
        this.conn = new ConexaoBanco().PegarConexao();
    }
    
    public void Salvar(CalcularPagamentoModel obj){
        try{
            String sql = "CALL inserir_pagamento(?)";
            
            java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
            
            stmt.setInt(1,obj.getEvento().getId());
            
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Calculo do Pagamento Realizado Com Sucesso");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao Realizar Calculo do Pagamento"+ e.getMessage());
        }
    }
}
