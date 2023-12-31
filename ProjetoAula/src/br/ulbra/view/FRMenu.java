/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.ulbra.view;

/**
 *
 * @author beeme
 */
public class FRMenu extends javax.swing.JFrame {

    /**
     * Creates new form FRMenu7
     */
    public FRMenu() {
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

        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MICad = new javax.swing.JMenu();
        MICadUsu = new javax.swing.JMenuItem();
        miCadTreino = new javax.swing.JMenuItem();
        MICadSair = new javax.swing.JMenuItem();
        MICon = new javax.swing.JMenu();
        MIConUsu = new javax.swing.JMenuItem();
        miTreinos = new javax.swing.JMenuItem();
        MIAju = new javax.swing.JMenu();
        miSobre = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("[ULBRA]- Menu Principal");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ulbra/img/gymMenu.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("MESQUITA´S GYM");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ACADEMIA DE VERDADE!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        MICad.setText("Cadastros");

        MICadUsu.setText("Usuários");
        MICadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MICadUsuActionPerformed(evt);
            }
        });
        MICad.add(MICadUsu);

        miCadTreino.setText("Treinos");
        miCadTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadTreinoActionPerformed(evt);
            }
        });
        MICad.add(miCadTreino);

        MICadSair.setText("Sair");
        MICadSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MICadSairActionPerformed(evt);
            }
        });
        MICad.add(MICadSair);

        jMenuBar1.add(MICad);

        MICon.setText("Consultas");

        MIConUsu.setText("Usuários");
        MIConUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIConUsuActionPerformed(evt);
            }
        });
        MICon.add(MIConUsu);

        miTreinos.setText("Treinos");
        miTreinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTreinosActionPerformed(evt);
            }
        });
        MICon.add(miTreinos);

        jMenuBar1.add(MICon);

        MIAju.setText("Ajuda");

        miSobre.setText("Sobre");
        miSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSobreActionPerformed(evt);
            }
        });
        MIAju.add(miSobre);

        jMenuBar1.add(MIAju);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MICadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MICadUsuActionPerformed
        new FRCadUsu(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_MICadUsuActionPerformed

    private void MIConUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIConUsuActionPerformed
        new FRConUsu(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_MIConUsuActionPerformed

    private void MICadSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MICadSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_MICadSairActionPerformed

    private void miSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSobreActionPerformed
        new FRSobre(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_miSobreActionPerformed

    private void miTreinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTreinosActionPerformed
        new FRConTreinos(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_miTreinosActionPerformed

    private void miCadTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadTreinoActionPerformed
        new FRCadTreinos(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_miCadTreinoActionPerformed

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
            java.util.logging.Logger.getLogger(FRMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MIAju;
    private javax.swing.JMenu MICad;
    private javax.swing.JMenuItem MICadSair;
    private javax.swing.JMenuItem MICadUsu;
    private javax.swing.JMenu MICon;
    private javax.swing.JMenuItem MIConUsu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem miCadTreino;
    private javax.swing.JMenuItem miSobre;
    private javax.swing.JMenuItem miTreinos;
    // End of variables declaration//GEN-END:variables
}
