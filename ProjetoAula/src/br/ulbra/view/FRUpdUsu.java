/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.ulbra.view;

import br.ulbra.controller.UsuarioController;
import br.ulbra.model.Usuario;
import br.ulbra.utils.Utils;
import javax.swing.JOptionPane;

/**
 *
 * @author beeme
 */
public class FRUpdUsu extends javax.swing.JFrame {
    
    private int pkUsuario;
    
    public void setPkUsuario(int pk) {
    
        this.pkUsuario = pk;
    }
    
    /**
     * Creates new form FRUpdUsu
     */
    public FRUpdUsu() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtUsu = new javax.swing.JLabel();
        LabelNome = new javax.swing.JLabel();
        txtNomeUsu = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtEmailUsu = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtDtNascUsu = new javax.swing.JTextField();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        AtivoUsu = new javax.swing.JCheckBox();
        txtSenhaUsu = new javax.swing.JPasswordField();
        btVoltar = new javax.swing.JButton();
        Txt = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtRSenhaUsu = new javax.swing.JLabel();
        txtRepetirSUsu = new javax.swing.JPasswordField();

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("NOME:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        txtUsu.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        txtUsu.setForeground(new java.awt.Color(0, 0, 0));
        txtUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ulbra/img/user.png"))); // NOI18N
        txtUsu.setText(" Usuário");

        LabelNome.setForeground(new java.awt.Color(0, 0, 0));
        LabelNome.setText("NOME:");

        txtNomeUsu.setEditable(false);
        txtNomeUsu.setBackground(new java.awt.Color(153, 153, 153));
        txtNomeUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUsuActionPerformed(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("E-MAIL:");

        txtEmailUsu.setBackground(new java.awt.Color(153, 153, 153));
        txtEmailUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailUsuActionPerformed(evt);
            }
        });

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("DATA NASCIMENTO:");

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("SENHA:");

        txtDtNascUsu.setBackground(new java.awt.Color(153, 153, 153));
        txtDtNascUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDtNascUsuActionPerformed(evt);
            }
        });

        btAlterar.setBackground(new java.awt.Color(204, 204, 204));
        btAlterar.setForeground(new java.awt.Color(0, 0, 0));
        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ulbra/img/edit.png"))); // NOI18N
        btAlterar.setText("ALTERAR");
        btAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAlterarMouseClicked(evt);
            }
        });

        btExcluir.setBackground(new java.awt.Color(204, 204, 204));
        btExcluir.setForeground(new java.awt.Color(0, 0, 0));
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ulbra/img/trash.png"))); // NOI18N
        btExcluir.setText("EXCLUIR");

        AtivoUsu.setForeground(new java.awt.Color(0, 0, 0));
        AtivoUsu.setText("ATIVO");

        txtSenhaUsu.setBackground(new java.awt.Color(153, 153, 153));
        txtSenhaUsu.setForeground(new java.awt.Color(0, 0, 0));
        txtSenhaUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaUsuActionPerformed(evt);
            }
        });

        btVoltar.setBackground(new java.awt.Color(204, 204, 204));
        btVoltar.setForeground(new java.awt.Color(0, 0, 0));
        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ulbra/img/backiconnaguentomais.png"))); // NOI18N
        btVoltar.setText("VOLTAR");
        btVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btVoltarMouseClicked(evt);
            }
        });

        Txt.setForeground(new java.awt.Color(0, 0, 0));
        Txt.setText("CÓDIGO:");

        txtCodigo.setBackground(new java.awt.Color(153, 153, 153));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtRSenhaUsu.setForeground(new java.awt.Color(0, 0, 0));
        txtRSenhaUsu.setText("REPETIR SENHA:");

        txtRepetirSUsu.setBackground(new java.awt.Color(153, 153, 153));
        txtRepetirSUsu.setForeground(new java.awt.Color(0, 0, 0));
        txtRepetirSUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepetirSUsuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(txtUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(AtivoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNomeUsu)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDtNascUsu)
                                .addComponent(txtSenhaUsu))
                            .addGap(145, 145, 145)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(txtEmailUsu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRSenhaUsu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRepetirSUsu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(btAlterar)
                            .addGap(54, 54, 54)
                            .addComponent(btExcluir)
                            .addGap(85, 85, 85)
                            .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(txtUsu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelNome)
                    .addComponent(Txt, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmailUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel19))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(AtivoUsu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDtNascUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(txtSenhaUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtRSenhaUsu)
                .addGap(18, 18, 18)
                .addComponent(txtRepetirSUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar)
                    .addComponent(btExcluir)
                    .addComponent(btVoltar))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeUsuActionPerformed

    private void txtEmailUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailUsuActionPerformed

    private void txtDtNascUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDtNascUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDtNascUsuActionPerformed

    private void txtSenhaUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaUsuActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        UsuarioController controller = new UsuarioController();
        Usuario usu = controller.readForPk(pkUsuario);
        
        String codigo = String.valueOf(usu.getUsuario_pk());
        txtCodigo.setText(codigo);
        txtNomeUsu.setText(usu.getNomeUsu());
        txtEmailUsu.setText(usu.getEmailUsu());
        txtDtNascUsu.setText(usu.getData_nascimentoUsu());
        txtSenhaUsu.setText(usu.getSenhaUsu());
        AtivoUsu.setSelected(usu.getAtivoUsu() == 1);
    }//GEN-LAST:event_formWindowActivated

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVoltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btVoltarMouseClicked

     private boolean verificarCampos() {
        if (txtNomeUsu.getText().equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Campo 'Nome' em branco");
            return false;
        }
        if (!txtNomeUsu.getText().matches("^[\\p{L} ]+$")) {
            JOptionPane.showMessageDialog(null,
                    "Campo 'Nome' possui caracteres inválidos");
            return false;
        }
        if (txtEmailUsu.getText().equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Campo 'Email' em branco");
            return false;
        }
        if (!txtEmailUsu.getText().matches("^[a-zA-Z._]+@[a-zA-Z._]+")) {
            JOptionPane.showMessageDialog(null,
                    "Campo 'Email' possui formato inválido");
            return false;
        }
        if (!txtDtNascUsu.getText().matches("^[0-9]{2}/[0-9]{2}/[0-9]{4}$")) {
            JOptionPane.showMessageDialog(null,
                    "Campo 'Data Nascimento' possui formato inválido"
                    + " Ex: 01/01/2000");
            return false;
        }
        char[] senha = txtSenhaUsu.getPassword();
        if (new String(senha).length() < 8) {
            JOptionPane.showMessageDialog(null,
                    "Campo 'Senha' deve ser maior que 8 caracteres!");
            return false;
        }
        if (!new String(senha).equals(new String(txtRepetirSUsu.getPassword()))) {
            JOptionPane.showMessageDialog(null,
                    "As senhas não são iguais!");
            return false;
        }
        return true;
    }
    
    
    private void btAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAlterarMouseClicked
        if (!verificarCampos()) {
            return;
        }
        
        UsuarioController controller = new UsuarioController();
        String senha = new String(txtSenhaUsu.getPassword());
        Usuario usuario = new Usuario();
        usuario.setUsuario_pk(pkUsuario);
        usuario.setNomeUsu(txtNomeUsu.getText());
        usuario.setEmailUsu(txtEmailUsu.getText());
        usuario.setData_nascimentoUsu(txtDtNascUsu.getText());
        usuario.setAtivoUsu(Utils.salvarBoolean(AtivoUsu.isSelected()));
        usuario.setSenhaUsu(senha);
        if(controller.alterarUsuario(usuario)){
        this.dispose();
    };
    }//GEN-LAST:event_btAlterarMouseClicked

    private void txtRepetirSUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepetirSUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepetirSUsuActionPerformed

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
            java.util.logging.Logger.getLogger(FRUpdUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRUpdUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRUpdUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRUpdUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRUpdUsu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AtivoUsu;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel Txt;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDtNascUsu;
    private javax.swing.JTextField txtEmailUsu;
    private javax.swing.JTextField txtNomeUsu;
    private javax.swing.JLabel txtRSenhaUsu;
    private javax.swing.JPasswordField txtRepetirSUsu;
    private javax.swing.JPasswordField txtSenhaUsu;
    private javax.swing.JLabel txtUsu;
    // End of variables declaration//GEN-END:variables
}
