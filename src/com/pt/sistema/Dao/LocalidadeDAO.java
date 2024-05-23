/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.sistema.Dao;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import com.pt.sistema.Jdbc.ConexaoBanco;
import com.pt.sistema.Model.LocalidadeModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Felix Eugenio Mavila
 */
public class LocalidadeDAO {
    
    private Connection conn;
    
    public LocalidadeDAO(){
        this.conn = new ConexaoBanco().PegarConexao();
    }
    
    public void Salvar(LocalidadeModel obj){
        try{
            String sql = "insert into Tbl_Localidades(cidade,cod_postal) values (?,?)";
            java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
            
            stmt.setString(1,obj.getCidade());
            stmt.setString(2,obj.getCod_postal());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Localidade Salva Com Sucesso");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao Salvar a Localidade"+ e.getMessage());
        }
    }
    
    public List<LocalidadeModel>Listar(){
        List<LocalidadeModel>lista = new ArrayList<>();
        try{
            String sql = "select * from Tbl_Localidades";
             java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             
             while(rs.next()){
                 LocalidadeModel obj = new LocalidadeModel();
                 obj.setId(rs.getInt("id_localidade"));
                obj.setCidade(rs.getString("cidade"));
                obj.setCod_postal(rs.getString("cod_postal"));
                
                lista.add(obj);
             }
             return lista;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao criar a lista"+ e.getMessage());
        }
        
        return null;
    }
}
