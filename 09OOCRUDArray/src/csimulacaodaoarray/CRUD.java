/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csimulacaodaoarray;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author EDYA
 */
public class CRUD {
    
    public CRUD() {
        FilmeDAO dao = new FilmeDAO();
        
        Filme f = new Filme(0, "Crepusculo", LocalDate.of(2008, Month.MARCH, 24), BigDecimal.TEN);
        dao.inserir(f);
        dao.mostrar();
    }
    
    public static void main(String args[]) {
        new CRUD();
    }
}
