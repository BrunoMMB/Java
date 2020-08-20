/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eevents;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author EDYA
 */
public class BActionListener implements ActionListener {
    JButton button1 = null;
    JButton button2 = null;
    JButton button3 = null;
    public BActionListener() {
        JFrame jFrame = new JFrame();
        
        jFrame.setSize(800, 600);
        jFrame.setTitle("JFrame POOV");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        jFrame.setLayout(fl);
        
        button1 = new JButton();
        button1.setText("Botao 1");
        button1.addActionListener(this);
        
        button2 = new JButton();
        button2.setText("Botao 2");
        button2.addActionListener(this);
        
        
        button3 = new JButton();
        button3.setText("Botao 3");
        button3.addActionListener(this);
        
        jFrame.add(button1);
        jFrame.add(button2);
        jFrame.add(button3);
        jFrame.setVisible(true);
        
    }
 
    public static void main(String[] args) {
        new BActionListener();
    }
    
     
    public void actionPerformed (ActionEvent event) {
            JOptionPane.showMessageDialog(null, "Clicado no botao " + event.getSource());
            JOptionPane.showMessageDialog(null, "\nAcesso a dados do frame "  );
    }
}
