/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.pt.sistema.Jdbc;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
/**
 *
 * @author Felix Eugenio Mavila
 */
public class TestarConexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            new ConexaoBanco().PegarConexao();
            JOptionPane.showMessageDialog(null, "Conectado com sucesso ao banco de dados");
        }catch(HeadlessException erro){
            JOptionPane.showMessageDialog(null, "Erro ao Tentar se conectar ao banco de dados "+erro.getMessage());
        }
    }
    
}
