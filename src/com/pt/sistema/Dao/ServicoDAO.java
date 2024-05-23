/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.sistema.Dao;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import com.pt.sistema.Jdbc.ConexaoBanco;
import com.pt.sistema.Model.ServicoModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Felix Eugenio Mavila
 */
public class ServicoDAO {
    
    private Connection conn;
    
    public ServicoDAO(){
        this.conn = new ConexaoBanco().PegarConexao();
    }
    
    public void Salvar(ServicoModel obj){
        try{
            //String sql = "insert into Tbl_Servicos(tipo_de_servico,preco,duracao) values (?,?,?)";
            String sql = "CALL InserirServico(?,?,?)";
            java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
            
            stmt.setString(1,obj.getTipoDeServico());
            stmt.setDouble(2,obj.getPreco());
            stmt.setInt(3,obj.getDuracao());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Serviço Salvo Com Sucesso");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao Salvar o Serviço"+ e.getMessage());
        }
    }
    
    public List<ServicoModel>Listar(){
        List<ServicoModel>lista = new ArrayList<>();
        try{
            String sql = "select * from Tbl_Servicos";
             java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             
             while(rs.next()){
                 ServicoModel obj = new ServicoModel();
                 obj.setId(rs.getInt("id_servico"));
                obj.setTipoDeServico(rs.getString("tipo_de_servico"));
                obj.setPreco(rs.getDouble("preco"));
                obj.setDuracao(rs.getInt("duracao"));
                
                lista.add(obj);
             }
             return lista;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao criar a lista"+ e.getMessage());
        }
        
        return null;
    }
}
