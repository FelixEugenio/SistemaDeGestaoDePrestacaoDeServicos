/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.sistema.Jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author Felix Eugenio Mavila
 */
public class ConexaoBanco {
    final private String url ="jdbc:mysql://localhost/sistemaDeGestaoDePrestacaoDeServico";
    final private String usuario ="root";
    final private String senha ="admin";
    
    public Connection PegarConexao(){
        try{
            return DriverManager.getConnection(url,usuario,senha);
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao se connectar com o banco de dados");
        }
        
        return null;
    }
    
}
