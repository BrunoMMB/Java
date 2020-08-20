/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

/**
 *
 * @author EDYA
 */
public class NewClass {

    Validador<String> validadorCEP = new Validador<String>() {
        public boolean valida(String valor) {
            return valor.matches("[0-9]{5}-[0-9]{3}");
        }
    };

    Validador<String> validadorCEP1
            = valor -> {
                return valor.matches("[0-9]{5}-[0-9]{3}");
            };
}
