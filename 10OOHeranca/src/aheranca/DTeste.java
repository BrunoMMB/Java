/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aheranca;

/**
 *
 * @author EDYA
 */
public class DTeste {

    public static void main(String[] args) {
        DEngenheiro dEngenheiro = new DEngenheiro();
        dEngenheiro.setNome("joao");
        dEngenheiro.nome = "joao";
        DSecretario dSecretario = new DSecretario();
        dSecretario.setNome("maria");
        
        System.out.println("Nome do engenheiro: " + dEngenheiro.getNome());
        System.out.println("Nome da secretaria: " + dSecretario.getNome());
    }
}
