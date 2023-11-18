/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package condominio.screens;

import condominio.model.Bloco;
import condominio.model.Condominio;
import condominio.wrapper.Wrapper;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vitor
 */
public class ListaBlocos extends javax.swing.JFrame {
    Wrapper wrapper;
    ArrayList <Bloco> blocos;
    ListaDeCondominios listaCondominio;
    Bloco blocoSelecionado;
    Condominio condominioSelecionado;
    /**
     * Creates new form ListaBlocos
     */
    public ListaBlocos(Wrapper wrapper, ListaDeCondominios listaCondominio, Condominio condominioSelecionado) {
        this.wrapper = wrapper;
        this.blocos = wrapper.blocoDAO.findByCondominio(condominioSelecionado);
        this.listaCondominio = listaCondominio;
        this.condominioSelecionado  = condominioSelecionado;
        initComponents();
        updateTable();
        listSelectionListener();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbBlocos = new javax.swing.JTable();
        lbTitle = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        btVisualizarApartamentos = new javax.swing.JButton();
        btEditarBloco = new javax.swing.JButton();
        btExcluirBloco = new javax.swing.JButton();
        btAtualizarLista = new javax.swing.JButton();
        btNovoBloco = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 480));

        tbBlocos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbBlocos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Andares", "Vagas Garagem"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbBlocos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbBlocos.setGridColor(new java.awt.Color(204, 204, 204));
        tbBlocos.setName(""); // NOI18N
        tbBlocos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbBlocos.setShowGrid(true);
        jScrollPane1.setViewportView(tbBlocos);

        lbTitle.setText("Lista de Blocos");

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btVisualizarApartamentos.setText("Visualizar Aptos.");
        btVisualizarApartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVisualizarApartamentosActionPerformed(evt);
            }
        });

        btEditarBloco.setText("Editar Bloco");
        btEditarBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarBlocoActionPerformed(evt);
            }
        });

        btExcluirBloco.setBackground(new java.awt.Color(153, 0, 0));
        btExcluirBloco.setForeground(new java.awt.Color(255, 255, 255));
        btExcluirBloco.setText("Excluir Bloco");
        btExcluirBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirBlocoActionPerformed(evt);
            }
        });

        btAtualizarLista.setText("Atualizar Lista");
        btAtualizarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarListaActionPerformed(evt);
            }
        });

        btNovoBloco.setText("Novo Bloco");
        btNovoBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoBlocoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btExcluirBloco)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btVisualizarApartamentos)
                        .addGap(18, 18, 18)
                        .addComponent(btNovoBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btEditarBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btVoltar)
                            .addComponent(btAtualizarLista))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btAtualizarLista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btVisualizarApartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNovoBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btEditarBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104)
                        .addComponent(btVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btExcluirBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.setVisible(false);
        this.listaCondominio.setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btVisualizarApartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVisualizarApartamentosActionPerformed
        if(blocoSelecionado != null) {
            ListaApartamentos listaApartamentos = new ListaApartamentos(wrapper, this, this.blocoSelecionado); 
            listaApartamentos.setVisible(true);
            this.setVisible(false);
        } else {
            exibirMensagem("Nenhum bloco selecionado.");
        }
    }//GEN-LAST:event_btVisualizarApartamentosActionPerformed

    private void btEditarBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarBlocoActionPerformed
//        if (blocoSelecionado != null) {
//            EditarBloco editarBloco = new EditarBloco(wrapper, this, blocoSelecionado);
//            editarBloco.setVisible(true);
//            this.setVisible(false);
//        } else {
//            exibirMensagem("Nenhum condomínio selecionado.");
//        }
        exibirMensagem("Funcionalidade ainda não implementada.");
    }//GEN-LAST:event_btEditarBlocoActionPerformed

    private void btExcluirBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirBlocoActionPerformed
        if (blocoSelecionado != null) {
            int resposta = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja excluir o bloco '" + blocoSelecionado.getNome() + "'?",
                "Confirmar exclusão",
                JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                wrapper.blocoDAO.delete(blocoSelecionado.getIdBloco());
                exibirMensagem("Bloco excluído com sucesso!");
                blocoSelecionado = null;
                atualizarLista();
            }
        } else {
            exibirMensagem("Nenhum bloco selecionado.");
        }
    }//GEN-LAST:event_btExcluirBlocoActionPerformed

    private void btAtualizarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarListaActionPerformed
        blocos = wrapper.blocoDAO.findByCondominio(condominioSelecionado);
        updateTable();
    }//GEN-LAST:event_btAtualizarListaActionPerformed

    private void btNovoBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoBlocoActionPerformed
//        CadastroBloco cadastroBloco = new CadastroBloco(wrapper, this);
//        cadastroBloco.setVisible(true);
//        this.setVisible(false);
        exibirMensagem("Funcionalidade ainda não implementada.");
    }//GEN-LAST:event_btNovoBlocoActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ListaBlocos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ListaBlocos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ListaBlocos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ListaBlocos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ListaBlocos().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizarLista;
    private javax.swing.JButton btEditarBloco;
    private javax.swing.JButton btExcluirBloco;
    private javax.swing.JButton btNovoBloco;
    private javax.swing.JButton btVisualizarApartamentos;
    private javax.swing.JButton btVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTable tbBlocos;
    // End of variables declaration//GEN-END:variables

    private void updateTable() {
        DefaultTableModel model = (DefaultTableModel) tbBlocos.getModel();
    model.setRowCount(0); // Clear existing rows
    
        for (Bloco bloco : blocos) {
            Object[] rowData = {
                bloco.getNome(),
                bloco.getAndares(),
                bloco.getVagasDeGaragem()
            };
            model.addRow(rowData);
        }
    }

    private void listSelectionListener() {
        tbBlocos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) {
                int selectedRow = tbBlocos.getSelectedRow();
                    if (selectedRow != -1) {
                        // Linha foi selecionada
                        blocoSelecionado = blocos.get(selectedRow);
                    }
                }
            }
        });
    }

    private void exibirMensagem(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    private void atualizarLista() {
        blocos = wrapper.blocoDAO.findByCondominio(condominioSelecionado);
        updateTable();
    }
}
