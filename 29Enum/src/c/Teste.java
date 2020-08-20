/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

/**
 *
 * @author EDYA
 */
public class Teste {

    public static void main(String[] args) {
        escolhe(TipoPessoa.FUNCIONARIO);
        escolhe(TipoPessoa.MORADOR);
        escolhe(TipoPessoa.SINDICO);
        
        Pessoa p = new Pessoa();
        p.setTipo(TipoPessoa.SINDICO);
        escolhe(p.getTipo());
    }
    private static void escolhe(TipoPessoa tipoPessoa) {
        if (tipoPessoa.getNome().equals("PAULA")) {
            System.out.println("Abrindo nova janela");
        } else if (tipoPessoa.getNome().equals("MARIA")) {
            System.out.println("Soma");
        } else if (tipoPessoa.getNome().equals("PLINIO")) {
            System.out.println("Subtração");
        }
        if (tipoPessoa == TipoPessoa.FUNCIONARIO) {

        }
        for (TipoPessoa p :TipoPessoa.values() ) {
            System.out.println(p.getNome());
        }
        
    }
}
