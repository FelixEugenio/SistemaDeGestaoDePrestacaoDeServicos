/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.sistema.Dao;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import com.pt.sistema.Jdbc.ConexaoBanco;
import com.pt.sistema.Model.VendasModel;
import com.pt.sistema.Model.CarrinhoModel;
import com.pt.sistema.Model.EventosModel;
import com.pt.sistema.Model.ClientesModel;
import com.pt.sistema.Model.LocalidadeModel;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Felix Eugenio Mavila
 */
public class VendasDAO {
    
    private Connection conn;
    
    public VendasDAO(){
        this.conn = new ConexaoBanco().PegarConexao();
    }
    
    public void Salvar(VendasModel obj){
        try{
            String sql = "insert into Tbl_Vendas(id_evento,quantidade_de_servicos,subtotal_de_precos,data_de_venda,valor_pago,troco) values (?,?,?,?,?,?)";
            java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
            
            stmt.setInt(1,obj.getEvento().getId());
            stmt.setInt(2,obj.getQuantidade_de_servicos());
            stmt.setDouble(3,obj.getSubtotal_de_precos());
            stmt.setString(4,obj.getData_de_venda());
            stmt.setDouble(5,obj.getValor_pago());
            stmt.setDouble(6,obj.getTroco());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Venda Efectuada Com Sucesso");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao Efectuar a Venda"+ e.getMessage());
        }
    }
    
     
     public List<VendasModel>ListarNaTabela(){
        List<VendasModel>lista = new ArrayList<>();
        try{
            String sql = "select nome_do_cliente,v.id_venda,e.tipo_de_evento,v.quantidade_de_servicos,v.subtotal_de_precos,v.data_de_venda,v.valor_pago,v.troco from Tbl_Vendas as v inner join Tbl_Eventos as e on v.id_evento = e.id_evento inner join Tbl_Clientes as c on e.id_cliente = c.id_cliente";
             java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             
             while(rs.next()){
                 VendasModel obj = new VendasModel();
                EventosModel e = new EventosModel();
                ClientesModel c = new ClientesModel();
                 obj.setId(rs.getInt("v.id_venda"));
                obj.setData_de_venda(rs.getString("v.data_de_venda"));
                obj.setQuantidade_de_servicos(rs.getInt("v.quantidade_de_servicos"));
                obj.setSubtotal_de_precos(rs.getDouble("v.subtotal_de_precos"));
                obj.setValor_pago(rs.getDouble("v.valor_pago"));
                obj.setTroco(rs.getDouble("v.troco"));
                e.setTipoDeEvento(rs.getString("e.tipo_de_evento"));
                c.setNomeDoCliente(rs.getString("nome_do_cliente"));
                obj.setEvento(e);
                obj.setCliente(c);
                lista.add(obj);
             }
             return lista;
        }catch(SQLException e){
      JOptionPane.showMessageDialog(null, "erro ao criar a lista"+ e.getMessage());
        }
        return null;
    }
     
     
     public List<VendasModel>ListarVendas(String data_inicio,String data_fim){
        List<VendasModel>lista = new ArrayList<>();
        try{
            String sql = "select nome_do_cliente,v.id_venda,e.tipo_de_evento,v.quantidade_de_servicos,v.subtotal_de_precos,v.data_de_venda,v.valor_pago,v.troco from Tbl_Vendas as v inner join Tbl_Eventos as e on v.id_evento = e.id_evento inner join Tbl_Clientes as c on e.id_cliente = c.id_cliente where v.data_de_venda  between ? and ? ";
             java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
             stmt.setString(1, data_inicio);
             stmt.setString(2, data_fim);
             ResultSet rs = stmt.executeQuery();
             
             
             
             while(rs.next()){
                 VendasModel obj = new VendasModel();
                EventosModel e = new EventosModel();
                ClientesModel c = new ClientesModel();
                 obj.setId(rs.getInt("v.id_venda"));
                obj.setData_de_venda(rs.getString("v.data_de_venda"));
                obj.setQuantidade_de_servicos(rs.getInt("v.quantidade_de_servicos"));
                obj.setSubtotal_de_precos(rs.getDouble("v.subtotal_de_precos"));
                obj.setValor_pago(rs.getDouble("v.valor_pago"));
                obj.setTroco(rs.getDouble("v.troco"));
                e.setTipoDeEvento(rs.getString("e.tipo_de_evento"));
                c.setNomeDoCliente(rs.getString("nome_do_cliente"));
                obj.setEvento(e);
                obj.setCliente(c);
                lista.add(obj);
             }
             return lista;
        }catch(SQLException e){
      JOptionPane.showMessageDialog(null, "erro ao criar a lista"+ e.getMessage());
        }
        return null;
    }
     
     public void Excluir(VendasModel obj){
        try{
          String sql = "truncate table Tbl_Carrinho"; 
            try (java.sql.PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.execute();
            }
            JOptionPane.showMessageDialog(null, "Carrinho Limpo Com Sucesso");
        }catch(HeadlessException | SQLException e){
             JOptionPane.showMessageDialog(null, "erro ao excluir o cliente"+ e.getMessage());
        }
    }
}
