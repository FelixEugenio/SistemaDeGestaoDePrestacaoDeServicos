/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.sistema.Dao;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import com.pt.sistema.Jdbc.ConexaoBanco;
import com.pt.sistema.Model.ContratoFuncionarioModel;
import com.pt.sistema.Model.FuncionariosModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Felix Eugenio Mavila
 */
public class ContratoFuncionariosDAO {
    
    private Connection conn;
    
    public ContratoFuncionariosDAO(){
        this.conn = new ConexaoBanco().PegarConexao();
    }
    
    public void Salvar(ContratoFuncionarioModel obj){
        try{
            String sql = "insert into Tbl_ContratoFuncionario(data_de_inicio,data_de_fim,valor_do_contrato,status_do_contrato,termos_e_condicoes,id_funcionario) values(?,?,?,?,?,?)";
            java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
            
            stmt.setString(1,obj.getDataDeInicio());
            stmt.setString(2,obj.getDataDeFim());
            stmt.setDouble(3,obj.getValorDoContrato());
            stmt.setString(4,obj.getStatusDocontrato());
            stmt.setString(5,obj.getTermosEcondicoes());
            stmt.setInt(6,obj.getFuncionario().getId());
            
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, " Contrato com o Funcionario Salvo Com Sucesso ");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, " erro ao Salvar o Contrato com Funcionario "+ e.getMessage());
        }
    }
    
    public List<ContratoFuncionarioModel>ListarNaTabela(){
        List<ContratoFuncionarioModel>lista = new ArrayList<>();
        try{
            String sql = "select c.id_contrato_funcionario,c.data_de_inicio,c.data_de_fim,c.valor_do_contrato,c.status_do_contrato,c.termos_e_condicoes,f.nome_do_funcionario from Tbl_ContratoFuncionario as c inner join Tbl_Funcionarios as f on c.id_funcionario = f.id_funcionario";
             java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             
             while(rs.next()){
                 ContratoFuncionarioModel obj = new ContratoFuncionarioModel();
                 FuncionariosModel f = new FuncionariosModel();
               
                 obj.setId(rs.getInt("c.id_contrato_funcionario"));
                obj.setDataDeInicio(rs.getString("c.data_de_inicio"));
                obj.setDataDeFim(rs.getString("c.data_de_fim"));
                obj.setValorDoContrato(rs.getDouble("c.valor_do_contrato"));
                obj.setStatusDocontrato(rs.getString("c.status_do_contrato"));
                obj.setTermosEcondicoes(rs.getString("c.termos_e_condicoes"));
               
                f.setNomeDoFuncionario(rs.getString("f.nome_do_funcionario"));
                obj.setFuncionario(f);
             
                lista.add(obj);
             }
             return lista;
        }catch(SQLException e){
      JOptionPane.showMessageDialog(null, "erro ao criar a lista"+ e.getMessage());
        }
        return null;
    }
    
   
}
