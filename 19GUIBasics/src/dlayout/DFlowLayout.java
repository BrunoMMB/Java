/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlayout;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
FlowLayout

The FlowLayout is used to arrange the components in a line, one after another (in a flow). 
* It is the default layout of applet or panel.
Fields of FlowLayout class:

public static final int LEFT
public static final int RIGHT
public static final int CENTER
public static final int LEADING
public static final int TRAILING
Constructors of FlowLayout class:

FlowLayout(): creates a flow layout with centered alignment and a default 5 unit horizontal and vertical gap.
FlowLayout(int align): creates a flow layout with the given alignment and a default 5 unit horizontal and vertical gap.
FlowLayout(int align, int hgap, int vgap): creates a flow layout with the given alignment and the given horizontal and vertical gap.
 */
public class DFlowLayout {

    JFrame f;

    DFlowLayout() {
        f = new JFrame();

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        f.setLayout(new FlowLayout(FlowLayout.RIGHT));
        //f.setLayout(new FlowLayout(FlowLayout.LEFT));
    //setting flow layout of right alignment  

        f.setSize(300, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new DFlowLayout();
    }
}
