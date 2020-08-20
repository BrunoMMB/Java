/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgabaritoatividadepresencialUAB;

import java.math.BigDecimal;

/**
 *
 * @author EDYA
 */
public class FilmeDAO {
    private Filme [] filmes  = new Filme[20];
    long contador = 1;
    
    public FilmeDAO() {
         Filme f1 = new Filme("The Punisher", 10.0);
         f1.setId(10);
         inserir(f1);
         
         Filme f2 = new Filme("Titani", 5.0);
         f2.setId(11);
         inserir(f2);
         
    }
    public Filme buscarFilmePorTitulo(String titulo) {
        for (int i = 0; i < this.filmes.length; i++) {
            if (filmes[i] != null && filmes[i].getTitulo().equals(titulo)) {
                return filmes[i];
            }
        }
    
        return null;
    }
    
    
    int inserir(Filme filme) {
        int proximaPosicaoLivre = this.proximaPosicaoLivre();
        if (proximaPosicaoLivre != -1) {
            filme.setId(contador++);
            filmes[proximaPosicaoLivre] = filme;
        } else {
            System.out.println("Array Cheio");
        }
        return 0;
    }
    
    void listar() {
        System.out.println("Dados do filme");
        for (Filme filme : filmes) {
            if (filme != null) {
                System.out.println(filme);
            }
        }
        
    }
    
    int alterar(Filme filme) {
        for (int i = 0; i < this.filmes.length; i++) {
            if (this.filmes[i].getId() == filme.getId()) { //filme encontrado
                this.filmes[i].setTitulo(filme.getTitulo());
                return (int)filme.getId();
            }
        }
        return -1;
    }
    
    int excluir(Filme filme) {
       
       int posicao = -1;
        for (int i = 0; i < this.filmes.length; i++) {
            if (this.filmes[i].getId() == filme.getId()) { //filme encontrado
                posicao = i;
                break;
            }
        }
        if (posicao != -1) {
            this.filmes[posicao] = null;
            return posicao;
        } else {
            return -1;
        }
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
