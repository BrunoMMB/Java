/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajoptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author EDYA
 */
public class AJOPtionPaneMessage {
    public AJOPtionPaneMessage() {
    	   JOptionPane.showMessageDialog(null, "Mensagem");
	
	JOptionPane.showMessageDialog(null, "Mensagem", "Titulo", 	JOptionPane.INFORMATION_MESSAGE);
	
	JOptionPane.showMessageDialog(null, "Mensagem", "Titulo", 	JOptionPane.WARNING_MESSAGE);

	JOptionPane.showMessageDialog(null, "Mensagem", "Titulo", 	JOptionPane.ERROR_MESSAGE);
    }
    public static void main(String[] args) {
        new AJOPtionPaneMessage();
    }
}
