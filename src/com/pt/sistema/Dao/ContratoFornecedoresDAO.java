/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.sistema.Dao;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import com.pt.sistema.Jdbc.ConexaoBanco;
import com.pt.sistema.Model.ContratoFornecedorModel;
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
public class ContratoFornecedoresDAO {
    
    private Connection conn;
    
    public ContratoFornecedoresDAO(){
        this.conn = new ConexaoBanco().PegarConexao();
    }
    
    public void Salvar(ContratoFornecedorModel obj){
        try{
            String sql = "insert into Tbl_ContratoFornecedor(data_de_inicio,data_de_fim,valor_do_contrato,status_do_contrato,termos_e_condicoes,id_fornecedor) values(?,?,?,?,?,?)";
            java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
            
            stmt.setString(1,obj.getDataDeInicio());
            stmt.setString(2,obj.getDataDeFim());
            stmt.setDouble(3,obj.getValorDoContrato());
            stmt.setString(4,obj.getStatusDocontrato());
            stmt.setString(5,obj.getTermosEcondicoes());
            stmt.setInt(6,obj.getFornecedor().getId());
            
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, " Contrato com o Fornecedor Salvo Com Sucesso ");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, " erro ao Salvar o Contrato com Fornecedor "+ e.getMessage());
        }
    }
    
    public List<ContratoFornecedorModel>ListarNaTabela(){
        List<ContratoFornecedorModel>lista = new ArrayList<>();
        try{
            String sql = "select c.id_contrato_fornecedor,c.data_de_inicio,c.data_de_fim,c.valor_do_contrato,c.status_do_contrato,c.termos_e_condicoes,f.nome_do_fornecedor from Tbl_ContratoFornecedor as c inner join Tbl_Fornecedores as f on c.id_fornecedor = f.id_fornecedor";
             java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             
             while(rs.next()){
                 ContratoFornecedorModel obj = new ContratoFornecedorModel();
                 FornecedoresModel f = new FornecedoresModel();
               
                 obj.setId(rs.getInt("c.id_contrato_fornecedor"));
                obj.setDataDeInicio(rs.getString("c.data_de_inicio"));
                obj.setDataDeFim(rs.getString("c.data_de_fim"));
                obj.setValorDoContrato(rs.getDouble("c.valor_do_contrato"));
                obj.setStatusDocontrato(rs.getString("c.status_do_contrato"));
                obj.setTermosEcondicoes(rs.getString("c.termos_e_condicoes"));
               
                f.setNomeDoFornecedor(rs.getString("f.nome_do_fornecedor"));
                obj.setFornecedor(f);
             
                lista.add(obj);
             }
             return lista;
        }catch(SQLException e){
      JOptionPane.showMessageDialog(null, "erro ao criar a lista"+ e.getMessage());
        }
        return null;
    }
}
