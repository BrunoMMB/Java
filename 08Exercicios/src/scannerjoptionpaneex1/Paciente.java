/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerjoptionpaneex1;

/**
 *
 * @author Ernani
 */
public class Paciente {
    double peso;
    double altura;
    
    double calculaImc(){
        return peso / (altura * altura);
    
    }

    @Override
    public String toString() {
        return "Paciente não tem toString";
    } 
}
