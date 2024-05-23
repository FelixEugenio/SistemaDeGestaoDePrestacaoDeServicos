/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.sistema.Dao;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import com.pt.sistema.Jdbc.ConexaoBanco;
import com.pt.sistema.Model.CarrinhoModel;
import com.pt.sistema.Model.EventosModel;
import com.pt.sistema.Model.ClientesModel;
import com.pt.sistema.Model.LocalidadeModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Felix Eugenio Mavila
 */
public class CarrinhoDAO {
    
    private Connection conn;
    
    public CarrinhoDAO(){
        this.conn = new ConexaoBanco().PegarConexao();
    }
    
     
     public List<CarrinhoModel>Listar(){
        List<CarrinhoModel>lista = new ArrayList<>();
        try{
            String sql = "select * from Tbl_Carrinho";
             java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             
             while(rs.next()){
                 CarrinhoModel obj = new CarrinhoModel();
                 obj.setId(rs.getInt("id_carrinho"));
                 obj.setQuantidade_de_servicos(rs.getInt("quantidade_de_servicos"));
                 obj.setId_evento(rs.getInt("id_evento"));
                 obj.setSubtotal_de_precos(rs.getDouble("subtotal_de_precos"));
                 lista.add(obj);
             }
             return lista;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao criar a lista"+ e.getMessage());
        }
        
        return null;
    }
}
