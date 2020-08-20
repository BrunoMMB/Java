/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bconstrutores;

/**
 *
 * @author EDYA
 */
public class ATeste1 {
    public static void main(String[] args) {
        AConta conta1 = new AConta();
        conta1.deposita(2000);
        System.out.println("Saldo da conta1: " + conta1.getSaldo() + "\n");
    }
}
