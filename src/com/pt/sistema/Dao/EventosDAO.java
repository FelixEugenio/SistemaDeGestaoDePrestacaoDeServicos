/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pt.sistema.Dao;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import com.pt.sistema.Jdbc.ConexaoBanco;
import com.pt.sistema.Model.EventosModel;
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
public class EventosDAO {
    
    private Connection conn;
    
    public EventosDAO(){
        this.conn = new ConexaoBanco().PegarConexao();
    }
    
    public void Salvar(EventosModel obj){
        try{
            String sql = "insert into Tbl_Eventos(data_do_evento,tipo_de_evento,lista_de_convidados,endereco_do_evento,id_cliente,id_localidade) values(?,?,?,?,?,?)";
            java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
            
            stmt.setString(1,obj.getDataDoEvento());
            stmt.setString(2,obj.getTipoDeEvento());
            stmt.setString(3,obj.getListaDeConvidados());
            stmt.setString(4,obj.getEnderecoDoEvento());
            stmt.setInt(5,obj.getCliente().getId());
            stmt.setInt(6,obj.getLocalidade().getId());
            
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Evento Salvo Com Sucesso");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao Salvar o Evento"+ e.getMessage());
        }
    }
    
    public List<EventosModel>Listar(){
        List<EventosModel>lista = new ArrayList<>();
        try{
            String sql = "select * from Tbl_Eventos";
             java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             
             while(rs.next()){
                 EventosModel obj = new EventosModel();
                 obj.setId(rs.getInt("id_evento"));
                 obj.setTipoDeEvento(rs.getString("tipo_de_evento"));
                 lista.add(obj);
             }
             return lista;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao criar a lista"+ e.getMessage());
        }
        
        return null;
    }
    
    public List<EventosModel>ListarNaTabela(){
        List<EventosModel>lista = new ArrayList<>();
        try{
            String sql = " select c.nome_do_cliente,e.id_evento,e.tipo_de_evento,e.data_do_evento,e.lista_de_convidados,e.endereco_do_evento,l.cidade,l.cod_postal from Tbl_Eventos as e inner join Tbl_Localidades as l on e.id_localidade=l.id_localidade inner join Tbl_Clientes as c on e.id_cliente = c.id_cliente";
             java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             
             while(rs.next()){
                 EventosModel obj = new EventosModel();
                 LocalidadeModel l = new LocalidadeModel();
                 ClientesModel c = new ClientesModel();
                
                 obj.setId(rs.getInt("e.id_evento"));
                obj.setTipoDeEvento(rs.getString("e.tipo_de_evento"));
                obj.setEnderecoDoEvento(rs.getString("e.endereco_do_evento"));
                obj.setDataDoEvento(rs.getString("e.data_do_evento"));
                obj.setListaDeConvidados(rs.getString("e.lista_de_convidados"));
                c.setNomeDoCliente(rs.getString("c.nome_do_cliente"));
                l.setCidade(rs.getString("l.cidade"));
                l.setCod_postal(rs.getString("l.cod_postal"));
                obj.setLocalidade(l);
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
