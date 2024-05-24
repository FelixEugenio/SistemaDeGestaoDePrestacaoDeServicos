
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Felix Eugenio Mavila
 */
public class ConexaoBancoRelatorios {
    
    final private String driver = "com.mysql.jdbc.Driver";
    final private String url ="jdbc:mysql://localhost/sistemaDeGestaoDePrestacaoDeServico";
    final private String usuario ="root";
    final private String senha ="admin";
    
    private Connection conexao;
    public Statement statement;
    public ResultSet resultSet; 
    
    public Boolean conecta() throws SQLException{
        boolean resultado = true;
        try{
            Class.forName(driver);
            conexao = (Connection) DriverManager.getConnection(url,usuario,senha);
        }catch(ClassNotFoundException Driver){
            JOptionPane.showMessageDialog(null, "Driver Nao Encontrado " + Driver);
            resultado = false;
        }catch(SQLException fonte){
            JOptionPane.showMessageDialog(null, "Erro na minha fonte de dados  " + fonte);
            resultado = false;
        }
        
        return resultado;
    }

   public void desconecta(){
       boolean resultado = true;
       try{
           conexao.close();
           JOptionPane.showMessageDialog(null, "Bnaco Fechado");
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Erro ao Conectar ao banco de dados  ");
            resultado = false;
       }
   }
}


