/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.sistema.Dao;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import com.pt.sistema.Jdbc.ConexaoBanco;
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
public class ClientesDAO {
    
    private Connection conn;
    
    public ClientesDAO(){
        this.conn = new ConexaoBanco().PegarConexao();
    }
    
    public void Salvar(ClientesModel obj){
        try{
            String sql = "insert into Tbl_Clientes(nome_do_cliente,email,data_de_nascimento,nif,telefone,endereco,id_localidade) values (?,?,?,?,?,?,?)";
            java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
            
            stmt.setString(1,obj.getNomeDoCliente());
            stmt.setString(2,obj.getEmail());
            stmt.setString(3,obj.getDataDeNascimento());
            stmt.setInt(4,obj.getNif());
            stmt.setInt(5,obj.getTelefone());
            stmt.setString(6,obj.getEndereco());
            stmt.setInt(7,obj.getLocalidade().getId());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Cliente Salvo Com Sucesso");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao Salvar o Cliente"+ e.getMessage());
        }
    }
    
     public List<ClientesModel>Listar(){
        List<ClientesModel>lista = new ArrayList<>();
        try{
            String sql = "select * from Tbl_Clientes";
             java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             
             while(rs.next()){
                 ClientesModel obj = new ClientesModel();
                 obj.setId(rs.getInt("id_cliente"));
                 obj.setNomeDoCliente(rs.getString("nome_do_cliente"));
                 lista.add(obj);
             }
             return lista;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao criar a lista"+ e.getMessage());
        }
        
        return null;
    }
     
     public List<ClientesModel>ListarNaTabela(){
        List<ClientesModel>lista = new ArrayList<>();
        try{
            String sql = " select c.id_cliente,c.nome_do_cliente,c.nif,c.email,c.data_de_nascimento,c.telefone,c.endereco,l.cidade,l.cod_postal from Tbl_Clientes as c inner join Tbl_Localidades as l on c.id_localidade=l.id_localidade;";
             java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             
             while(rs.next()){
                 ClientesModel obj = new ClientesModel();
                 LocalidadeModel l = new LocalidadeModel();
               
                 
                 
                 obj.setId(rs.getInt("c.id_cliente"));
                obj.setDataDeNascimento(rs.getString("c.data_de_nascimento"));
                obj.setEmail(rs.getString("c.email"));
                obj.setEndereco(rs.getString("c.endereco"));
                obj.setNif(rs.getInt("c.nif"));
                obj.setNomeDoCliente(rs.getString("c.nome_do_cliente"));
                obj.setTelefone(rs.getInt("c.telefone"));
                l.setCidade(rs.getString("l.cidade"));
                l.setCod_postal(rs.getString("l.cod_postal"));
                obj.setLocalidade(l);
             
                lista.add(obj);
             }
             return lista;
        }catch(SQLException e){
      JOptionPane.showMessageDialog(null, "erro ao criar a lista"+ e.getMessage());
        }
        return null;
    }
}
