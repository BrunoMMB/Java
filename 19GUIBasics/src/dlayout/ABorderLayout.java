/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlayout;

/**
https://www.javatpoint.com/java-layout-manager
https://www.javatpoint.com/java-layout-manager

LayoutManagers:

The LayoutManagers are used to arrange components in a particular manner. 
* LayoutManager is an interface that is
* implemented by all the classes of layout managers. There are following 
* classes that represents the layout managers:

java.awt.BorderLayout
java.awt.FlowLayout
java.awt.GridLayout
java.awt.CardLayout
java.awt.GridBagLayout
javax.swing.BoxLayout
javax.swing.GroupLayout
javax.swing.ScrollPaneLayout
javax.swing.SpringLayout etc.
* 
BorderLayout:

The BorderLayout is used to arrange the components in five regions: north, south, east, west and center. 
* Each region (area) may contain one component only. It is the default layout of frame or window. 
* The BorderLayout provides five constants for each region:

public static final int NORTH
public static final int SOUTH
public static final int EAST
public static final int WEST
public static final int CENTER
Constructors of BorderLayout class:

BorderLayout(): creates a border layout but with no gaps between the components.
JBorderLayout(int hgap, int vgap): creates a border layout with the given horizontal and vertical gaps between the components.

 */
import java.awt.*;
import javax.swing.*;

public class ABorderLayout {

    JFrame f;

    ABorderLayout() {
        f = new JFrame();

        JButton b1 = new JButton("NORTH");
        JButton b2 = new JButton("SOUTH");
        JButton b3 = new JButton("EAST");
        JButton b4 = new JButton("WEST");
        JButton b5 = new JButton("CENTER");

        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.SOUTH);
        f.add(b3, BorderLayout.EAST);
        f.add(b4, BorderLayout.WEST);
        f.add(b5, BorderLayout.CENTER);

        f.setSize(300, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ABorderLayout();
    }
}
