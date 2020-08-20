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
public class EExercicio {

    public EExercicio() {
        String valor = null;
        do {
            valor = getOpcao();
            
            //if (valor.equals("VALOR")) {
            if ("SOMA".equals(valor)) {
                double r = soma();
                JOptionPane.showMessageDialog(null, "Soma e:" + r);
            } else if ("SUBTRACAO".equals(valor)) {
                double r = subtracao();
            } else if ("DIVISAO".equals(valor)) {
                double r = divisao();
            } else if ("MULTIPLICACAO".equals(valor)) {
                double r = multiplicacao();
            }
            
        } while (!"SAIR".equals(valor));

    }

    public static void main(String[] args) {
        new EExercicio();
    }

    public String getOpcao() {
        String valores[] = new String[5];
        valores[0] = "SOMA";
        valores[1] = "SUBTRACAO";
        valores[2] = "DIVISAO";
        valores[3] = "MULTIPLICACAO";
        valores[4] = "SAIR";
        String valor = (String) JOptionPane.showInputDialog(null, "Digite alguma coisa", "Título da janela", JOptionPane.QUESTION_MESSAGE,
                null, valores, valores[0]);
        JOptionPane.showMessageDialog(null, valor);

        return valor;
    }

    private double soma() {
        double v1 = this.getValorUsuario();
        double v2= this.getValorUsuario();
        
        return (v1 + v2);
    }

    private double subtracao() {
        return 0;
    }

    private double divisao() {
        return 0;
    }

    private double multiplicacao() {
        return 0;
    }
    
    public double getValorUsuario() {
    
        String valor = JOptionPane.showInputDialog("Digite o valor desejado: ");
        return Double.parseDouble(valor);
    }
}
