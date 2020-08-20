/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eevents;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class HItemListener {

    public static void main(String args[]) {

        JFrame jFrame = new JFrame();

        Container cPane = jFrame.getContentPane();

        ItemListener itemListener = new ItemListener() {

            @Override

            public void itemStateChanged(ItemEvent event) {

                System.out.println("Source: " + getName(event.getSource()));

                System.out.println("Item: " + getName(event.getItem()));

                int state = event.getStateChange();

                System.out.println("State: "
                        + ((state == ItemEvent.SELECTED) ? "Selected\n"
                                : "Deselected\n"));
                

            }

            private String getName(Object o) {

                if (o instanceof JComponent) {

                    JComponent jComponent = (JComponent) o;

                    return jComponent.getName();

                } else {

                    return o.toString();

                }

            }

        };

        JPanel jPanel = new JPanel(new GridLayout(0, 1));

        ButtonGroup buttonGroup = new ButtonGroup();

        JRadioButton option = new JRadioButton("Option 1", true);

        option.setName(option.getText());

        option.addItemListener(itemListener);

        buttonGroup.add(option);

        jPanel.add(option);

        option = new JRadioButton("Option 2", false);

        option.setName(option.getText());

        option.addItemListener(itemListener);

        buttonGroup.add(option);

        jPanel.add(option);

        option = new JRadioButton("Option 3", false);

        option.setName(option.getText());

        option.addItemListener(itemListener);

        buttonGroup.add(option);

        jPanel.add(option);

        cPane.add(jPanel, BorderLayout.NORTH);

        String itemArray[] = {"Item 1", "Item 2", "Item 3"};

        JComboBox combobox = new JComboBox(itemArray);

        combobox.setName("Combo");

        combobox.addItemListener(itemListener);

        combobox.setMaximumRowCount(4);

        cPane.add(combobox, BorderLayout.SOUTH);

        jFrame.pack();

        jFrame.setVisible(true);
    }
}
