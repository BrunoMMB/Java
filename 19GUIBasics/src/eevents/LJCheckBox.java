/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eevents;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class LJCheckBox extends JFrame {

    JCheckBox check = new JCheckBox("Checkbox", false);

    public LJCheckBox() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        check.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Checked? " + check.isSelected());
            }
        });

        getContentPane().add(check);
        pack();
        setVisible(true);
    }

    public static void main(String arg[]) {
        new LJCheckBox();
    }
}
