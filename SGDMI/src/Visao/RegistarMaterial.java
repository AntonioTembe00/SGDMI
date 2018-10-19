/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.MarerialDAO;
import Modelo.Material;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tem
 */
public class RegistarMaterial extends javax.swing.JFrame {

    /**
     * Creates new form
     */
    public RegistarMaterial() {
        initComponents();
        readJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblRegistarMaterial = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jtfQuantidade = new javax.swing.JTextField();
        jcbNome = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jbtGravar = new javax.swing.JButton();
        jbtActualizar = new javax.swing.JButton();
        jbtRemover = new javax.swing.JButton();
        jbrPesquisar = new javax.swing.JButton();
        jbtLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblRegistarMaterial.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblRegistarMaterial.setText("REGISTO DO MATERIAL");
        jPanel1.add(lblRegistarMaterial);

        lblNome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNome.setText("Nome");

        lblCodigo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCodigo.setText("Codigo");

        lblQuantidade.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQuantidade.setText("Quantidade");

        jtfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoActionPerformed(evt);
            }
        });
        jtfCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfCodigoKeyPressed(evt);
            }
        });

        jtfQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfQuantidadeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfQuantidadeKeyTyped(evt);
            }
        });

        jcbNome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Livro", "Apagador", "Marcador", "DataShow", "Cabo de Rede", "Cabo de Corrente", "Cabo de Video", "Mouse" }));
        jcbNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcbNomeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(jcbNome, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfQuantidade)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(jcbNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidade)
                    .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setLayout(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setLayout(new java.awt.BorderLayout());

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Quantidade", "Data"
            }
        ));
        tabela.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jbtGravar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtGravar.setText("Gravar");
        jbtGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtGravarActionPerformed(evt);
            }
        });
        jPanel4.add(jbtGravar);

        jbtActualizar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtActualizar.setText("Actualizar");
        jbtActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtActualizarActionPerformed(evt);
            }
        });
        jPanel4.add(jbtActualizar);

        jbtRemover.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtRemover.setText("Remover");
        jbtRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRemoverActionPerformed(evt);
            }
        });
        jPanel4.add(jbtRemover);

        jbrPesquisar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbrPesquisar.setText("Pesquisar");
        jbrPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbrPesquisarActionPerformed(evt);
            }
        });
        jPanel4.add(jbrPesquisar);

        jbtLimpar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtLimpar.setText("Limpar");
        jbtLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLimparActionPerformed(evt);
            }
        });
        jPanel4.add(jbtLimpar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLimparActionPerformed
        // TODO add your handling code here:
        jcbNome.setSelectedIndex(0);
        jtfCodigo.setText(null);
        jtfQuantidade.setText(null);

        readJTable();
    }//GEN-LAST:event_jbtLimparActionPerformed

    private void jtfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCodigoActionPerformed

    private void jtfCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoKeyPressed

        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jtfQuantidade.requestFocus();
        }
    }//GEN-LAST:event_jtfCodigoKeyPressed

    private void jtfQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfQuantidadeKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtfQuantidadeKeyTyped

    private void jtfQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfQuantidadeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jbtGravar.requestFocus();
        }
    }//GEN-LAST:event_jtfQuantidadeKeyPressed

    private void jbtGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtGravarActionPerformed
        // TODO add your handling code here:
        Material a = new Material();

        MarerialDAO estu = new MarerialDAO();

        a.setNome((String)jcbNome.getSelectedItem());
        a.setCodigo(jtfCodigo.getText());
        a.setQuantidade(Integer.parseInt((jtfQuantidade.getText())));
        a.setData(new Date());
        if (estu.gravar(a)) {
            JOptionPane.showMessageDialog(null, "O material foi registado com sucesso");
            jcbNome.setSelectedIndex(0);
            jtfCodigo.setText(null);
            jtfQuantidade.setText(null);
        } else {
            JOptionPane.showMessageDialog(null, "O material nao foi registado com sucesso");
        }

        readJTable();
    }//GEN-LAST:event_jbtGravarActionPerformed

    private void jbtActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtActualizarActionPerformed
        // TODO add your handling code here:
        if (tabela.getSelectedRow() != -1) {
            Material a = new Material();

            MarerialDAO estu = new MarerialDAO();

            a.setNome((String)jcbNome.getSelectedItem());
            a.setCodigo(jtfCodigo.getText());
            a.setQuantidade(Integer.parseInt((jtfQuantidade.getText())));
            a.setData((Date) tabela.getValueAt(tabela.getSelectedRow(), 3));

            if (estu.atualizar(a)) {
                JOptionPane.showMessageDialog(null, "O material foi actualizado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "O material nao foi actualizado!!!");
            }

            jcbNome.setSelectedIndex(0);
            jtfCodigo.setText(null);
            jtfQuantidade.setText(null);
            readJTable();

        }
    }//GEN-LAST:event_jbtActualizarActionPerformed

    private void jbtRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRemoverActionPerformed
        // TODO add your handling code here:
        if (tabela.getSelectedRow() != -1) {
            Material a = new Material();
            MarerialDAO dau = new MarerialDAO();

            String d = tabela.getValueAt(tabela.getSelectedRow(), 2)
                    .toString();
            a.setQuantidade(Integer.parseInt(d));
            dau.remover(a);
            JOptionPane.showMessageDialog(null,
                    "Removido com sucesso");
            readJTable();

        } else {
            JOptionPane.showMessageDialog(null,
                    "Selecione um material para poder remover");
        }
    }//GEN-LAST:event_jbtRemoverActionPerformed

    private void jbrPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbrPesquisarActionPerformed
        // TODO add your handling code here:
        readJTable1();
    }//GEN-LAST:event_jbrPesquisarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here:
        if (tabela.getSelectedRow() != -1) {
            jcbNome.setSelectedItem(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
            jtfCodigo.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
            jtfQuantidade.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void tabelaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaAncestorAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_tabelaAncestorAdded

    private void jcbNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbNomeKeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == evt.VK_ENTER) {
            jtfCodigo.requestFocus();
        }
    }//GEN-LAST:event_jcbNomeKeyPressed

    public void readJTable() {
        DefaultTableModel modelo1 = (DefaultTableModel) tabela.getModel();
        modelo1.setNumRows(0);
        MarerialDAO dau = new MarerialDAO();

        for (Material a : dau.consular()) {

            modelo1.addRow(new Object[]{a.getCodigo(), a.getNome(), a.getQuantidade(),
                a.getData()

            });

        }
    }

    public void readJTable1() {
        DefaultTableModel modelo1 = (DefaultTableModel) tabela.getModel();
        modelo1.setNumRows(0);
        MarerialDAO dau = new MarerialDAO();

        for (Material a : dau.consular()) {
            if (a.getCodigo().equalsIgnoreCase(jtfCodigo.getText())){

                modelo1.addRow(new Object[]{a.getCodigo(), a.getNome(),
                    a.getQuantidade(), a.getData()

                });
            }
        }
    }

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RegistarMaterial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbrPesquisar;
    private javax.swing.JButton jbtActualizar;
    private javax.swing.JButton jbtGravar;
    private javax.swing.JButton jbtLimpar;
    private javax.swing.JButton jbtRemover;
    private javax.swing.JComboBox<String> jcbNome;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfQuantidade;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblRegistarMaterial;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}