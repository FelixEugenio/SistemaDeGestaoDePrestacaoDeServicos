package Relatorios;

import com.pt.sistema.Jdbc.ConexaoBancoRelatorios;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class RelatorioClientes {

    ConexaoBancoRelatorios conexao = new ConexaoBancoRelatorios();

    public RelatorioClientes() {
        try {
            if (conexao.conecta()) {
                conexao.executeSQL("SELECT * FROM Tbl_Clientes");
                JRResultSetDataSource jrRS = new JRResultSetDataSource(conexao.getResultSet());
                JasperPrint jasperPrint = JasperFillManager.fillReport(
                        "C:\\Users\\Felix Eugenio Mavila\\Documents\\NetBeansProjects\\SistemaDeGestaoDePrestacaoDeServicos\\src\\Relatorios\\RelatorioClientes.jasper",
                        new HashMap<>(), jrRS);
                JasperViewer.viewReport(jasperPrint, false);
            } else {
                JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro no menu ireport: " + erro.getMessage());
        } finally {
            conexao.desconecta();
        }
    }

    public static void main(String[] args) {
        new RelatorioClientes();
    }
}
