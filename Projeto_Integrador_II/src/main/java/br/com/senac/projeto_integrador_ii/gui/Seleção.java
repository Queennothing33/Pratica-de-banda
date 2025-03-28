package br.com.senac.projeto_integrador_ii.gui;

import br.com.senac.projeto_integrador_ii.persistencia.Usuario;
import java.awt.event.KeyEvent;

public class Seleção extends javax.swing.JFrame {
    
    private Usuario usuario;

    
    private Listagem listagem;
    
    public Seleção() {
        initComponents();
        listagem = new Listagem();
        geraAcessibilidade();
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void geraAcessibilidade() {
            btnRock.setMnemonic(KeyEvent.VK_R);
            btnBlackMusic.setMnemonic(KeyEvent.VK_B);   
            btnSertanejo.setMnemonic(KeyEvent.VK_S); 
            btnPop.setMnemonic(KeyEvent.VK_P); 
            btnGerenciar.setMnemonic(KeyEvent.VK_G); 
            btnSair.setMnemonic(KeyEvent.VK_V); 
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escolha = new javax.swing.JPanel();
        lblEscolha = new javax.swing.JLabel();
        btnRock = new javax.swing.JButton();
        btnBlackMusic = new javax.swing.JButton();
        btnSertanejo = new javax.swing.JButton();
        btnPop = new javax.swing.JButton();
        btnGerenciar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escolha.setBackground(new java.awt.Color(100, 0, 139));

        lblEscolha.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        lblEscolha.setForeground(new java.awt.Color(255, 255, 255));
        lblEscolha.setText("Escolha uma prática de banda");
        lblEscolha.setToolTipText("Escolha uma prática de banda");

        btnRock.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        btnRock.setText("Rock");
        btnRock.setToolTipText("Aperte para ver as músicas da prática de rock");
        btnRock.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnRock.setNextFocusableComponent(btnBlackMusic);
        btnRock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRockActionPerformed(evt);
            }
        });

        btnBlackMusic.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        btnBlackMusic.setText("Black Music");
        btnBlackMusic.setToolTipText("Aperte para ver as músicas da pratica de Black Music");
        btnBlackMusic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnBlackMusic.setNextFocusableComponent(btnSertanejo);
        btnBlackMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlackMusicActionPerformed(evt);
            }
        });

        btnSertanejo.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        btnSertanejo.setText("Sertanejo");
        btnSertanejo.setToolTipText("Aperte para ver as músicas da prática de Sertanejo");
        btnSertanejo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnSertanejo.setNextFocusableComponent(btnPop);
        btnSertanejo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSertanejoActionPerformed(evt);
            }
        });

        btnPop.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        btnPop.setText("Pop");
        btnPop.setToolTipText("Aperte para ver as músicas da prática de Pop");
        btnPop.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnPop.setNextFocusableComponent(btnGerenciar);
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });

        btnGerenciar.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        btnGerenciar.setText("Gerenciar músicas");
        btnGerenciar.setToolTipText("Aperte para cadastrar ou excluir músicas");
        btnGerenciar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnGerenciar.setNextFocusableComponent(btnSair);
        btnGerenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciarActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setToolTipText("Aperte para sair da conta");
        btnSair.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EscolhaLayout = new javax.swing.GroupLayout(Escolha);
        Escolha.setLayout(EscolhaLayout);
        EscolhaLayout.setHorizontalGroup(
            EscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscolhaLayout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addGroup(EscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGerenciar, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(btnSertanejo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(251, 251, 251)
                .addGroup(EscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBlackMusic, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(btnPop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(275, Short.MAX_VALUE))
            .addGroup(EscolhaLayout.createSequentialGroup()
                .addGap(392, 392, 392)
                .addComponent(lblEscolha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EscolhaLayout.setVerticalGroup(
            EscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscolhaLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(lblEscolha)
                .addGap(91, 91, 91)
                .addGroup(EscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBlackMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRock, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(EscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSertanejo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPop, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(EscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerenciar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(258, Short.MAX_VALUE))
        );

        lblEscolha.getAccessibleContext().setAccessibleDescription("Texto centralizado no topo da tela com a mensagem \"Escolha uma prática de banda\"");
        btnRock.getAccessibleContext().setAccessibleDescription("Botão para visualizar a prática de rock");
        btnBlackMusic.getAccessibleContext().setAccessibleDescription("Botão para visualizar a prática de Black Music");
        btnSertanejo.getAccessibleContext().setAccessibleDescription("Botão para visualizar a prática de Sertanejo");
        btnPop.getAccessibleContext().setAccessibleDescription("Botão para ver a prática de Pop");
        btnGerenciar.getAccessibleContext().setAccessibleDescription("Botão para abrir o gerenciador de músicas");
        btnSair.getAccessibleContext().setAccessibleDescription("Botão para sair da conta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escolha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escolha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnRockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRockActionPerformed
        listagem.setFiltroGeneroAtual("Rock"); 
        listagem.carregarMusicas("Prática de Rock", "Rock", listagem.getTxtPesquisa().getText()); 
        listagem.setVisible(true); // Exibe a tela de Listagem
    }//GEN-LAST:event_btnRockActionPerformed

    private void btnBlackMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlackMusicActionPerformed
        listagem.setFiltroGeneroAtual("Black Music"); 
        listagem.carregarMusicas("Prática de Black Music", "Black Music", listagem.getTxtPesquisa().getText()); 
        listagem.setVisible(true); 
    }//GEN-LAST:event_btnBlackMusicActionPerformed

    private void btnSertanejoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSertanejoActionPerformed
        listagem.setFiltroGeneroAtual("Sertanejo"); 
        listagem.carregarMusicas("Prática de Sertanejp", "Sertanejo", listagem.getTxtPesquisa().getText());
        listagem.setVisible(true); 
    }//GEN-LAST:event_btnSertanejoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        listagem.setFiltroGeneroAtual("Pop"); 
        listagem.carregarMusicas("Prática de Pop", "Pop", listagem.getTxtPesquisa().getText()); 
        listagem.setVisible(true); 
    }//GEN-LAST:event_btnPopActionPerformed

    private void btnGerenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciarActionPerformed
        Gerenciador gerenciador = new Gerenciador();
        gerenciador.setVisible(true);
    }//GEN-LAST:event_btnGerenciarActionPerformed

  
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
            java.util.logging.Logger.getLogger(Seleção.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seleção.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seleção.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seleção.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seleção().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Escolha;
    public javax.swing.JButton btnBlackMusic;
    public javax.swing.JButton btnGerenciar;
    public javax.swing.JButton btnPop;
    public javax.swing.JButton btnRock;
    public javax.swing.JButton btnSair;
    public javax.swing.JButton btnSertanejo;
    private javax.swing.JLabel lblEscolha;
    // End of variables declaration//GEN-END:variables
}
