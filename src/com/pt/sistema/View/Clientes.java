/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pt.sistema.View;
import com.pt.sistema.Dao.LocalidadeDAO;
import com.pt.sistema.Dao.ClientesDAO;
import com.pt.sistema.Model.ClientesModel;
import com.pt.sistema.Model.LocalidadeModel;
import com.pt.sistema.Utilitarios.Utilitarios;
import com.pt.sistema.Utilitarios.ValidandoCampoNumerico;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import Relatorios.RelatorioClientes;
/**
 *
 * @author Felix Eugenio Mavila
 */
public class Clientes extends javax.swing.JFrame {
    
    public void listar(){
        ClientesDAO dao = new ClientesDAO();
        List<ClientesModel> lista = dao.ListarNaTabela();
        DefaultTableModel dados = (DefaultTableModel) table.getModel();
        dados.setNumRows(0);
        for(ClientesModel c: lista){
            dados.addRow(new Object[]{
                c.getId(),
                c.getNomeDoCliente(),
                c.getEmail(),
                c.getEndereco(),
                c.getLocalidade().getCidade(),
                c.getLocalidade().getCod_postal(),
                c.getNif(),
                c.getDataDeNascimento(),
                c.getTelefone(),
                
            });
        }
    }

    /**
     * Creates new form Home
     */
    
    public String UsuarioLogado;
    public Clientes() {
        initComponents();
        txt_Nif_do_Cliente.setDocument(new ValidandoCampoNumerico());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtNomedoCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cb_localidade = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txt_Endereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btn_Registrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_Nif_do_Cliente = new javax.swing.JTextField();
        txt_Telefone = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        date_cliente = new com.toedter.calendar.JDateChooser();
        txt_email = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        lbl_Logado = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_Imprimir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbl_funcionarios = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_eventos = new javax.swing.JLabel();
        lbl_Pagamentos = new javax.swing.JLabel();
        lbl_fornecedores = new javax.swing.JLabel();
        lbl_Servico = new javax.swing.JLabel();
        lbl_Localidade = new javax.swing.JLabel();
        lbl_addServicoEvento = new javax.swing.JLabel();
        lbl_cargos = new javax.swing.JLabel();
        lbl_contrato_funcionario = new javax.swing.JLabel();
        lbl_contrato_fornecedor = new javax.swing.JLabel();
        lbl_configuracoes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Nome do Cliente :");

        cb_localidade.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cb_localidadeAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Localidade :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Endereço :");

        btn_Registrar.setBackground(new java.awt.Color(51, 204, 255));
        btn_Registrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Registrar.setText("Registrar Cliente");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Registrar Clientes");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Data de nascimento :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("NIF :");

        txt_Nif_do_Cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Nif_do_ClienteKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Telefone :");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Email :");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id_cliente", "Nome", "Email", "Endereço", "Cidade", "Codigo Postal", "NiF", "Data de Nascimento", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(table);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pt/sistema/Imagens/fechar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbl_Logado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Utilizador :");

        btn_Imprimir.setBackground(new java.awt.Color(51, 204, 255));
        btn_Imprimir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Imprimir.setForeground(new java.awt.Color(255, 255, 255));
        btn_Imprimir.setText("Imprimir Relatorio");
        btn_Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomedoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Nif_do_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Endereco)
                            .addComponent(cb_localidade, 0, 198, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(39, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Logado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel16))
                            .addComponent(lbl_Logado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomedoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_localidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(date_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nif_do_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txt_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        lbl_funcionarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_funcionarios.setText("Funcionários");
        lbl_funcionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_funcionariosMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Home");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        lbl_eventos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_eventos.setText("Eventos");
        lbl_eventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_eventosMouseClicked(evt);
            }
        });

        lbl_Pagamentos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Pagamentos.setText("Pagamentos");
        lbl_Pagamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_PagamentosMouseClicked(evt);
            }
        });

        lbl_fornecedores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_fornecedores.setText("Fornecedores");
        lbl_fornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_fornecedoresMouseClicked(evt);
            }
        });

        lbl_Servico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Servico.setText("Serviços");
        lbl_Servico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_ServicoMouseClicked(evt);
            }
        });

        lbl_Localidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Localidade.setText("Localidade");
        lbl_Localidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_LocalidadeMouseClicked(evt);
            }
        });

        lbl_addServicoEvento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_addServicoEvento.setText("Add Serviço ao Evento");
        lbl_addServicoEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_addServicoEventoMouseClicked(evt);
            }
        });

        lbl_cargos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_cargos.setText("Cargos");
        lbl_cargos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_cargosMouseClicked(evt);
            }
        });

        lbl_contrato_funcionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_contrato_funcionario.setText("Contrato Funcionário");
        lbl_contrato_funcionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_contrato_funcionarioMouseClicked(evt);
            }
        });

        lbl_contrato_fornecedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_contrato_fornecedor.setText("Contrato Fornecedor");
        lbl_contrato_fornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_contrato_fornecedorMouseClicked(evt);
            }
        });

        lbl_configuracoes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_configuracoes.setText("Configurações");
        lbl_configuracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_configuracoesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_funcionarios)
                    .addComponent(lbl_fornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbl_Pagamentos)))
                .addGap(72, 72, 72))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lbl_cargos))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lbl_Localidade, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_eventos)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lbl_Servico))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lbl_configuracoes))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_contrato_fornecedor)
                            .addComponent(lbl_addServicoEvento)
                            .addComponent(lbl_contrato_funcionario))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_eventos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_fornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_funcionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Servico, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Pagamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_addServicoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_cargos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_contrato_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Localidade, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_contrato_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_configuracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cb_localidadeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cb_localidadeAncestorAdded
        
        LocalidadeDAO dao = new LocalidadeDAO();
        List<LocalidadeModel>lista = dao.Listar();
        
        cb_localidade.removeAllItems();
        for(LocalidadeModel c: lista) {
                cb_localidade.addItem(c);
            }  
    }//GEN-LAST:event_cb_localidadeAncestorAdded

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        
       if(txtNomedoCliente.getText().isEmpty() || 
       txt_Endereco.getText().isEmpty() || 
       txt_email.getText().isEmpty() || 
       txt_Nif_do_Cliente.getText().isEmpty() || 
       txt_Telefone.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, preencha todos os espaços vazios.");
        return;
    }
    
    // Verificando se NIF e Telefone contêm apenas números
    if (!txt_Nif_do_Cliente.getText().matches("\\d+")) {
        JOptionPane.showMessageDialog(null, "O NIF deve conter apenas números.");
        return;
    }
    
    if (!txt_Telefone.getText().matches("\\d+")) {
        JOptionPane.showMessageDialog(null, "O telefone deve conter apenas números.");
        return;
    }

    ClientesModel obj = new ClientesModel();
    obj.setNomeDoCliente(txtNomedoCliente.getText());
    obj.setEmail(txt_email.getText());
    obj.setEndereco(txt_Endereco.getText());
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    obj.setDataDeNascimento(sdf.format(date_cliente.getDate()));
    
    // Convertendo NIF e telefone para números inteiros
    obj.setNif(Integer.parseInt(txt_Nif_do_Cliente.getText()));
    obj.setTelefone(Integer.parseInt(txt_Telefone.getText()));
    
    obj.setLocalidade((LocalidadeModel) cb_localidade.getSelectedItem());
    
    ClientesDAO dao = new ClientesDAO();
    dao.Salvar(obj);
    
    Utilitarios util = new Utilitarios();
    util.LimpaTela(jPanel2);
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
        lbl_Logado.setText(UsuarioLogado);
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int window = JOptionPane.showConfirmDialog(null,"Tem Certeza que deseja Fechar ?");
        if(window == 0){
            System.exit(0);
        }else if(window ==2){
            JOptionPane.showMessageDialog(null, "Cancelando...");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lbl_funcionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_funcionariosMouseClicked
        Funcionarios fu = new Funcionarios();
        this.hide();
        fu.setVisible(true);
    }//GEN-LAST:event_lbl_funcionariosMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Home h = new Home();
        this.hide();
        h.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void lbl_eventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_eventosMouseClicked
        Eventos e = new Eventos();
        this.hide();
        e.setVisible(true);
    }//GEN-LAST:event_lbl_eventosMouseClicked

    private void lbl_PagamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_PagamentosMouseClicked
        Pagamentos p  = new Pagamentos();
        this.hide();
        p.setVisible(true);
    }//GEN-LAST:event_lbl_PagamentosMouseClicked

    private void lbl_fornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_fornecedoresMouseClicked
        Fornecedores f = new Fornecedores();
        this.hide();
        f.setVisible(true);
    }//GEN-LAST:event_lbl_fornecedoresMouseClicked

    private void lbl_ServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ServicoMouseClicked
        Servicos s  = new Servicos();
        this.hide();
        s.setVisible(true);
    }//GEN-LAST:event_lbl_ServicoMouseClicked

    private void lbl_LocalidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_LocalidadeMouseClicked
        Localidade l = new Localidade();
        this.hide();
        l.setVisible(true);
    }//GEN-LAST:event_lbl_LocalidadeMouseClicked

    private void lbl_addServicoEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_addServicoEventoMouseClicked
        AddServicosNoEvento add  = new AddServicosNoEvento();
        this.hide();
        add.setVisible(true);
    }//GEN-LAST:event_lbl_addServicoEventoMouseClicked

    private void lbl_cargosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cargosMouseClicked
        Cargos ca = new Cargos();
        this.hide();
        ca.setVisible(true);
    }//GEN-LAST:event_lbl_cargosMouseClicked

    private void lbl_contrato_funcionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_contrato_funcionarioMouseClicked
        ContratoFuncionario cfu = new ContratoFuncionario();
        this.hide();
        cfu.setVisible(true);
    }//GEN-LAST:event_lbl_contrato_funcionarioMouseClicked

    private void lbl_contrato_fornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_contrato_fornecedorMouseClicked
        ContratoFornecedor cf = new ContratoFornecedor();
        this.hide();
        cf.setVisible(true);
    }//GEN-LAST:event_lbl_contrato_fornecedorMouseClicked

    private void lbl_configuracoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_configuracoesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_configuracoesMouseClicked

    private void txt_Nif_do_ClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Nif_do_ClienteKeyTyped
        
    }//GEN-LAST:event_txt_Nif_do_ClienteKeyTyped

    private void btn_ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ImprimirActionPerformed
      this.dispose();
      new Relatorios.RelatorioClientes();
      // TODO add your handling code here:
    }//GEN-LAST:event_btn_ImprimirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Imprimir;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JComboBox cb_localidade;
    private com.toedter.calendar.JDateChooser date_cliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel lbl_Localidade;
    private javax.swing.JLabel lbl_Logado;
    public javax.swing.JLabel lbl_Pagamentos;
    public javax.swing.JLabel lbl_Servico;
    public javax.swing.JLabel lbl_addServicoEvento;
    public javax.swing.JLabel lbl_cargos;
    public javax.swing.JLabel lbl_configuracoes;
    public javax.swing.JLabel lbl_contrato_fornecedor;
    public javax.swing.JLabel lbl_contrato_funcionario;
    private javax.swing.JLabel lbl_eventos;
    public javax.swing.JLabel lbl_fornecedores;
    public javax.swing.JLabel lbl_funcionarios;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtNomedoCliente;
    private javax.swing.JTextField txt_Endereco;
    private javax.swing.JTextField txt_Nif_do_Cliente;
    private javax.swing.JTextField txt_Telefone;
    private javax.swing.JTextField txt_email;
    // End of variables declaration//GEN-END:variables
}
