/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aencapsulamento;

/**
 *
 * @author EDYA
 */
public class DTeste {
    public static void main(String[] args) {
        DConta conta  = new DConta();
        conta.setSaldo(2000);
        conta.setLimite(1000);
        
        DCliente cliente = new DCliente();
        cliente.setNome("Gabriela");
        
        conta.setTitular(cliente);
        conta.getTitular().setCpf("2343434");
        
        System.out.println("Saldo da conta: " + conta.getSaldo());
        System.out.println("Titular da conta: " + conta.getTitular().getNome());
        
        //PROBLEMA !
        //Faz sentido ter setSaldo() ?
        
    }
}
