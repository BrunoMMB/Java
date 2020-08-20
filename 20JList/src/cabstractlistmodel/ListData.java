/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabstractlistmodel;

import javax.swing.AbstractListModel;

/**
 *
 * @author EDUARDO A SILVESTRE
 */
public class ListData extends AbstractListModel {
  String[] strings = new String[10000];

  public ListData() {
    for (int i = 0; i < 10000; i++) {
      strings[i] = "bob" + i;
    }
  }

  @Override
  public int getSize() {
    return strings.length;
  }

  @Override
  public Object getElementAt(int index) {
    return strings[index];
  }
}
