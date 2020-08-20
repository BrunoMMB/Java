/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabstractlistmodel;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.Enumeration;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ToolTipManager;

/**
 *
 * @author EDUARDO A SILVESTRE
 */
public class MainClass extends JList{

  SortedListModel model;

    Properties tipProps;

  public MainClass(Properties props) {
    model = new SortedListModel();
    setModel(model);
    ToolTipManager.sharedInstance().registerComponent(this);

    tipProps = props;
    addProperties(props);
  }

  private void addProperties(Properties props) {
    Enumeration names = props.propertyNames();
    while (names.hasMoreElements()) {
      model.add(names.nextElement());
    }
  }

  public String getToolTipText(MouseEvent event) {
    Point p = event.getPoint();
    int location = locationToIndex(p);
    String key = (String) model.getElementAt(location);
    String tip = tipProps.getProperty(key);
    return tip;
  }

  public static void main(String args[]) {
      JFrame frame = new JFrame("Custom Tip Demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Properties props = System.getProperties();
    MainClass list = new MainClass(props);
      JScrollPane scrollPane = new JScrollPane(list);
    frame.add(scrollPane);
    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}
