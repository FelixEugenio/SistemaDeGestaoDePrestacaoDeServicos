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
import com.pt.sistema.Model.FuncionariosModel;
import com.pt.sistema.Model.LocalidadeModel;
import com.pt.sistema.View.Home;
import com.pt.sistema.View.Login;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Felix Eugenio Mavila
 */
public class FuncionariosDAO {
    
    private Connection conn;
    
    public FuncionariosDAO(){
        this.conn = new ConexaoBanco().PegarConexao();
    }
    
    public void Salvar(FuncionariosModel obj){
        try{
            String sql = "insert into Tbl_Funcionarios(nome_do_funcionario,email,data_de_nascimento,nif,telefone,endereco,senha,horas_de_trabalho,id_localidade,id_cargo) values(?,?,?,?,?,?,?,?,?,?)";
            java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
            
            stmt.setString(1,obj.getNomeDoFuncionario());
            stmt.setString(2,obj.getEmail());
            stmt.setString(3,obj.getDataDeNascimento());
            stmt.setInt(4,obj.getNif());
            stmt.setInt(5,obj.getTelefone());
            stmt.setString(6,obj.getEndereco());
            stmt.setString(7,obj.getSenha());
            stmt.setInt(8,obj.getHorasDeTrabalho());
            stmt.setInt(9,obj.getLocalidade().getId());
            stmt.setInt(10,obj.getCargo().getId());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Funcionario Salvo Com Sucesso");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao Salvar o Funcionario"+ e.getMessage());
        }
    }
    
    public List<FuncionariosModel>Listar(){
        List<FuncionariosModel>lista = new ArrayList<>();
        try{
            String sql = "select * from Tbl_Funcionarios";
             java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             
             while(rs.next()){
                 FuncionariosModel obj = new FuncionariosModel();
                 obj.setId(rs.getInt("id_funcionario"));
                 obj.setNomeDoFuncionario(rs.getString("nome_do_funcionario"));
                 lista.add(obj);
             }
             return lista;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao criar a lista"+ e.getMessage());
        }
        
        return null;
    }
    
    public void efectuarLogin(String email,String senha){
        try{
            String sql ="select * from Tbl_Funcionarios where email=? and senha=?";
            java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
            stmt.setString(1,email);
            stmt.setString(2,senha);
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
               if(rs.getString("nivel_acesso").equals("Administrador")){
                   Home tr = new Home();
                   tr.UsuarioLogado = rs.getString("nome_do_funcionario");
                 JOptionPane.showMessageDialog(null, "Seja Bem vindo ao Sistema\n"+tr.UsuarioLogado);
                tr.setVisible(true);
               }else if(rs.getString("nivel_acesso").equals("Utilizador")){
                   Home tr = new Home();
                   tr.UsuarioLogado = rs.getString("nome_do_funcionario");
                   tr.lbl_fornecedores.setEnabled(false);
                   tr.lbl_funcionarios.setEnabled(false);
                   tr.lbl_contrato_fornecedor.setEnabled(false);
                   tr.lbl_contrato_funcionario.setEnabled(false);
                   
                 JOptionPane.showMessageDialog(null, "Seja Bem vindo ao Sistema\n"+tr.UsuarioLogado);
                tr.setVisible(true);
               }
                
            }else{
                Login lg = new Login();
              
                JOptionPane.showMessageDialog(null, "dados invalidos");
                lg.setVisible(true);
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro"+ e.getMessage());
        }
        
    }
    
    public List<FuncionariosModel>ListarNaTabela(){
        List<FuncionariosModel>lista = new ArrayList<>();
        try{
            String sql = " select f.id_funcionario,f.nome_do_funcionario,f.nif,f.email,f.data_de_nascimento,f.telefone,f.endereco,l.cidade,l.cod_postal from Tbl_Funcionarios as f inner join Tbl_Localidades as l on f.id_localidade=l.id_localidade";
             java.sql.PreparedStatement stmt =  conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             
             while(rs.next()){
                 FuncionariosModel obj = new FuncionariosModel();
                 LocalidadeModel l = new LocalidadeModel();
               
                 obj.setId(rs.getInt("f.id_funcionario"));
                obj.setNomeDoFuncionario(rs.getString("f.nome_do_funcionario"));
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
