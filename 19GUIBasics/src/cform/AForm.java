/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cform;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author EDYA
 */
public class AForm {

    public AForm() {
        JFrame jFrame = new JFrame();
        
        jFrame.setSize(800, 600);
        jFrame.setTitle("JFrame POOV");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        jFrame.setLayout(fl);

        //JLabel
        final JLabel label1 = new JLabel();
        label1.setText("Meu primeiro label");
        JLabel label2 = new JLabel("Meu segundo JLabel");
        jFrame.add(label1);
        jFrame.add(label2);

        //JButton
        final JButton button1 = new JButton();
        button1.setText("Botaoooooooo");
        jFrame.add(button1);
        JButton button2 = new JButton("Meu Texto do botão");
        jFrame.add(button2);

        //JTextField
        final JTextField field1 = new JTextField("Texto inicial");
        final JTextField field2 = new JTextField("Texto inicial", 10);
        final JTextField field3 = new JTextField();
        field3.setColumns(20);
        field3.setEditable(false);
        JTextField field4 = new JTextField(15);

        jFrame.add(field1);
        jFrame.add(field2);
        jFrame.add(field3);
        jFrame.add(field4);

        //JPassword
        final JPasswordField pass1 = new JPasswordField(10);
        JPasswordField pass2 = new JPasswordField("Texto", 8);
        JPasswordField pass3 = new JPasswordField("Texto");
        jFrame.add(pass1);
        jFrame.add(pass2);
        jFrame.add(pass3);

        //JRadioButton
        final JRadioButton radio1 = new JRadioButton("Java", false);
        JRadioButton radio2 = new JRadioButton("PHP", false);
        jFrame.add(radio1);
        jFrame.add(radio2);

        JRadioButton radio3 = new JRadioButton("Java", false);
        JRadioButton radio4 = new JRadioButton("PHP", false);
        jFrame.add(radio3);
        jFrame.add(radio4);

        ButtonGroup bg = new ButtonGroup();
        bg.add(radio3);
        bg.add(radio4);

        //JCheckBox
        final JCheckBox box1 = new JCheckBox("Primeiro check");
        JCheckBox box2 = new JCheckBox();
        box2.setText("Segundo check");
        jFrame.add(box1);
        jFrame.add(box2);

        //JComboBox
        String[] nomes = new String[]{"João", "Maria", "José", "Carlos", "Paula"};
        final JComboBox combo1 = new JComboBox(nomes);
        combo1.setSelectedIndex(3);
        jFrame.add(combo1);

        //JTextArea
        final JTextArea area = new JTextArea(10, 20);
        jFrame.add(area);

        //JToggleButton (An implementation of a two-state button)
        final JToggleButton jToggleButton = new JToggleButton("Toggle");
        jFrame.add(jToggleButton);
        
        JButton submit = new JButton();
        submit.setText("MOSTRAR INFORMAÇÕES");
        jFrame.add(submit);

        
        
        
        submit.addActionListener( new ActionListener() {
                    public void actionPerformed(ActionEvent e) {  
                        StringBuilder resp = new StringBuilder();
                        resp.append("Texto do label 1: " + label1.getText());
                        resp.append("\nTexto do botao 1: " + button1.getText());
                        resp.append("\nTexto do field 1: " + field1.getText());
                        resp.append("\nTexto do fiel2 2: " + field2.getText());
                        field3.setText("");
                        resp.append("\nTexto do fiel3 foi limpo" );
                        resp.append("\nTexto da senha 1: " + pass1.getPassword());
                        resp.append("\nO radio 1 esta selecionado ?R: " + radio1.isSelected());
                        resp.append("\nO checkbox 1 esta selecionado ?R: " + box1.isSelected());
                        resp.append("\nTexto do combo1: " + (String)combo1.getSelectedItem());
                        resp.append("\nTexto do textarea: " + area.getText());
                        resp.append("\nO toggle está marcado ?R: " + jToggleButton.isSelected());
                        JOptionPane.showMessageDialog(null, resp.toString());
                    }  
           });  

        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new AForm();
    }
}

