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
public enum TipoPessoa {

    SINDICO("MARIA"), MORADOR("PAULA"), FUNCIONARIO("PLINIO");
    private final String nome;

    private TipoPessoa(String nomeVar) {
        this.nome = nomeVar;

    }

    public String getNome() {
        return this.nome;

    }
}
