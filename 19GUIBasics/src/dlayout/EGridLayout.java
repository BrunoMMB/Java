/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlayout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * https://www.javatpoint.com/GridLayout
 * GridLayout
 *
 * The GridLayout is used to arrange the components in rectangular grid. One
 * component is displayed in each rectangle. Constructors of GridLayout class:
 *
 * GridLayout(): creates a grid layout with one column per component in a row.
 * GridLayout(int rows, int columns): creates a grid layout with the given rows
 * and columns but no gaps between the components. GridLayout(int rows, int
 * columns, int hgap, int vgap): creates a grid layout with the given rows and
 * columns alongwith given horizontal and vertical gaps.
 */
public class EGridLayout {

    JFrame f;

    EGridLayout() {
        f = new JFrame();

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);

        f.setLayout(new GridLayout(3, 3));
        //f.setLayout(new GridLayout());
    //setting grid layout of 3 rows and 3 columns  

        f.setSize(300, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new EGridLayout();
    }
}
