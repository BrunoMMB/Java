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
public class GJOptionPaneOptions {

    public static void main(String[] args) {

        String opcoes[] = new String[]{"Cadastrar", "Excluir", "Alterar", 
            "Listar", "Sair"};
        int r = JOptionPane.showOptionDialog(null,
                "Qual a opção desejada?",
                "Pergunta",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                opcoes, "Cadastrar");

        JOptionPane.showMessageDialog(null, "Opção escolhida: " + opcoes[r]);

    }
}
