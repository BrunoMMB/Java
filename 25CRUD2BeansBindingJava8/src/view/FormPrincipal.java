/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JOptionPane;

/**
 *
 * @author EDYA
 */
public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
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

        barraMenu = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        menuPessoas = new javax.swing.JMenuItem();
        menuCidades = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        sobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Cadastro de Pessoas e Cidades");

        menuCadastros.setText("Cadastros");
        menuCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrosActionPerformed(evt);
            }
        });

        menuPessoas.setText("CRUD Pessoas");
        menuPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPessoasActionPerformed(evt);
            }
        });
        menuCadastros.add(menuPessoas);

        menuCidades.setText("CRUD Cidades");
        menuCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCidadesActionPerformed(evt);
            }
        });
        menuCadastros.add(menuCidades);

        barraMenu.add(menuCadastros);

        menuAjuda.setText("Ajuda");

        sobre.setText("Sobre");
        sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreActionPerformed(evt);
            }
        });
        menuAjuda.add(sobre);

        barraMenu.add(menuAjuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPessoasActionPerformed
                FormPessoa formPessoa = new FormPessoa(this, true); //
        
        formPessoa.setLocationRelativeTo(null);
        formPessoa.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        formPessoa.setResizable(false);
        formPessoa.setVisible(true);    
    }//GEN-LAST:event_menuPessoasActionPerformed

    private void sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sobreActionPerformed

    private void menuCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadastrosActionPerformed

    private void menuCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCidadesActionPerformed
        FormCidade formCidade = new FormCidade(this, true); //
        
        formCidade.setLocationRelativeTo(null);
        formCidade.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        formCidade.setResizable(false);
        formCidade.setVisible(true);        
    }//GEN-LAST:event_menuCidadesActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormPrincipal formPrincipal = new FormPrincipal();
                formPrincipal.setVisible(true);
                formPrincipal.setLocationRelativeTo(null);

                //change background color
                //formPrincipal.getContentPane().setBackground(Color.red);


                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenuItem menuCidades;
    private javax.swing.JMenuItem menuPessoas;
    private javax.swing.JMenuItem sobre;
    // End of variables declaration//GEN-END:variables
}
