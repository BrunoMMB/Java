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
public class AActionListener {
    JButton button1 = null;
    JButton button2 = null;
    JButton button3 = null;
    AActionListener() {
        JFrame jFrame = new JFrame();
        jFrame.setSize(800, 600);
        jFrame.setTitle("JFrame POOV");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        jFrame.setLayout(fl);
        
        button1 = new JButton();
        button1.setText("Botao 1");
        //way 1
        button1.addActionListener(new AActionListenerHandler());
        
        
        button2 = new JButton();
        button2.setText("Botao 2");
        //way 2
        //a new named class
        button2.addActionListener(new AActionListenerInnerHandler());
        
        
        button3 = new JButton();
        button3.setText("Botao 3");
        //way 3
        //a new inner class
        
        button3.addActionListener( new ActionListener() {
                    public void actionPerformed(ActionEvent e) {  
                        JOptionPane.showMessageDialog(null, "Clicado no botao 3");
                        JOptionPane.showMessageDialog(null, "\nAcesso a dados do frame "  );
                        JOptionPane.showMessageDialog(null, "\nCliquei no botao " + button3.getText() );
                    }  
        });  
        
        jFrame.add(button1);
        jFrame.add(button2);
        jFrame.add(button3);
        jFrame.setVisible(true);
    }
 
    public static void main(String[] args)  {
        new AActionListener();
    }
    
     private class AActionListenerInnerHandler implements ActionListener {
		public void actionPerformed (ActionEvent event) {
			JOptionPane.showMessageDialog(null, "Clicado no botao 2");
                        JOptionPane.showMessageDialog(null, "\nAcesso a dados do frame "  );
                        JOptionPane.showMessageDialog(null, "\nCliquei no botao " + button2.getText() );
		}
	}
}
