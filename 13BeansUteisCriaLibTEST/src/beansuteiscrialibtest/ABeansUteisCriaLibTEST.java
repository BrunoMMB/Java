/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beansuteiscrialibtest;

//TODO descomentar

import beansuteis.Amarok;
import beansuteis.Corvett;



/**
 *
 * @author EDYA
 */
public class ABeansUteisCriaLibTEST extends Object {
//https://netbeans.org/kb/73/java/javase-deploy_pt_BR.html
    /**
     * Código da MAIN
     * Código da MAIN
     * Código da MAIN
     * Código da MAIN
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Amarok amarok = new Amarok();
        amarok.setAno(2000);
        amarok.getValorAgregado();
        
        System.out.println("Ano da amarok " + amarok.getAno());
    }
    /**
     * Este método calcula a soma entre dois números
     * @param a inteiro
     * @param b inteiro
     * @return a soma de dois numeros
     */
    public int soma(int a, int b) {
        return (a+b);
    
    }
    
}
