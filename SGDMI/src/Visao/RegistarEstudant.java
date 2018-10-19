/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Controle.EstudanteDAO;
import Modelo.Estudante;
//import java.sql.Time;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Tem
 */
public class RegistarEstudant extends javax.swing.JFrame {

    /**
     * Creates new form
     */
    public RegistarEstudant() {

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
        lblRegistoEstudante = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblCurso = new javax.swing.JLabel();
        jcbCurso = new javax.swing.JComboBox<>();
        jtfNome = new javax.swing.JTextField();
        jtfCodigo = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jcbSala = new javax.swing.JComboBox<>();
        lblSala = new javax.swing.JLabel();
        lblRegime = new javax.swing.JLabel();
        jcbRegime = new javax.swing.JComboBox<>();
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

        lblRegistoEstudante.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblRegistoEstudante.setText("REGISTO DO ESTUDANTE");
        jPanel1.add(lblRegistoEstudante);

        jPanel5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel5AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblNome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNome.setText("Nome");

        lblCodigo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCodigo.setText("Codigo");

        lblCurso.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCurso.setText("Curso");

        jcbCurso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jcbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Informatica.", "Matematica.", "Estatistica.", "CIG." }));
        jcbCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcbCursoKeyPressed(evt);
            }
        });

        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });
        jtfNome.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtfNomePropertyChange(evt);
            }
        });
        jtfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfNomeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNomeKeyTyped(evt);
            }
        });

        jtfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoActionPerformed(evt);
            }
        });
        jtfCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfCodigoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCodigoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfCodigo))))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurso)
                    .addComponent(jcbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setLayout(null);

        jcbSala.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jcbSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10" }));
        jcbSala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcbSalaKeyPressed(evt);
            }
        });
        jPanel6.add(jcbSala);
        jcbSala.setBounds(160, 10, 240, 30);

        lblSala.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSala.setText("Sala");
        jPanel6.add(lblSala);
        lblSala.setBounds(50, 10, 70, 22);

        lblRegime.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblRegime.setText("Regime");
        jPanel6.add(lblRegime);
        lblRegime.setBounds(50, 80, 58, 22);

        jcbRegime.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jcbRegime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manha.", "Tarde.", "Noite." }));
        jcbRegime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbRegimeActionPerformed(evt);
            }
        });
        jcbRegime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcbRegimeKeyPressed(evt);
            }
        });
        jPanel6.add(jcbRegime);
        jcbRegime.setBounds(160, 80, 240, 30);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                "Codigo", "Nome", "Curso", "Sala", "Regime", "Data"
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
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jbtLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLimparActionPerformed
        // TODO add your handling code here:

        jtfNome.setText(null);
        jtfCodigo.setText(null);
        jcbSala.setSelectedIndex(0);
        jcbCurso.setSelectedIndex(0);
        jcbRegime.setSelectedIndex(0);
        readJTable();
    }//GEN-LAST:event_jbtLimparActionPerformed

    private void jcbRegimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbRegimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbRegimeActionPerformed

    private void jcbCursoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbCursoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jcbSala.requestFocus();
        }
    }//GEN-LAST:event_jcbCursoKeyPressed

    private void jcbSalaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbSalaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jcbRegime.requestFocus();
        }
    }//GEN-LAST:event_jcbSalaKeyPressed

    private void jcbRegimeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbRegimeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jbtGravar.requestFocus();
        }
    }//GEN-LAST:event_jcbRegimeKeyPressed

    private void tabelaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaAncestorAdded

    private void jbtGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtGravarActionPerformed
        // TODO add your handling code here:
        Estudante a = new Estudante();

        EstudanteDAO estu = new EstudanteDAO();

        a.setNome(jtfNome.getText());
        a.setCodigo(Integer.parseInt((jtfCodigo.getText())));
        a.setSala((String) jcbSala.getSelectedItem());
        a.setCurso((String) jcbCurso.getSelectedItem());
        a.setRegime((String) jcbRegime.getSelectedItem());
        a.setData(new Date());

        if (estu.gravar(a)) {
            JOptionPane.showMessageDialog(null, "O estudante foi registado com sucesso");
            jtfNome.setText(null);
            jtfCodigo.setText(null);
            jcbCurso.setSelectedIndex(0);
            jcbRegime.setSelectedIndex(0);
            jcbSala.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(null, "O estudante nao foi  registado com sucesso");
        }

        readJTable();
    }//GEN-LAST:event_jbtGravarActionPerformed

    private void jbtActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtActualizarActionPerformed
        // TODO add your handling code here:
        if (tabela.getSelectedRow() != -1) {
            Estudante a = new Estudante();

            EstudanteDAO estu = new EstudanteDAO();

            a.setNome(jtfNome.getText());
            a.setCodigo(Integer.parseInt((jtfCodigo.getText())));
            a.setSala((String) jcbSala.getSelectedItem());
            a.setCurso((String) jcbCurso.getSelectedItem());
            a.setRegime((String) jcbRegime.getSelectedItem());
            a.setData((Date) tabela.getValueAt(tabela.getSelectedRow(), 5));

            if (estu.atualizar(a)) {
                JOptionPane.showMessageDialog(null, "O estudante foi actualizado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "O estudante nao foi actualizado!!!");
            }

            jtfNome.setText(null);
            jtfCodigo.setText(null);
            jcbCurso.setSelectedIndex(0);
            jcbRegime.setSelectedIndex(0);
            jcbSala.setSelectedIndex(0);
            readJTable();

        }
    }//GEN-LAST:event_jbtActualizarActionPerformed

    private void jbtRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRemoverActionPerformed
        // TODO add your handling code here:
        if (tabela.getSelectedRow() != -1) {
            Estudante a = new Estudante();
            EstudanteDAO dau = new EstudanteDAO();

            String d = tabela.getValueAt(tabela.getSelectedRow(), 0)
                    .toString();
            a.setCodigo(Integer.parseInt(d));
            dau.remover(a);

            JOptionPane.showMessageDialog(null,
                    "Removido com sucesso");
            readJTable();

        } else {
            JOptionPane.showMessageDialog(null,
                    "Selecione um estudante para poder excluir");
        }

    }//GEN-LAST:event_jbtRemoverActionPerformed

    private void jbrPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbrPesquisarActionPerformed
        // TODO add your handling code here:
        readJTable1();
    }//GEN-LAST:event_jbrPesquisarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here:
        if (tabela.getSelectedRow() != -1) {
            jtfNome.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
            jtfCodigo.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
            jcbCurso.setSelectedItem(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
            jcbSala.setSelectedItem(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
            jcbRegime.setSelectedItem(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());

        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void jPanel5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel5AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5AncestorAdded

    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeActionPerformed

    private void jtfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCodigoActionPerformed

    private void jtfNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNomeKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {
            jtfCodigo.requestFocus();
        }
    }//GEN-LAST:event_jtfNomeKeyPressed

    private void jtfCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoKeyPressed

        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jcbCurso.requestFocus();
        }
    }//GEN-LAST:event_jtfCodigoKeyPressed

    private void jbtGravarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtGravarKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jbtGravarKeyPressed

    private void jtfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNomeKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtfNomeKeyTyped

    private void jtfCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtfCodigoKeyTyped

    private void jtfNomePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtfNomePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomePropertyChange

    public void readJTable() {
        DefaultTableModel modelo1 = (DefaultTableModel) tabela.getModel();
        modelo1.setNumRows(0);
        EstudanteDAO dau = new EstudanteDAO();

        for (Estudante a : dau.consular()) {

            modelo1.addRow(new Object[]{a.getCodigo(), a.getNome(), a.getCurso(),
                a.getSala(), a.getRegime(), a.getData()

            });

        }
    }

    public void readJTable1() {
        DefaultTableModel modelo1 = (DefaultTableModel) tabela.getModel();
        modelo1.setNumRows(0);
        EstudanteDAO dau = new EstudanteDAO();

        for (Estudante a : dau.consular()) {
            if (a.getNome().equalsIgnoreCase(jtfNome.getText())) {

                modelo1.addRow(new Object[]{a.getCodigo(), a.getNome(),
                    a.getCurso(), a.getSala(), a.getRegime(), a.getData()
                 

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
            java.util.logging.Logger.getLogger(RegistarEstudant.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistarEstudant.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistarEstudant.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistarEstudant.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistarEstudant().setVisible(true);

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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbrPesquisar;
    private javax.swing.JButton jbtActualizar;
    private javax.swing.JButton jbtGravar;
    private javax.swing.JButton jbtLimpar;
    private javax.swing.JButton jbtRemover;
    private javax.swing.JComboBox<String> jcbCurso;
    private javax.swing.JComboBox<String> jcbRegime;
    private javax.swing.JComboBox<String> jcbSala;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRegime;
    private javax.swing.JLabel lblRegistoEstudante;
    private javax.swing.JLabel lblSala;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}