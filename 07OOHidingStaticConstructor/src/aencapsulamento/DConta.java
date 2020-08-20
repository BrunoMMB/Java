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
public class DConta {
     private double saldo;
     private double limite;
     private DCliente titular;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public DCliente getTitular() {
        return titular;
    }

    public void setTitular(DCliente titular) {
        this.titular = titular;
    }
}
