package br.com.senac.projeto_integrador_ii.gui;

import br.com.senac.projeto_integrador_ii.persistencia.Musica;
import br.com.senac.projeto_integrador_ii.persistencia.MusicaDAO;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Gerenciador extends javax.swing.JFrame {

    public Gerenciador() {
        initComponents();
        geraAcessibilidade();
    }
    
    public void geraAcessibilidade() {
            btnCadastrar.setMnemonic(KeyEvent.VK_C);
            btnExcluir.setMnemonic(KeyEvent.VK_E);            
            btnVoltar.setMnemonic(KeyEvent.VK_V);
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Roxo = new javax.swing.JPanel();
        Branco = new javax.swing.JPanel();
        lblGerenciador = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblBanda = new javax.swing.JLabel();
        lblTom = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblSemestre = new javax.swing.JLabel();
        lblUrl = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtBanda = new javax.swing.JTextField();
        txtTom = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        txtSemestre = new javax.swing.JTextField();
        txtUrl = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Roxo.setBackground(new java.awt.Color(100, 0, 139));
        Roxo.setMaximumSize(new java.awt.Dimension(1440, 1024));
        Roxo.setMinimumSize(new java.awt.Dimension(1440, 1024));
        Roxo.setPreferredSize(new java.awt.Dimension(1440, 1024));

        Branco.setBackground(new java.awt.Color(255, 255, 255));
        Branco.setMaximumSize(new java.awt.Dimension(1080, 816));
        Branco.setMinimumSize(new java.awt.Dimension(1080, 816));
        Branco.setNextFocusableComponent(btnVoltar);
        Branco.setPreferredSize(new java.awt.Dimension(1080, 816));

        lblGerenciador.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblGerenciador.setText("Gerenciador de músicas");
        lblGerenciador.setToolTipText("Gerenciador de músicas");

        lblId.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblId.setText("Identificação Númerica:");

        lblTitulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblTitulo.setText("Título:");

        lblBanda.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblBanda.setText("Banda:");

        lblTom.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblTom.setText("Tom:");

        lblGenero.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblGenero.setText("Gênero:");

        lblSemestre.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblSemestre.setText("Semestre iniciado:");

        lblUrl.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblUrl.setText("URL da tablatura:");

        btnCadastrar.setBackground(new java.awt.Color(0, 153, 51));
        btnCadastrar.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setToolTipText("Aperte para cadastrar uma música");
        btnCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 1, true));
        btnCadastrar.setNextFocusableComponent(btnExcluir);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(204, 0, 0));
        btnExcluir.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Aperte para excluir uma música");
        btnExcluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 1, true));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setToolTipText("Aperte para voltar para a tela de seleção");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        txtId.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtId.setToolTipText("Digite aqui a identificação numérica");
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtId.setNextFocusableComponent(txtTitulo);

        txtTitulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtTitulo.setToolTipText("Digite aqui o título");
        txtTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTitulo.setNextFocusableComponent(txtBanda);

        txtBanda.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtBanda.setToolTipText("Digite aqui a banda");
        txtBanda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBanda.setNextFocusableComponent(txtTom);

        txtTom.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtTom.setToolTipText("Digite aqui o tom");
        txtTom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTom.setNextFocusableComponent(txtGenero);

        txtGenero.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtGenero.setToolTipText("Digite aqui o gênero");
        txtGenero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtGenero.setNextFocusableComponent(txtSemestre);
        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });

        txtSemestre.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtSemestre.setToolTipText("Digite aqui o semestre iniciado");
        txtSemestre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSemestre.setNextFocusableComponent(txtUrl);

        txtUrl.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtUrl.setToolTipText("Digite aqui a URL");
        txtUrl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUrl.setNextFocusableComponent(btnCadastrar);

        javax.swing.GroupLayout BrancoLayout = new javax.swing.GroupLayout(Branco);
        Branco.setLayout(BrancoLayout);
        BrancoLayout.setHorizontalGroup(
            BrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BrancoLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(BrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BrancoLayout.createSequentialGroup()
                        .addGroup(BrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGenero))
                        .addGroup(BrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(BrancoLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(347, 347, 347)
                                .addComponent(btnVoltar))
                            .addGroup(BrancoLayout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(txtGenero)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BrancoLayout.createSequentialGroup()
                        .addGroup(BrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblId)
                            .addComponent(lblUrl)
                            .addComponent(lblTitulo)
                            .addComponent(lblBanda)
                            .addComponent(lblTom)
                            .addComponent(lblSemestre))
                        .addGap(18, 18, 18)
                        .addGroup(BrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId)
                            .addComponent(txtTitulo)
                            .addComponent(txtBanda)
                            .addComponent(txtTom)
                            .addComponent(txtSemestre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUrl))))
                .addGap(90, 90, 90))
            .addGroup(BrancoLayout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(lblGerenciador)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BrancoLayout.setVerticalGroup(
            BrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BrancoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblGerenciador)
                .addGap(40, 40, 40)
                .addGroup(BrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(BrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(BrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBanda, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBanda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(BrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTom)
                    .addComponent(txtTom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(BrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(BrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSemestre)
                    .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(BrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUrl)
                    .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(BrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        lblGerenciador.getAccessibleContext().setAccessibleDescription("Texto centralizado no topo da tela com a mensagem \"Gerenciador de músicas\"");
        btnCadastrar.getAccessibleContext().setAccessibleDescription("Botão para cadastrar uma música");
        btnExcluir.getAccessibleContext().setAccessibleDescription("Botão para excluir uma música");
        btnVoltar.getAccessibleContext().setAccessibleDescription("Botão para voltar para a tela de seleção");
        txtId.getAccessibleContext().setAccessibleDescription("Campo de texto para id");
        txtTitulo.getAccessibleContext().setAccessibleDescription("Campo de texto para título");
        txtBanda.getAccessibleContext().setAccessibleDescription("Campo de texto para banda");
        txtTom.getAccessibleContext().setAccessibleName("");
        txtTom.getAccessibleContext().setAccessibleDescription("Campo de texto para tom");
        txtGenero.getAccessibleContext().setAccessibleDescription("Campo de texto para gênero");
        txtSemestre.getAccessibleContext().setAccessibleDescription("Campo de texto para semestre iniciado");
        txtUrl.getAccessibleContext().setAccessibleDescription("Campo de texto para URL");

        javax.swing.GroupLayout RoxoLayout = new javax.swing.GroupLayout(Roxo);
        Roxo.setLayout(RoxoLayout);
        RoxoLayout.setHorizontalGroup(
            RoxoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoxoLayout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(Branco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );
        RoxoLayout.setVerticalGroup(
            RoxoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoxoLayout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(Branco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Roxo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Roxo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Musica novaMusica = new Musica();
        try{
            if(txtId.getText().trim().isEmpty() ||
               txtTitulo.getText().trim().isEmpty() ||
               txtBanda.getText().trim().isEmpty() ||
               txtTom.getText().trim().isEmpty() ||
               txtGenero.getText().trim().isEmpty() ||
               txtSemestre.getText().trim().isEmpty() ||
               txtUrl.getText().trim().isEmpty()) { 
                JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;   
            }
            
            int numero = Integer.parseInt(txtId.getText().trim());
            novaMusica.setTitulo(txtTitulo.getText());
            novaMusica.setBanda(txtBanda.getText());
            novaMusica.setTom(txtTom.getText());
            novaMusica.setGenero(txtGenero.getText());
            novaMusica.setSemestre_iniciado(txtSemestre.getText());
            novaMusica.setUrl(txtUrl.getText());

            MusicaDAO musicaDao = new MusicaDAO();
            musicaDao.cadastrar(novaMusica);
            JOptionPane.showMessageDialog(this, "Música cadastrada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha:\n" + e.getMessage());
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        MusicaDAO musicaDao = new MusicaDAO();
        try{
            musicaDao.excluir(Integer.parseInt(txtId.getText()));
            JOptionPane.showMessageDialog(null,"Música excluída com sucesso!");
            txtId.setText("");
            txtTitulo.setText("");
            txtBanda.setText("");
            txtTom.setText("");
            txtGenero.setText("");
            txtSemestre.setText("");
            txtUrl.setText(""); 
        } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor, insira um ID válido.");
    }
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(Gerenciador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerenciador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerenciador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerenciador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gerenciador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Branco;
    private javax.swing.JPanel Roxo;
    public javax.swing.JButton btnCadastrar;
    public javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblBanda;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblGerenciador;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblSemestre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTom;
    private javax.swing.JLabel lblUrl;
    private javax.swing.JTextField txtBanda;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtSemestre;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtTom;
    private javax.swing.JTextField txtUrl;
    // End of variables declaration//GEN-END:variables
}
