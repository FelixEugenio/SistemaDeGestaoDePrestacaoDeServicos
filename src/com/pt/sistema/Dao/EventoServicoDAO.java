/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.sistema.Dao;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import com.pt.sistema.Jdbc.ConexaoBanco;
import com.pt.sistema.Model.EventoServicoModel;
import com.pt.sistema.Model.ServicoModel;
import com.pt.sistema.Model.EventosModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Felix Eugenio Mavila
 */
public class EventoServicoDAO {
    
    private Connection conn;
    
    public EventoServicoDAO(){
        this.conn = new ConexaoBanco().PegarConexao();
    }
    
    public void Salvar(EventoServicoModel obj){
        try{
            String sql = "insert into Tbl_Evento_Servico(id_evento,id_servico) values(?,?)";
            java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
            
            stmt.setInt(1,obj.getEvento().getId());
            stmt.setInt(2,obj.getServico().getId());
           
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, " Serviço Adicionado ao Evento Com Sucesso");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao Salvar o Serviço no Evento"+ e.getMessage());
        }
    }
    
    public void SalvarNoCarrinho(){
        try{
            String sql = "INSERT INTO Tbl_Carrinho (id_evento, quantidade_de_servicos, subtotal_de_precos) SELECT e.id_evento, COUNT(es.id_servico) AS quantidade_de_servicos,SUM(s.preco) AS subtotal_de_precos FROM Tbl_Eventos e LEFT JOIN Tbl_Evento_Servico es ON e.id_evento = es.id_evento LEFT JOIN Tbl_Servicos s ON es.id_servico = s.id_servico GROUP BY e.id_evento ";
            java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
           
            stmt.execute();
            stmt.close();
            
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao Salvar no Carrinho"+ e.getMessage());
        }
    }
    
    public List<EventoServicoModel>ListarNaTabela(){
        List<EventoServicoModel>lista = new ArrayList<>();
        try{
            String sql = "select es.id_evento_servico,s.tipo_de_servico,e.tipo_de_evento from Tbl_Evento_Servico as es inner join Tbl_Eventos as e on es.id_evento = e.id_evento inner join Tbl_Servicos as s on es.id_servico = s.id_servico";
             java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             
             while(rs.next()){
                 EventoServicoModel obj = new EventoServicoModel();
                 EventosModel e = new EventosModel();
                 ServicoModel s = new ServicoModel();
             
                 obj.setId(rs.getInt("es.id_evento_servico"));
                 e.setTipoDeEvento(rs.getString("e.tipo_de_evento"));
                 s.setTipoDeServico(rs.getString("s.tipo_de_servico"));
                
                obj.setEvento(e);
                obj.setServico(s);
             
                lista.add(obj);
             }
             return lista;
        }catch(SQLException e){
      JOptionPane.showMessageDialog(null, "erro ao criar a lista"+ e.getMessage());
        }
        return null;
    }
    
}
