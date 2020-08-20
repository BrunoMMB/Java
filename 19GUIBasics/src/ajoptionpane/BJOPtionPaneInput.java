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
public class BJOPtionPaneInput {
    public BJOPtionPaneInput() {
    	  String valor;
	valor = JOptionPane.showInputDialog( "Digite alguma coisa");

	valor = JOptionPane.showInputDialog("Digite alguma coisa",
                                                                 "Valor Inicial");
	
	valor = JOptionPane.showInputDialog(null, "Digite alguma coisa", "Título da janela", JOptionPane.ERROR_MESSAGE);
    }
    public static void main(String[] args) {
        new BJOPtionPaneInput();
    }
}
