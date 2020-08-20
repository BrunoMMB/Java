/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csimulacaodaoarray;

/**
 *
 * @author EDYA
 */
public class FilmeDAO {
    private Filme [] filmes = null;
    int contador = 0;
    
    //exemplo utilizacao construtor
    public FilmeDAO() {
         filmes = new Filme[20];
    }
    
    
            
    public int inserir(Filme filme) {
        int proximaPosicaoLivre = this.proximaPosicaoLivre();
        
        if (proximaPosicaoLivre != -1) {
            filmes[proximaPosicaoLivre] = filme;
        } else {
            System.out.println("aRRAY CHEIO");
        }
        return 0;
    }
    
    public void mostrar() {
        for (Filme filme : filmes) {
            if (filme != null) {
                System.out.println("dados do filme");
            }
            
        }
        System.out.println("imprindo filme: " + filmes[0].toString());
    }
    
    int alterar(Filme filme) {
        return 0;
    }
    
    int excluir(Filme filme) {
        return 0;
    }
    
    private int proximaPosicaoLivre() {
        for (int i = 0; i < this.filmes.length; i++) {
            if (this.filmes[i] == null) {
                return i;

            }
        }
        return -1;
    }
}
