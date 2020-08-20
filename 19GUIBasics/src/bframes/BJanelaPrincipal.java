/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bframes;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author EDYA
 */
public class BJanelaPrincipal extends JFrame {
    JLabel label1;
    JLabel label2;
    public BJanelaPrincipal() {
        
        setTitle("Minha Janela");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout layout = new FlowLayout ( );
        setLayout(layout);
        label1 = new JLabel("Texto fixo 1");
        label2 = new JLabel("Texto fixo 2");
        add(label1);
        add(label2);
    }
    
  
}
