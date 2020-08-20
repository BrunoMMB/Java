/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eevents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author EDYA
 */
public class AActionListenerHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JOptionPane.showMessageDialog(null, "Clicado no botao 1");
        JOptionPane.showMessageDialog(null, "\nNão acesso a dados do frame");
    }
    
}
