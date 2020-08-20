/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 * http://blog.caelum.com.br/guardando-senhas-criptografadas-em-java/
 * http://blog.caelum.com.br/guardando-senhas-criptografadas-em-java/
 * http://blog.caelum.com.br/guardando-senhas-criptografadas-em-java/
 */
public class JJPasswordField extends javax.swing.JFrame {

    /**
     * Creates new form JJPasswordField3
     */
    public JJPasswordField() {
        initComponents();
        setLocationRelativeTo(null);
        //setResizable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoSalvar = new javax.swing.JButton();
        botaoLogar = new javax.swing.JButton();
        salvarLogin = new javax.swing.JTextField();
        logarLogin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        salvarSenha = new javax.swing.JPasswordField();
        logarSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoLogar.setText("Logar");
        botaoLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLogarActionPerformed(evt);
            }
        });

        jLabel1.setText("Login");

        jLabel2.setText("Login");

        jLabel3.setText("Senha");

        jLabel4.setText("Senha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logarLogin)
                    .addComponent(salvarSenha)
                    .addComponent(logarSenha)
                    .addComponent(salvarLogin))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(botaoSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoLogar)))
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salvarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoSalvar))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(botaoLogar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        if(this.salvar()) {
            JOptionPane.showMessageDialog(rootPane, "Dados salvos.");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Dados não salvos.");
        }
       salvarLogin.setText("");
       salvarSenha.setText("");
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLogarActionPerformed
       Usuario logado = this.logar();
        if(logado == null) {
            JOptionPane.showMessageDialog(rootPane, "Não logado.");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Logado:" + logado.toString());
        }
        logarLogin.setText("");
       logarSenha.setText("");
        
    }//GEN-LAST:event_botaoLogarActionPerformed

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
            java.util.logging.Logger.getLogger(JJPasswordField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JJPasswordField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JJPasswordField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JJPasswordField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JJPasswordField().setVisible(true);
            }
        });
    }

    /*public Connection getConnection() {
        try {
            //necessario registrar o driver para jdbc 3 e projetos com java 5
            //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost/fj21", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    */
    public Connection getConnection() {
        try {
            Properties properties = new Properties();
            properties.setProperty("user", "root");
            properties.setProperty("password", "root");
            properties.setProperty("useSSL", "false");
            properties.setProperty("useTimezone", "true");
            properties.setProperty("serverTimezone", "UTC");
            properties.setProperty("allowPublicKeyRetrieval","true");
            
            String con = "jdbc:mysql://localhost/fj21";
            return DriverManager.getConnection(con, properties);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean adiciona(Usuario elemento) {
        String sql = "insert into usuario (login,senha) values (?,?)";

        try (Connection connection = this.getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1, elemento.getLogin());
            stmt.setString(2, elemento.getSenha());

            stmt.execute();

            System.out.println("Elemento inserido com sucesso.");
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            return false;
        }
        //na verdade deveria retornar o elemento que foi inserido agora
        return true;
    }

    public Usuario localizar(Usuario usuario) {
        String sql = "select * from usuario where login = ? AND senha  = ?";
        Usuario obj = null;
        try (Connection connection = this.getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getSenha());

            try (ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {
                    obj = new Usuario();
                    obj.setId(rs.getLong("id"));
                    obj.setLogin(rs.getString("login"));
                    obj.setSenha(rs.getString("senha"));
                    return obj;
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());

        }
        return obj;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLogar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField logarLogin;
    private javax.swing.JPasswordField logarSenha;
    private javax.swing.JTextField salvarLogin;
    private javax.swing.JPasswordField salvarSenha;
    // End of variables declaration//GEN-END:variables

    private boolean salvar() {
        String login = salvarLogin.getText();
        String senha = new String(salvarSenha.getPassword());

        String senhaCriptografada = this.criptografa(senha);
        System.out.println("Senha normal: " + senha);
        System.out.println("Senha criptografada: " + senhaCriptografada);

        Usuario usuario = new Usuario();
        usuario.setLogin(login);
        usuario.setSenha(senhaCriptografada);

        return this.adiciona(usuario);
    }

    private Usuario logar() {
        String login = logarLogin.getText();
        String senha = new String(logarSenha.getPassword());
        
        String senhaCriptografada = this.criptografa(senha);
        System.out.println("Senha normal: " + senha);
        System.out.println("Senha criptografada: " + senhaCriptografada);
        
        
        Usuario usuario = new Usuario();
        usuario.setLogin(login);
        usuario.setSenha(senhaCriptografada);
        return this.localizar(usuario);
    }

    private String criptografa(String original) {
        String senha = null;
        try {
            MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = algorithm.digest(original.getBytes("UTF-8"));

            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
             senha = hexString.toString();
            
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
           JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
        return senha;
    }
}
