/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.sistema.Dao;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import com.pt.sistema.Jdbc.ConexaoBanco;
import com.pt.sistema.Model.CargoModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Felix Eugenio Mavila
 */
public class CargoDAO {
    
    private Connection conn;
    
    public CargoDAO(){
        this.conn = new ConexaoBanco().PegarConexao();
    }
    
    public void Salvar(CargoModel obj){
        try{
            String sql = "insert into Tbl_Cargo(cargo) values (?)";
            
            java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
            
            stmt.setString(1,obj.getCargo());
            
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Cargo Salvo Com Sucesso");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao Salvar o Cargo"+ e.getMessage());
        }
    }
    
    public List<CargoModel>Listar(){
        List<CargoModel>lista = new ArrayList<>();
        try{
            String sql = "select * from Tbl_Cargo";
             java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             
             while(rs.next()){
                 CargoModel obj = new CargoModel();
                 obj.setId(rs.getInt("id_cargo"));
                obj.setCargo(rs.getString("cargo"));
                
                
                lista.add(obj);
             }
             return lista;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao criar a lista"+ e.getMessage());
        }
        
        return null;
    }
    
}
