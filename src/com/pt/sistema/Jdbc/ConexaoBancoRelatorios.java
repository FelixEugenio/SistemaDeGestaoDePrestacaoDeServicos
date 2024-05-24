package com.pt.sistema.Jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * Classe para conexão com o banco de dados MySQL e execução de comandos SQL
 */
public class ConexaoBancoRelatorios {
    
    final private String driver = "com.mysql.cj.jdbc.Driver"; // Corrigido o driver
    final private String url = "jdbc:mysql://localhost/sistemaDeGestaoDePrestacaoDeServico";
    final private String usuario = "root";
    final private String senha = "admin";
    
    public Connection conexao;
    public Statement statement;
    public ResultSet resultSet; 
    
    /**
     * Método para conectar ao banco de dados
     * @return boolean indicando sucesso ou falha na conexão
     * @throws SQLException
     */
    public Boolean conecta() throws SQLException {
        boolean resultado = true;
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conexão estabelecida com sucesso!");
        } catch (ClassNotFoundException Driver) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado: " + Driver);
            resultado = false;
        } catch (SQLException fonte) {
            JOptionPane.showMessageDialog(null, "Erro na fonte de dados: " + fonte);
            resultado = false;
        }
        
        return resultado;
    }

    /**
     * Método para desconectar do banco de dados
     */
    public void desconecta() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "Banco desconectado com sucesso!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar do banco de dados: " + e.getMessage());
        }
    }
   
    /**
     * Método para executar uma query SQL
     * @param sql A query SQL a ser executada
     */
    public void executeSQL(String sql) {
        try {
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
        }
    }
}
