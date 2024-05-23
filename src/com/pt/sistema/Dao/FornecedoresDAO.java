/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.sistema.Dao;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import com.pt.sistema.Jdbc.ConexaoBanco;
import com.pt.sistema.Model.FornecedoresModel;
import com.pt.sistema.Model.LocalidadeModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Felix Eugenio Mavila
 */
public class FornecedoresDAO {
    
    private Connection conn;
    
    public FornecedoresDAO(){
        this.conn = new ConexaoBanco().PegarConexao();
    }
    
    public void Salvar(FornecedoresModel obj){
        try{
            String sql = "insert into Tbl_Fornecedores(nome_do_fornecedor,email,data_de_nascimento,nif,telefone,endereco,id_localidade,id_servico) values(?,?,?,?,?,?,?,?)";
            java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
            
            stmt.setString(1,obj.getNomeDoFornecedor());
            stmt.setString(2,obj.getEmail());
            stmt.setString(3,obj.getDataDeNascimento());
            stmt.setInt(4,obj.getNif());
            stmt.setInt(5,obj.getTelefone());
            stmt.setString(6,obj.getEndereco());
            stmt.setInt(7,obj.getLocalidade().getId());
            stmt.setInt(8,obj.getServico().getId());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, " Fornecedor Salvo Com Sucesso ");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, " erro ao Salvar o Fornecedor "+ e.getMessage());
        }
    }
    
    public List<FornecedoresModel>Listar(){
        List<FornecedoresModel>lista = new ArrayList<>();
        try{
            String sql = "select * from Tbl_Fornecedores";
             java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             
             while(rs.next()){
                 FornecedoresModel obj = new FornecedoresModel();
                 obj.setId(rs.getInt("id_fornecedor"));
                 obj.setNomeDoFornecedor(rs.getString("nome_do_fornecedor"));
                 lista.add(obj);
             }
             return lista;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao criar a lista"+ e.getMessage());
        }
        return null;
    }
    
     public List<FornecedoresModel>ListarNaTabela(){
        List<FornecedoresModel>lista = new ArrayList<>();
        try{
            String sql = " select f.id_fornecedor,f.nome_do_fornecedor,f.nif,f.email,f.data_de_nascimento,f.telefone,f.endereco,l.cidade,l.cod_postal from Tbl_Fornecedores as f inner join Tbl_Localidades as l on f.id_localidade=l.id_localidade";
             java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             
             while(rs.next()){
                 FornecedoresModel obj = new FornecedoresModel();
                 LocalidadeModel l = new LocalidadeModel();
               
                 obj.setId(rs.getInt("f.id_fornecedor"));
                obj.setNomeDoFornecedor(rs.getString("f.nome_do_fornecedor"));
                obj.setEmail(rs.getString("f.email"));
                obj.setEndereco(rs.getString("f.endereco"));
                obj.setNif(rs.getInt("f.nif"));
                obj.setDataDeNascimento(rs.getString("f.data_de_nascimento"));
                obj.setTelefone(rs.getInt("f.telefone"));
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
