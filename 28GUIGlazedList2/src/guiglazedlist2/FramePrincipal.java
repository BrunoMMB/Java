package guiglazedlist2;

import ca.odell.glazedlists.EventList;
import ca.odell.glazedlists.GlazedLists;
import ca.odell.glazedlists.SortedList;
import ca.odell.glazedlists.swing.GlazedListsSwing;
import ca.odell.glazedlists.swing.TableComparatorChooser;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FramePrincipal extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;

    private final List<Pessoa> pessoasArrayList;
    private final EventList<Pessoa> pessoasEventList;
    private final SortedList<Pessoa> pessoasOrdenadas;

    public FramePrincipal() {

        pessoasArrayList = new ArrayList<>(10);
        Pessoa p = new Pessoa("Joao", "Seilah 1", "1111", "masculino");
        pessoasArrayList.add(p);
        p = new Pessoa("Joana", "Seilah 2", "2222", "feminino");
        pessoasArrayList.add(p);
        p = new Pessoa("Grosbilda", "Seilah 3", "3333", "feminino");
        pessoasArrayList.add(p);
        p = new Pessoa("Estrobilobaldo", "Seilah 4", "4444", "masculino");
        pessoasArrayList.add(p);
        
        
        pessoasEventList = GlazedLists.eventList(pessoasArrayList);
//        pessoasEventList = new BasicEventList<>();
//        pessoasEventList.addAll(pessoasArrayList);
        
        pessoasOrdenadas = new SortedList<>(pessoasEventList, new PessoaComparator());
        
        initComponents();
        jComboBox1.setSelectedIndex(0);

        // Os campos do objeto devem poder ser transformados em Comparable
        // senao devemos remover o Comparator padrao usando
        // ordenadorTabelaPessoa.getComparatorsForColumn(column).clear()
//        TableComparatorChooser<Pessoa> ordenadorTabelaPessoa = TableComparatorChooser.install(
//                jTable2, pessoasOrdenadas, TableComparatorChooser.MULTIPLE_COLUMN_MOUSE);
//        TableComparatorChooser<Pessoa> ordenadorTabelaPessoa = TableComparatorChooser.install(
//                jTable2, pessoasOrdenadas, TableComparatorChooser.SINGLE_COLUMN);
        //TableComparatorChooser.install(jTable2, pessoasOrdenadas, TableComparatorChooser.SINGLE_COLUMN);
        TableComparatorChooser.install(jTable2, pessoasOrdenadas, TableComparatorChooser.MULTIPLE_COLUMN_MOUSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<Pessoa>();
        jComboBox1 = new javax.swing.JComboBox<Pessoa>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButtonAlteração = new javax.swing.JButton();
        jButtonInsercao = new javax.swing.JButton();
        jButtonRemocao = new javax.swing.JButton();
        jButtonAlteração1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GlazedLists");

        jList1.setModel(GlazedListsSwing.eventListModel(pessoasEventList));
        jScrollPane1.setViewportView(jList1);

        jComboBox1.setModel(GlazedListsSwing.eventComboBoxModel(pessoasEventList));

        jTable1.setModel(GlazedListsSwing.eventTableModel(pessoasEventList, new PessoaTableFormat()));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(GlazedListsSwing.eventTableModel(pessoasOrdenadas, new PessoaTableFormat()));
        jScrollPane3.setViewportView(jTable2);

        jButtonAlteração.setText("Alteração1");
        jButtonAlteração.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlteraçãoActionPerformed(evt);
            }
        });

        jButtonInsercao.setText("Inserção");
        jButtonInsercao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsercaoActionPerformed(evt);
            }
        });

        jButtonRemocao.setText("Remoção");
        jButtonRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemocaoActionPerformed(evt);
            }
        });

        jButtonAlteração1.setText("Alteração2");
        jButtonAlteração1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlteração1ActionPerformed(evt);
            }
        });

        jTable3.setModel(GlazedListsSwing.eventTableModel(pessoasEventList, new PessoaWritebleTableFormat()));
        jScrollPane4.setViewportView(jTable3);

        jToggleButton1.setText("SHOW ALL");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonAlteração1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonInsercao)
                                .addGap(3, 3, 3)
                                .addComponent(jButtonRemocao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAlteração))
                            .addComponent(jScrollPane1)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonInsercao)
                            .addComponent(jButtonRemocao)
                            .addComponent(jButtonAlteração))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlteração1))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton1)
                        .addGap(21, 21, 21))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAlteraçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlteraçãoActionPerformed
        Pessoa p = (Pessoa) jComboBox1.getSelectedItem();
        p.setNome("Zirgonisvaldo");
    }//GEN-LAST:event_jButtonAlteraçãoActionPerformed

    private void jButtonInsercaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsercaoActionPerformed
        Pessoa p = new Pessoa("Juquinha", "Seilah Mano, 123", "234234234234", "masculino");
        pessoasEventList.add(p);
    }//GEN-LAST:event_jButtonInsercaoActionPerformed

    private void jButtonRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemocaoActionPerformed
        Pessoa p = (Pessoa) jComboBox1.getSelectedItem();
        pessoasEventList.remove(p);
        jComboBox1.setSelectedIndex(0);  //Por algum motivo a interface nao atualiza
                                         //o elemento selecionado mesmo que ele nao exista mais na lista
    }//GEN-LAST:event_jButtonRemocaoActionPerformed

    private void jButtonAlteração1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlteração1ActionPerformed
        Pessoa p = (Pessoa) jComboBox1.getSelectedItem();
        int posicao = jComboBox1.getSelectedIndex();
        p.setNome("Zirgonisvaldomiro");
        pessoasEventList.set(posicao, p);
    }//GEN-LAST:event_jButtonAlteração1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        int tamanho = pessoasEventList.size();
        StringBuilder builder = new StringBuilder();
        builder.append("Dados que estão na tela:\n\n");
        for (int i = 0; i < tamanho; i++) {
             builder.append(pessoasEventList.get(i).toString()).append("\n");
            
        }
        JOptionPane.showMessageDialog(rootPane,builder.toString());
        
        StringBuilder builder1 = new StringBuilder();
        for (Pessoa pessoasArrayList1 : pessoasArrayList) {
            builder1.append(pessoasArrayList1.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(rootPane,builder1.toString());
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
        
        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(() -> {
            new FramePrincipal().setVisible(true);
        });*/
        new FramePrincipal().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlteração;
    private javax.swing.JButton jButtonAlteração1;
    private javax.swing.JButton jButtonInsercao;
    private javax.swing.JButton jButtonRemocao;
    private javax.swing.JComboBox<Pessoa> jComboBox1;
    private javax.swing.JList<Pessoa> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}