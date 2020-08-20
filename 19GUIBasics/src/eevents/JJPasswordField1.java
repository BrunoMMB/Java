/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eevents;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author EDYA
 */
public class JJPasswordField1 extends JFrame {

    private JTextField usuario;
    private JPasswordField senha;
    private JButton login, limpa;
    private JLabel user, pass;

    public JJPasswordField1() {
        super("Login em Java");
        setLayout(new FlowLayout());

        user = new JLabel("Usuário: ");
        add(user);

        usuario = new JTextField(15);
        add(usuario);

        pass = new JLabel("Senha:   ");
        add(pass);

        senha = new JPasswordField(15);
        add(senha);

        login = new JButton("Entrar");
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == login) {
                    if (usuario.getText().equals("IFTM") && senha.getText().equals("UPT")) {
                        JOptionPane.showMessageDialog(null, "Parabéns, você entrou na Matrix!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Senha errada! Estude Java!");
                    }
                }

            }
        }
        );
        add(login);

        limpa = new JButton("Limpar");
        limpa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == limpa) {
                    usuario.setText("");
                    senha.setText("");
                }
            }
        }
        );
        add(limpa);
    }

    public static void main(String[] args) {
        JJPasswordField1 texfield = new JJPasswordField1();

        texfield.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        texfield.setSize(250, 150);
        texfield.setVisible(true);
    }
}
