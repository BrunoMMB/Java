/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model;

/**
 *
 * @author EDYA
 */
public class UsuarioDAO {

    Usuario[] usuarios = new Usuario[10];
    Filme[] filmes = new Filme[10];

    public UsuarioDAO() {
        Usuario chair = new Usuario();
        chair.setTipo("CHAIR");
        this.inserir(chair);

        Usuario eu = new Usuario();
        eu.setTipo("USUARIO");
        this.inserir(eu);

    }

    public int inserir(Usuario f) {
        return 0;
    }

    private int proximaPosicaoLivre() {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void listar() {
        for (int i = 0; i < filmes.length; i++) {
            if (filmes[i] != null) {
                System.out.println(filmes[i]);
            }
        }
    }

    public boolean delete(Filme f) {
        for (int i = 0; i < filmes.length; i++) {
            if (filmes[i] != null && filmes[i].getId() == f.getId()) {
                filmes[i] = null;
                return true;

            }
        }
        return false;
    }

    public boolean update(Filme f) {
        return false;
    }
}
