/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eevents;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author EDYA
 */
public class IJTextField1 extends JFrame {

    private JTextField fixa, caixa1, caixa2;
    private JButton exibe, limpa;

    public IJTextField1() {
        super("JTextField - Caixas de texto");
        setLayout(new FlowLayout());
        ///////////////////////////////////////////////////////////////////////
        fixa = new JTextField("Não é possível alterar essa caixa de texto");
        fixa.setEditable(false);
        add(fixa);
        ///////////////////////////////////////////////////////////////////////
  

        caixa1 = new JTextField(20);
        add(caixa1);

        exibe = new JButton("Exibir");
        exibe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == exibe) {
                    JOptionPane.showMessageDialog(null, caixa1.getText());
                }
            }
        }
        );
        add(exibe);
        
        ///////////////////////////////////////////////////////////////////////
        caixa2 = new JTextField(20);
        caixa2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
               JOptionPane.showMessageDialog(null, "Texto escrito catpura com ENTER: " + caixa2.getText());
               
            }
        }
        );
        add(caixa2);
        ///////////////////////////////////////////////////////////////////////
        limpa = new JButton("Limpar");
        limpa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == limpa) {
                    caixa1.setText("");
                    caixa2.setText("");
                }
            }
        }
        );
        add(limpa);
    }

    public static void main(String[] args) {
        IJTextField1 texfield = new IJTextField1();

        texfield.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        texfield.setSize(350, 150);
        texfield.setVisible(true);
    }

}
