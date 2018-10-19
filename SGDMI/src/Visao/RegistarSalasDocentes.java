/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Controle.SalasDocentesDAO;
import Modelo.SalasDocentes;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Tem
 */
public class RegistarSalasDocentes extends javax.swing.JFrame {

    /**
     * Creates new form
     */
    public RegistarSalasDocentes() {

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblRegistoDasSalasDocentes = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblDescricao = new javax.swing.JLabel();
        lblSala = new javax.swing.JLabel();
        jtfDescricao = new javax.swing.JTextField();
        jtfSala = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jbtGravar = new javax.swing.JButton();
        jbtActualizar = new javax.swing.JButton();
        jbtRemover = new javax.swing.JButton();
        jbrPesquisar = new javax.swing.JButton();
        jbtLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblRegistoDasSalasDocentes.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblRegistoDasSalasDocentes.setText("REGISTO DAS SALAS DOS DOCENTES");
        jPanel1.add(lblRegistoDasSalasDocentes);

        jPanel5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel5AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblDescricao.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblDescricao.setText("Descricao");

        lblSala.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSala.setText("Sala");

        jtfDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDescricaoActionPerformed(evt);
            }
        });
        jtfDescricao.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtfDescricaoPropertyChange(evt);
            }
        });
        jtfDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfDescricaoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDescricaoKeyTyped(evt);
            }
        });

        jtfSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSalaActionPerformed(evt);
            }
        });
        jtfSala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfSalaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(lblSala, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfSala)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSala)
                    .addComponent(jtfSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );

        jPanel6.setLayout(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                "Numero Da Sala", "Descricao", "Data"
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
        jScrollPane2.setViewportView(tabela);

        jPanel3.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jbtGravar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtGravar.setText("Gravar");
        jbtGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtGravarActionPerformed(evt);
            }
        });
        jbtGravar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtGravarKeyPressed(evt);
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
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jbtLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLimparActionPerformed
        // TODO add your handling code here:

        jtfDescricao.setText(null);
        jtfSala.setText(null);
        readJTable();
    }//GEN-LAST:event_jbtLimparActionPerformed

    private void tabelaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaAncestorAdded

    private void jbtGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtGravarActionPerformed
        // TODO add your handling code here:
        SalasDocentes a = new SalasDocentes();

        SalasDocentesDAO estu = new SalasDocentesDAO();

        a.setDescricao(jtfDescricao.getText());
        a.setNumerosala(jtfSala.getText());
        a.setData(new Date());

        if (estu.gravar(a)) {
            JOptionPane.showMessageDialog(null, "A sala foi registada com sucesso");
            jtfDescricao.setText(null);
            jtfSala.setText(null);
        } else {
            JOptionPane.showMessageDialog(null, "A sla nao foi  registada com sucesso");
        }

        readJTable();
    }//GEN-LAST:event_jbtGravarActionPerformed

    private void jbtActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtActualizarActionPerformed
        // TODO add your handling code here:
        if (tabela.getSelectedRow() != -1) {
            SalasDocentes a = new SalasDocentes();

            SalasDocentesDAO estu = new SalasDocentesDAO();

            a.setDescricao(jtfDescricao.getText());
            a.setNumerosala(jtfSala.getText());
            a.setData((Date) tabela.getValueAt(tabela.getSelectedRow(), 3));

            if (estu.atualizar(a)) {
                JOptionPane.showMessageDialog(null, "A sala foi actualizada com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "A sla nao foi actualizada!!!");
            }

            jtfDescricao.setText(null);
            jtfSala.setText(null);
            readJTable();

        }
    }//GEN-LAST:event_jbtActualizarActionPerformed

    private void jbtRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRemoverActionPerformed
        // TODO add your handling code here:
        if (tabela.getSelectedRow() != -1) {
            SalasDocentes a = new SalasDocentes();
            SalasDocentesDAO dau = new SalasDocentesDAO();

            String d = tabela.getValueAt(tabela.getSelectedRow(), 0)
                    .toString();
            a.setNumerosala(d);
            dau.remover(a);

            JOptionPane.showMessageDialog(null,
                    "Removido com sucesso");
            readJTable();

        } else {
            JOptionPane.showMessageDialog(null,
                    "Selecione uma sala para poder remover");
        }

    }//GEN-LAST:event_jbtRemoverActionPerformed

    private void jbrPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbrPesquisarActionPerformed
        // TODO add your handling code here:
        readJTable1();
    }//GEN-LAST:event_jbrPesquisarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here:
        if (tabela.getSelectedRow() != -1) {
            jtfDescricao.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
            jtfSala.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());

        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void jPanel5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel5AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5AncestorAdded

    private void jtfDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDescricaoActionPerformed

    private void jtfSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSalaActionPerformed

    private void jtfDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDescricaoKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {
            jtfSala.requestFocus();
        }
    }//GEN-LAST:event_jtfDescricaoKeyPressed

    private void jtfSalaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSalaKeyPressed

        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jbtGravar.requestFocus();
        }
    }//GEN-LAST:event_jtfSalaKeyPressed

    private void jbtGravarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtGravarKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jbtGravarKeyPressed

    private void jtfDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDescricaoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDescricaoKeyTyped

    private void jtfDescricaoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtfDescricaoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDescricaoPropertyChange

    public void readJTable() {
        DefaultTableModel modelo1 = (DefaultTableModel) tabela.getModel();
        modelo1.setNumRows(0);
        SalasDocentesDAO dau = new SalasDocentesDAO();

        for (SalasDocentes a : dau.consular()) {

            modelo1.addRow(new Object[]{a.getNumerosala(), a.getDescricao(), a.getData()

            });

        }
    }

    public void readJTable1() {
        DefaultTableModel modelo1 = (DefaultTableModel) tabela.getModel();
        modelo1.setNumRows(0);
        SalasDocentesDAO dau = new SalasDocentesDAO();

        for (SalasDocentes a : dau.consular()) {
            if (a.getNumerosala().equalsIgnoreCase(jtfSala.getText())) {

                modelo1.addRow(new Object[]{a.getNumerosala(), a.getDescricao(), a.getData()

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
            java.util.logging.Logger.getLogger(SalasDocentes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalasDocentes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalasDocentes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalasDocentes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RegistarSalasDocentes().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbrPesquisar;
    private javax.swing.JButton jbtActualizar;
    private javax.swing.JButton jbtGravar;
    private javax.swing.JButton jbtLimpar;
    private javax.swing.JButton jbtRemover;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfSala;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblRegistoDasSalasDocentes;
    private javax.swing.JLabel lblSala;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}