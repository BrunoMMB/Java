/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author EDYA
 */
public class Capitulo2 {

    public static void main(String... args) {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        for (Usuario u : usuarios) {
            System.out.println(u.getNome());
        }

        /////////////////////////////////////////////////////////////////////    
        Mostrador mostrador = new Mostrador();
        usuarios.forEach(mostrador);
        /////////////////////////////////////////////////////////////////////
        Consumer<Usuario> mostrador1 = new Consumer<Usuario>() {
            public void accept(Usuario u) {
                System.out.println(u.getNome());
            }
        };
        usuarios.forEach(mostrador1);
        /////////////////////////////////////////////////////////////////////  
        usuarios.forEach(new Consumer<Usuario>() {
            public void accept(Usuario u) {
                System.out.println(u.getNome());
            }
        });
        /////////////////////////////////////////////////////////////////////
        System.out.println("teste1");
        Consumer<Usuario> mostrador2 = (Usuario u) -> {System.out.println(u.getNome());};
        usuarios.forEach(mostrador2);
        System.out.println("teste2");
        ///////////////////////////////////////////////////////////////////// 
        Consumer<Usuario> mostrador3 = u -> {System.out.println(u.getNome());};
        /////////////////////////////////////////////////////////////////////    
        Consumer<Usuario> mostrador4 = u -> System.out.println(u.getNome());
        /////////////////////////////////////////////////////////////////////    
        usuarios.forEach(u -> System.out.println(u.getNome()));
        /////////////////////////////////////////////////////////////////////    
        /////////////////////////////////////////////////////////////////////    
        /////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////    
        usuarios.forEach(u -> System.out.println(u.getNome()));
        /////////////////////////////////////////////////////////////////////    
        usuarios.stream().forEach((u) -> {
            System.out.println(u.getNome());
        });
    }
}
