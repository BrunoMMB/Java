/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlayout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
/**
 * http://imasters.com.br/artigo/2463/java/tudo-sobre-o-gridbaglayout/
 * http://javafree.uol.com.br/topic-5792-Tudo-sobre-o-GridBagLayout.html
 * http://www.java2s.com/Code/Java/Swing-JFC/GridBagLayoutwithconstraints.htm
 * https://devsv.wordpress.com/2011/03/22/layout-manager-v-gridbag/
 */
public class FGridBagLayout3 extends JPanel {

    GridBagLayout layout;

    public FGridBagLayout3() {
        initialize();
    }

    private void initialize() {
        layout = new GridBagLayout();
        setLayout(layout);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JButton("Primeiro"), gbc); // coluna 0, linha 0.

        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.gridx = 1;
        gbc2.gridy = 0;
        add(new JButton("Segundo"), gbc2); // coluna 1, linha 0.

        GridBagConstraints gbc3 = new GridBagConstraints();
        gbc3.gridx = 2;
        gbc3.gridy = 0;
        add(new JButton("Terceiro"), gbc3); // coluna 2, linha 0.
    }

}
