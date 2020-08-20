package adefaultlistmodel;

import javax.swing.DefaultListModel;

@SuppressWarnings("serial")
public class FramePrincipal extends javax.swing.JFrame {

    private final DefaultListModel<String> modelo1;
    private final DefaultListModel<String> modelo2;

    /**
     * Creates new 
     * form FramePrincipal
     */
    public FramePrincipal() {

        initComponents();

        modelo1 = (DefaultListModel<String>) jList1.getModel();
        modelo2 = (DefaultListModel<String>) jList2.getModel();
        modelo1.addElement("Opção 1.1");
        modelo1.addElement("Opção 1.2");
        modelo1.addElement("Opção 1.3");
        modelo1.addElement("Opção 1.4");
        jList1.setSelectedIndex(0);
        modelo2.addElement("Opção 2.1");
        modelo2.addElement("Opção 2.2");
        modelo2.addElement("Opção 2.3");
        modelo2.addElement("Opção 2.4");
        jList2.setSelectedIndex(0);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelEntrada1 = new javax.swing.JLabel();
        jLabelEntrada2 = new javax.swing.JLabel();
        jTextFieldEntrada1 = new javax.swing.JTextField();
        jTextFieldEntrada2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButtonInserir1 = new javax.swing.JButton();
        jButtonInserir2 = new javax.swing.JButton();
        jButtonSubir1 = new javax.swing.JButton();
        jButtonDescer1 = new javax.swing.JButton();
        jButtonSubir2 = new javax.swing.JButton();
        jButtonDescer2 = new javax.swing.JButton();
        jButtonMoverUmDireita = new javax.swing.JButton();
        jButtonMoverTodosDireita = new javax.swing.JButton();
        jButtonMoverUmEsquerda = new javax.swing.JButton();
        jButtonMoverTodosEsquerda = new javax.swing.JButton();
        jButtonRemover1 = new javax.swing.JButton();
        jButtonRemover2 = new javax.swing.JButton();
        jLabelIndice1 = new javax.swing.JLabel();
        jLabelIndice2 = new javax.swing.JLabel();
        jTextFieldIndice1 = new javax.swing.JTextField();
        jTextFieldIndice2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelValor2 = new javax.swing.JLabel();
        jTextFieldValor1 = new javax.swing.JTextField();
        jTextFieldValor2 = new javax.swing.JTextField();
        jLabelTamanho1 = new javax.swing.JLabel();
        jLabelTamanho2 = new javax.swing.JLabel();
        jTextFieldTamanho1 = new javax.swing.JTextField();
        jTextFieldTamanho2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prática sobre JList");
        setResizable(false);

        jLabelEntrada1.setText("Entrada:");

        jLabelEntrada2.setText("Entrada:");

        jList1.setModel(new DefaultListModel<String>());
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setModel(new DefaultListModel<String>());
        jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList2ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jButtonInserir1.setText("Inserir");
        jButtonInserir1.setToolTipText("Insere o valor do campo Entrada na lista");
        jButtonInserir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserir1ActionPerformed(evt);
            }
        });

        jButtonInserir2.setText("Inserir");
        jButtonInserir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserir2ActionPerformed(evt);
            }
        });

        jButtonSubir1.setText("Subir");
        jButtonSubir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubir1ActionPerformed(evt);
            }
        });

        jButtonDescer1.setText("Descer");
        jButtonDescer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDescer1ActionPerformed(evt);
            }
        });

        jButtonSubir2.setText("Subir");
        jButtonSubir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubir2ActionPerformed(evt);
            }
        });

        jButtonDescer2.setText("Descer");
        jButtonDescer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDescer2ActionPerformed(evt);
            }
        });

        jButtonMoverUmDireita.setText("==>");
        jButtonMoverUmDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMoverUmDireitaActionPerformed(evt);
            }
        });

        jButtonMoverTodosDireita.setText("==>>>");
        jButtonMoverTodosDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMoverTodosDireitaActionPerformed(evt);
            }
        });

        jButtonMoverUmEsquerda.setText("<==");
        jButtonMoverUmEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMoverUmEsquerdaActionPerformed(evt);
            }
        });

        jButtonMoverTodosEsquerda.setText("<<<==");
        jButtonMoverTodosEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMoverTodosEsquerdaActionPerformed(evt);
            }
        });

        jButtonRemover1.setText("Remover Selecionado");
        jButtonRemover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemover1ActionPerformed(evt);
            }
        });

        jButtonRemover2.setText("Remover Selecionado");
        jButtonRemover2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemover2ActionPerformed(evt);
            }
        });

        jLabelIndice1.setText("Índice:");

        jLabelIndice2.setText("Índice:");

        jLabel1.setText("Valor:");

        jLabelValor2.setText("Valor:");

        jLabelTamanho1.setText("Nro Elementos:");

        jLabelTamanho2.setText("Nro Elementos:");

        jButton1.setText("Remover Todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Remover Todos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelEntrada1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jButtonInserir1)))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonSubir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonDescer1)))
                            .addComponent(jButtonRemover1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelIndice1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelTamanho1, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldIndice1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldTamanho1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jButton1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabelEntrada2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEntrada2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jButtonInserir2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonMoverTodosDireita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonMoverTodosEsquerda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonMoverUmDireita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonMoverUmEsquerda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonSubir2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonDescer2)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelIndice2)
                                        .addComponent(jLabelTamanho2)
                                        .addComponent(jLabelValor2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldTamanho2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldIndice2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButton2)
                                    .addGap(40, 40, 40)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButtonRemover2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEntrada1)
                            .addComponent(jTextFieldEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEntrada2)
                            .addComponent(jTextFieldEntrada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonInserir1)
                            .addComponent(jButtonInserir2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButtonSubir1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonDescer1)
                                        .addGap(46, 46, 46)))
                                .addComponent(jButtonRemover1)
                                .addGap(6, 6, 6)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelIndice1)
                                    .addComponent(jTextFieldIndice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextFieldValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelTamanho1)
                                    .addComponent(jTextFieldTamanho1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonRemover2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldIndice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelIndice2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelValor2)
                                    .addComponent(jTextFieldValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelTamanho2)
                                    .addComponent(jTextFieldTamanho2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jButtonSubir2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDescer2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButtonMoverUmDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMoverTodosDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMoverUmEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMoverTodosEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


private void jButtonInserir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserir1ActionPerformed
    if (!jTextFieldEntrada1.getText().isEmpty()) {
        modelo1.addElement(jTextFieldEntrada1.getText());
        atualizarCamposJList1();
    }
}//GEN-LAST:event_jButtonInserir1ActionPerformed


private void jButtonInserir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserir2ActionPerformed
    if (!jTextFieldEntrada2.getText().isEmpty()) {
        modelo2.addElement(jTextFieldEntrada2.getText());
        atualizarCamposJList2();
    }
}//GEN-LAST:event_jButtonInserir2ActionPerformed

private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
    atualizarCamposJList1();
}//GEN-LAST:event_jList1ValueChanged

private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList2ValueChanged
    atualizarCamposJList2();
}//GEN-LAST:event_jList2ValueChanged

private void jButtonRemover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemover1ActionPerformed
    int indice = jList1.getSelectedIndex();
    if (indice != -1) {
        modelo1.remove(indice);
        jList1.setSelectedIndex(0);
        //modelo1.removeElement(jList1.getSelectedValue());
    }
}//GEN-LAST:event_jButtonRemover1ActionPerformed


private void jButtonRemover2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemover2ActionPerformed
    int indice = jList2.getSelectedIndex();
    if (indice != -1) {
        modelo2.remove(indice);
        jList2.setSelectedIndex(0);
        //modelo2.removeElement(jList2.getSelectedValue());
    }
}//GEN-LAST:event_jButtonRemover2ActionPerformed


private void jButtonSubir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubir1ActionPerformed
    int indice = jList1.getSelectedIndex();
    if ((indice != -1) && (indice > 0)) {
        String aux = jList1.getSelectedValue();
        modelo1.remove(indice);
        modelo1.add(indice - 1, aux);
        jList1.setSelectedIndex(indice - 1);
    }
}//GEN-LAST:event_jButtonSubir1ActionPerformed


private void jButtonSubir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubir2ActionPerformed
    int indice = jList2.getSelectedIndex();
    if ((indice != -1) && (indice > 0)) {
        String aux = jList2.getSelectedValue();
        modelo2.remove(indice);
        modelo2.add(indice - 1, aux);
        jList2.setSelectedIndex(indice - 1);
    }
}//GEN-LAST:event_jButtonSubir2ActionPerformed


private void jButtonDescer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDescer1ActionPerformed
    int indice = jList1.getSelectedIndex();
    if (indice != -1) {
        int tamanho = modelo1.getSize();
        if (indice < (tamanho - 1)) {
            String aux = jList1.getSelectedValue();
            modelo1.remove(indice);
            modelo1.add(indice + 1, aux);
            jList1.setSelectedIndex(indice + 1);
        }
    }
}//GEN-LAST:event_jButtonDescer1ActionPerformed


private void jButtonDescer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDescer2ActionPerformed
    int indice = jList2.getSelectedIndex();
    if (indice != -1) {
        int tamanho = modelo2.getSize();
        if (indice < (tamanho - 1)) {
            String aux = jList2.getSelectedValue();
            modelo2.remove(indice);
            modelo2.add(indice + 1, aux);
            jList2.setSelectedIndex(indice + 1);
        }
    }
}//GEN-LAST:event_jButtonDescer2ActionPerformed


private void jButtonMoverUmDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMoverUmDireitaActionPerformed
    int indice = jList1.getSelectedIndex();
    if (indice != -1) {
        String aux = jList1.getSelectedValue();
        modelo1.remove(indice);
        modelo2.addElement(aux);
    }
}//GEN-LAST:event_jButtonMoverUmDireitaActionPerformed


private void jButtonMoverUmEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMoverUmEsquerdaActionPerformed
    int indice = jList2.getSelectedIndex();
    if (indice != -1) {
        String aux = jList2.getSelectedValue();
        modelo2.remove(indice);
        modelo1.addElement(aux);
    }
}//GEN-LAST:event_jButtonMoverUmEsquerdaActionPerformed


private void jButtonMoverTodosDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMoverTodosDireitaActionPerformed
    int tamanho = modelo1.getSize();
    String elemento;
    for (int cont = 0; cont < tamanho; cont++) {
        elemento = modelo1.elementAt(cont);
        modelo2.addElement(elemento);
    }
    modelo1.removeAllElements();
}//GEN-LAST:event_jButtonMoverTodosDireitaActionPerformed


private void jButtonMoverTodosEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMoverTodosEsquerdaActionPerformed
    int tamanho = modelo2.getSize();
    String elemento;
    for (int cont = 0; cont < tamanho; cont++) {
        elemento = modelo2.remove(0);
        modelo1.addElement(elemento);
    }
}//GEN-LAST:event_jButtonMoverTodosEsquerdaActionPerformed


private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    modelo1.removeAllElements();
}//GEN-LAST:event_jButton1ActionPerformed


private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    modelo2.removeAllElements();
}//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonDescer1;
    private javax.swing.JButton jButtonDescer2;
    private javax.swing.JButton jButtonInserir1;
    private javax.swing.JButton jButtonInserir2;
    private javax.swing.JButton jButtonMoverTodosDireita;
    private javax.swing.JButton jButtonMoverTodosEsquerda;
    private javax.swing.JButton jButtonMoverUmDireita;
    private javax.swing.JButton jButtonMoverUmEsquerda;
    private javax.swing.JButton jButtonRemover1;
    private javax.swing.JButton jButtonRemover2;
    private javax.swing.JButton jButtonSubir1;
    private javax.swing.JButton jButtonSubir2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEntrada1;
    private javax.swing.JLabel jLabelEntrada2;
    private javax.swing.JLabel jLabelIndice1;
    private javax.swing.JLabel jLabelIndice2;
    private javax.swing.JLabel jLabelTamanho1;
    private javax.swing.JLabel jLabelTamanho2;
    private javax.swing.JLabel jLabelValor2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldEntrada1;
    private javax.swing.JTextField jTextFieldEntrada2;
    private javax.swing.JTextField jTextFieldIndice1;
    private javax.swing.JTextField jTextFieldIndice2;
    private javax.swing.JTextField jTextFieldTamanho1;
    private javax.swing.JTextField jTextFieldTamanho2;
    private javax.swing.JTextField jTextFieldValor1;
    private javax.swing.JTextField jTextFieldValor2;
    // End of variables declaration//GEN-END:variables

    private void atualizarCamposJList1() {
        jTextFieldIndice1.setText(jList1.getSelectedIndex() + "");
        jTextFieldValor1.setText(jList1.getSelectedValue());
        jTextFieldTamanho1.setText(modelo1.getSize() + "");
    }

    private void atualizarCamposJList2() {
        jTextFieldIndice2.setText(jList2.getSelectedIndex() + "");
        jTextFieldValor2.setText(jList2.getSelectedValue());
        jTextFieldTamanho2.setText(modelo2.getSize() + "");
    }
}
