/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eevents;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MJComboBox {

    public static void main(String[] argv) throws Exception {
        JFrame f = new JFrame();
        
        f.setSize(300, 200);
        String[] items = {"item1", "item2"};
        JComboBox cb = new JComboBox(items);
        cb.setEditable(true);
        f.add(cb);

        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        f.setLayout(fl);

        MyItemListener actionListener = new MyItemListener();
        cb.addItemListener(actionListener);
        f.setVisible(true);
    }
}

class MyItemListener implements ItemListener {

    // This method is called only if a new item has been selected.

    public void itemStateChanged(ItemEvent evt) {
        JComboBox cb = (JComboBox) evt.getSource();

        Object item = evt.getItem();

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            System.out.println("SELECTED: " + item + " | INDEX: " + cb.getSelectedIndex());
        } else if (evt.getStateChange() == ItemEvent.DESELECTED) {
            System.out.println("DESELECTED: " + item + " | INDEX: " + cb.getSelectedIndex());
        }
    }
}
