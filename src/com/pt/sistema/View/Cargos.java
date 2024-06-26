/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pt.sistema.View;
import com.pt.sistema.Dao.CargoDAO;
import com.pt.sistema.Dao.FuncionariosDAO;
import com.pt.sistema.Model.CargoModel;
import com.pt.sistema.Model.FuncionariosModel;
import com.pt.sistema.Utilitarios.Utilitarios;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felix Eugenio Mavila
 */
public class Cargos extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    
    public void listar(){
        CargoDAO dao = new CargoDAO();
        List<CargoModel> lista = dao.Listar();
        DefaultTableModel dados = (DefaultTableModel) table.getModel();
        dados.setNumRows(0);
        for(CargoModel c: lista){
            dados.addRow(new Object[]{
                c.getId(),
                c.getCargo(),
            });
        }
    }
    public String UsuarioLogado;
    public Cargos() {
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
        txt_Cargo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_Registrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        lbl_Logado = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
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
        jLabel6.setText("Cargo :");

        btn_Registrar.setBackground(new java.awt.Color(51, 204, 255));
        btn_Registrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Registrar.setText("Registrar Cargo");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Registrar Cargos");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id Cargo", "Cargo"
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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Utilizador :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Logado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(307, 307, 307)
                        .addComponent(jButton1))
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel11))
                    .addComponent(jButton1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel9))
                            .addComponent(lbl_Logado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(18, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        
        if(txt_Cargo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Porfavor Preencha os Espacos Vazios");
            return;
        }
        CargoModel obj = new CargoModel();
        obj.setCargo(txt_Cargo.getText());
        
        CargoDAO dao = new CargoDAO();
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
            java.util.logging.Logger.getLogger(Cargos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cargos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cargos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cargos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Cargos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField txt_Cargo;
    // End of variables declaration//GEN-END:variables
}
