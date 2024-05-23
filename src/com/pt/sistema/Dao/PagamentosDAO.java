/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.sistema.Dao;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import com.pt.sistema.Jdbc.ConexaoBanco;
import com.pt.sistema.Model.PagamentosModel;
import com.pt.sistema.Model.ClientesModel;
import com.pt.sistema.Model.EventosModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Felix Eugenio Mavila
 */
public class PagamentosDAO {
    
    private Connection conn;
    
    public PagamentosDAO(){
        this.conn = new ConexaoBanco().PegarConexao();
    }
    
    public void Editar(PagamentosModel obj){
        try{
            //criar sql 
            String sql = "update Tbl_Pagamentos set valor_Pago=?,Metodo_de_Pagamento=?,data_de_pagamento=?,troco=? where id_pagamento=?";
            //preparar conexao sql pra se conectar ao banco de dados 
            
            java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
            stmt.setInt(1,obj.getId());
            stmt.setDouble(2,obj.getValor_Pago());
            stmt.setString(3,obj.getMetododePagamento());
            stmt.setString(4,obj.getDatadepagamento());
            stmt.setDouble(5,obj.getTroco());
            
            //executar o sql
            
            stmt.execute();
            
            // fechar a conexao
            
            stmt.close();
            JOptionPane.showMessageDialog(null, "Pagamento Realizado Com Sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao Realizar o Pagamento"+ e.getMessage());
        }
    }
    
    public List<PagamentosModel>Listar(){
        List<PagamentosModel>lista = new ArrayList<>();
        try{
            String sql = "SELECT c.nome_do_cliente,P.data_de_pagamento,P.id_pagamento,P.total_a_pagar,P.troco,P.quantidade_de_servicos,P.Metodo_de_Pagamento,P.Status_do_Pagamento,P.valor_Pago,e.tipo_de_evento FROM Tbl_Pagamentos AS P INNER JOIN Tbl_Evento_Servico AS ES ON P.id_evento = ES.id_evento inner join Tbl_Eventos as e on e.id_evento = ES.id_evento inner join Tbl_Clientes as c on c.id_cliente = e.id_cliente";
             java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             
             while(rs.next()){
                 PagamentosModel obj = new PagamentosModel();
                 ClientesModel c = new ClientesModel();
                 EventosModel e = new EventosModel();
                 e.setTipoDeEvento("e.tipo_de_evento");
                 c.setNomeDoCliente("c.nome_do_cliente");
                 obj.setId(rs.getInt("P.id_pagamento"));
                obj.setMetododePagamento(rs.getString("P.Metodo_de_Pagamento"));
                obj.setDatadepagamento(rs.getString("P.data_de_pagamento"));
                obj.setQuantidade_de_servicos((int) rs.getDouble("P.quantidade_de_servicos"));
                obj.setStatusdoPagamento(rs.getString("P.Status_do_Pagamento"));
                obj.setTotalApagar((int) rs.getDouble("P.total_a_pagar"));
                obj.setValor_Pago((int)rs.getDouble("P.valor_Pago"));
                obj.setTroco((int)rs.getDouble("P.troco"));
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
}
