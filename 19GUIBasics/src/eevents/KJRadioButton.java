/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eevents;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class KJRadioButton extends JFrame {
	private JRadioButton java,
			     csharp;
	private JLabel myLabel;
	private RadioButtonHandler handler;
	
	public KJRadioButton(){
		super("Radio Buttons - JavaProgressivo.net");
		setLayout( new FlowLayout() );
		handler = new RadioButtonHandler();
		
		myLabel = new JLabel("Qual a melhor linguagem de programação?");
		java = new JRadioButton("Java", false);
		csharp = new JRadioButton("C#", false);
		
		add(myLabel);
		add(java);
		add(csharp);

		java.addItemListener(handler);
		csharp.addItemListener(handler);
	}
	
	private class RadioButtonHandler implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent event) {
			if(java.isSelected())
				JOptionPane.showMessageDialog(null,"Parabéns, você é o cara");
			if(csharp.isSelected())
				JOptionPane.showMessageDialog(null,"Sabe de nada, inocente!");
		}
		
	}

        public static void main(String[] args) {
		KJRadioButton radioButtonFrame = new KJRadioButton();
		radioButtonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		radioButtonFrame.setSize( 350, 100 );
		radioButtonFrame.setVisible( true );

	}
}

