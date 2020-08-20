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
public class CJOPtionPaneInput {
    public CJOPtionPaneInput() {
    	String valor;
	String valores[ ] = new String[5];
     valores[0] = "Opcao 1";
     valores[1] = "Opcao 2";
     valores[2] = "Opcao 3";
     valores[3] = "Opcao 4";
     valores[4] = "Opcao 5";       
     valor = (String) JOptionPane.showInputDialog(null, "Digite alguma coisa", "Título da janela", JOptionPane.QUESTION_MESSAGE,
                null, valores, valores[2]);
     JOptionPane.showMessageDialog(null, valor);
    
    }
    public static void main(String[] args) {
        new CJOPtionPaneInput();
    }
}
