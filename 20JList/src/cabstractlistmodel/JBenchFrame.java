/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabstractlistmodel;

/**
 *
 * @author EDUARDO A SILVESTRE
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class JBenchFrame extends JFrame {
  BorderLayout borderLayout1 = new BorderLayout();
  JList list1 = new JList();
  JButton fillButton = new JButton();

  public static void main(String[] args) {
    JBenchFrame bm = new JBenchFrame();
  }

  public JBenchFrame() {
    this.getContentPane().setLayout(borderLayout1);
    this.setSize(new Dimension(400, 300));
    fillButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        ListData ld = new ListData();
        long tmStart = System.currentTimeMillis();
        list1.setModel(ld);
        list1.repaint();
        long tmEnd = System.currentTimeMillis();
        System.out.println(tmEnd - tmStart);

      }
    });
    fillButton.setText("Fill");
    this.getContentPane().add(new JScrollPane(list1), BorderLayout.CENTER);
    this.getContentPane().add(fillButton, BorderLayout.SOUTH);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setVisible(true);
  }

}
