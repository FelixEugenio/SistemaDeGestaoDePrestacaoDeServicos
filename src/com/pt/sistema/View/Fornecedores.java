/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pt.sistema.View;

import com.pt.sistema.Dao.EventosDAO;
import com.pt.sistema.Dao.LocalidadeDAO;
import com.pt.sistema.Dao.ServicoDAO;
import com.pt.sistema.Model.LocalidadeModel;
import com.pt.sistema.Model.ServicoModel;
import com.pt.sistema.Model.FornecedoresModel;
import com.pt.sistema.Dao.FornecedoresDAO;
import com.pt.sistema.Model.EventosModel;
import com.pt.sistema.Utilitarios.Utilitarios;
import java.text.SimpleDateFormat;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felix Eugenio Mavila
 */
public class Fornecedores extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    
    public void listar(){
        FornecedoresDAO dao = new FornecedoresDAO();
        List<FornecedoresModel> lista = dao.ListarNaTabela();
        DefaultTableModel dados = (DefaultTableModel) table.getModel();
        dados.setNumRows(0);
        for(FornecedoresModel c: lista){
            dados.addRow(new Object[]{
                c.getId(),
                c.getNomeDoFornecedor(),
                c.getEmail(),
                c.getDataDeNascimento(),
                c.getNif(),
                c.getTelefone(),
                c.getEndereco(),
                c.getLocalidade().getCidade(),
                c.getLocalidade().getCod_postal(),
                
            });
        }
    }
    public String UsuarioLogado;
    public Fornecedores() {
        initComponents();
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
        txt_Nome_do_Fornecedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cb_localidade = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txt_Endereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btn_Registrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_Email_do_Fornecedor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_Nif_do_Fornecedor = new javax.swing.JTextField();
        txt_Telefone = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cb_servico = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        date_fornecedor = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        lbl_Logado = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
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
        jLabel6.setText("Nome do Fornecedor :");

        cb_localidade.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cb_localidadeAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cb_localidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_localidadeActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Localidade :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Endereço :");

        btn_Registrar.setBackground(new java.awt.Color(51, 204, 255));
        btn_Registrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Registrar.setText("Registrar Fornecedor");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Registrar Fornecedores");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Email do Fornecedor :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("NIF do Fornecedor :");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Telefone :");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Serviços :");

        cb_servico.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cb_servicoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Data de Nascimento :");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Fornecedor", "Nome", "Email", "Data_de_nascimento", "Nif", "Telefone", "Endereço", "Cidade", "Codigo Postal"
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

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Utilizador :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Nif_do_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Nome_do_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Email_do_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(cb_localidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(63, 63, 63))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(26, 26, 26)
                                .addComponent(txt_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Logado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel11)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel17))
                    .addComponent(lbl_Logado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nome_do_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Email_do_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(cb_localidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txt_Nif_do_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel16))
                    .addComponent(date_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

    private void cb_servicoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cb_servicoAncestorAdded
        ServicoDAO dao = new ServicoDAO();
        List<ServicoModel>lista = dao.Listar();
        
        cb_servico.removeAllItems();
        for(ServicoModel c: lista) {
                cb_servico.addItem(c);
            } 
    }//GEN-LAST:event_cb_servicoAncestorAdded

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
       
         if (txt_Email_do_Fornecedor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Porfavor Preencha os Espacos Vazios");
            return;
        }
        else if (txt_Nome_do_Fornecedor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Porfavor Preencha os Espacos Vazios");
            return;
        } 
        
         else if (txt_Endereco.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Porfavor Preencha os Espacos Vazios");
            return;
        }
         else if (txt_Nif_do_Fornecedor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Porfavor Preencha os Espacos Vazios");
            return;
        }
         
         
        FornecedoresModel obj = new FornecedoresModel();
        obj.setNomeDoFornecedor(txt_Nome_do_Fornecedor.getText());
        obj.setEmail(txt_Email_do_Fornecedor.getText());
        obj.setEndereco(txt_Endereco.getText());
        obj.setNif(Integer.parseInt(txt_Nif_do_Fornecedor.getText()));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        obj.setDataDeNascimento(sdf.format(date_fornecedor.getDate()));
        obj.setTelefone(Integer.parseInt(txt_Telefone.getText()));
        obj.setServico((ServicoModel)cb_servico.getSelectedItem());
        obj.setLocalidade((LocalidadeModel)cb_localidade.getSelectedItem());
        
        FornecedoresDAO dao = new FornecedoresDAO();
        dao.Salvar(obj);
        
        Utilitarios util = new Utilitarios();
        
        util.LimpaTela(jPanel2);
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void cb_localidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_localidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_localidadeActionPerformed

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
        Configuracoes con = new Configuracoes();
        this.hide();
        con.setVisible(true);
    }//GEN-LAST:event_lbl_configuracoesMouseClicked

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
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Fornecedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JComboBox cb_localidade;
    private javax.swing.JComboBox cb_servico;
    private com.toedter.calendar.JDateChooser date_fornecedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JTextField txt_Email_do_Fornecedor;
    private javax.swing.JTextField txt_Endereco;
    private javax.swing.JTextField txt_Nif_do_Fornecedor;
    private javax.swing.JTextField txt_Nome_do_Fornecedor;
    private javax.swing.JTextField txt_Telefone;
    // End of variables declaration//GEN-END:variables
}
