/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlayout;

import java.awt.EventQueue;
import javax.swing.JFrame;
/**
 * http://imasters.com.br/artigo/2463/java/tudo-sobre-o-gridbaglayout/
 * http://javafree.uol.com.br/topic-5792-Tudo-sobre-o-GridBagLayout.html
 * http://www.java2s.com/Code/Java/Swing-JFC/GridBagLayoutwithconstraints.htm
 * https://devsv.wordpress.com/2011/03/22/layout-manager-v-gridbag/
 */
public class FGridBagLayout3Aux extends JFrame {

    public FGridBagLayout3Aux() {
        super("GridBagLayoutTest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(new FGridBagLayout3());
        pack();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FGridBagLayout3Aux().setVisible(true);
            }
        });
    }

}
