package ajoptionpane;

import javax.swing.JOptionPane;

public class FMensagemInputConfirmacoes {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Mensagem");
        JOptionPane.showMessageDialog(null, "Mensagem", "Titulo", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensagem", "Titulo", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensagem", "Titulo", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensagem", "Titulo", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensagem", "Titulo", JOptionPane.ERROR_MESSAGE);
        

        String valor;
        valor = JOptionPane.showInputDialog("Digite alguma coisa");
        JOptionPane.showMessageDialog(null, valor);

        valor = JOptionPane.showInputDialog("Digite alguma coisa", "Valor Inicial");
        JOptionPane.showMessageDialog(null, valor);

        valor = JOptionPane.showInputDialog(null, "Digite alguma coisa", "Título da janela", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, valor);
        
        String valores[] = new String[5];
        valores[0] = "Opcao 1";
        valores[1] = "Opcao 2";
        valores[2] = "Opcao 3";
        valores[3] = "Opcao 4";
        valores[4] = "Opcao 5";       
        valor = (String) JOptionPane.showInputDialog(null, "Digite alguma coisa", "Título da janela", JOptionPane.QUESTION_MESSAGE,
                null, valores, valores[0]);
        JOptionPane.showMessageDialog(null, valor);

        int resposta;
        resposta = JOptionPane.showConfirmDialog(null, "Pergunta ?");
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "YES_OPTION");
        } else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "NO_OPTION");
        } else if (resposta == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "CANCEL_OPTION");
        } else if (resposta == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, "CLOSED_OPTION");
        }

        resposta = JOptionPane.showConfirmDialog(null, "Pergunta ?", "Titulo", JOptionPane.OK_CANCEL_OPTION);
        if (resposta == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(null, "OK_OPTION");
        } else if (resposta == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "CANCEL_OPTION");
        } else if (resposta == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, "CLOSED_OPTION");
        }

        resposta = JOptionPane.showConfirmDialog(null, "Pergunta ?", "Titulo", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "YES_OPTION");
        } else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "NO_OPTION");
        } else if (resposta == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, "CLOSED_OPTION");
        }

    }
}
