/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.control;

import mvc.model.Filme;
import mvc.model.FilmeDAORAM;
import mvc.model.Usuario;
import mvc.model.UsuarioDAO;
import mvc.view.GUI;





/**
 *
 * @author EDYA
 */
public class SSA {
    
    Usuario [] usuario = new Usuario[10];
    UsuarioDAO dao = new UsuarioDAO();
    GUI gui = new GUI();
    FilmeDAORAM filmeDAORAM = new FilmeDAORAM();
    public SSA() {
        //preencher as informações do usuário
        
        do  {
            int opcaoUsuario = gui.menuBoasVindas();
            
            switch(opcaoUsuario) {
                case 0:
                    Filme f = gui.criaFilme();
                    int resultado = filmeDAORAM.inserir(f);
                    if (resultado == -1) {
                    } else {
                        
                    }
                    
                    break;
                default: break;
            }
        } while (true);
        //dao.inserir(null);
    }
    public static void main(String[] args) {
        new SSA();
    }
    
}
