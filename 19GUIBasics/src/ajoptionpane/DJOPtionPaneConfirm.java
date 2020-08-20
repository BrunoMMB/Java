/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajoptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author EDYA
 */
public class DJOPtionPaneConfirm {

    public DJOPtionPaneConfirm() {

        int resposta;
        resposta = JOptionPane.showConfirmDialog(null, "Pergunta ?", "Titulo",
                JOptionPane.NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "YES_OPTION");
        } else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "NO_OPTION");
        } else if (resposta == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, "CLOSED_OPTION");
        }

    }

    public static void main(String[] args) {
        new DJOPtionPaneConfirm();
    }
}
