/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abasicofluxooo;

/**
 *
 * @author Ernani
 */
public class Teste {
    public static void main(String[] args) {
        Time a = new Time();
        a.derrotas = 2;
        a.empates = 3;
        a.vitorias = 4;
        a.nome = "Tabajaras";
        
        Time b = new Time();
        b.derrotas = 2;
        b.empates = 3;
        b.vitorias = 5;
        b.nome = "Ibis";
        
        Campeonato c = new Campeonato();
        c.nome = "Brasileirao";
        c.ano = 2018;
        c.a = a;
        c.b = b;
  
        //int pontuacaoA = a.calculaPontuacao();
        int pontuacaoA = c.a.calculaPontuacao();
        
        int pontuacaoB = c.b.calculaPontuacao();
        if (pontuacaoA > pontuacaoB) {
            System.out.println("Campeao do " + c.nome);
            System.out.println(c.a.nome);
        } else {
            System.out.println("Campeao do " + c.nome);
            System.out.println(c.b.nome);
        
        }
        
    }
}
