/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlayout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
Falamos dos frames, e associamos com molduras.
Então, não é muito difícil adivinhar que o panel é como se fosse a foto, o conteúdo das molduras.
A tradução de panel é bem óbvia: painel.

E é exatamente isso que é (como sempre) um JPanel, um painel.
Este painel vai ser encaixado no molde, no JFrame, e é ele que vai contar os componentes gráficos de nossos programas.

Esses componentes, em Java, são os JComponents, e são muitos!
Podem ser botões, caixas de seleção para você marcar, um bloco de texto para ler (iguais aqueles de "Aceito os termos e condições"), campos de texto para você escrever (para inserir login e senha, por exemplo), imagens e simplesmente tudo que é possível fazer em programação gráfica.

E assim como podemos colocar uma foto em uma moldura, tirar e colocar outra, também podemos colocar um JPanel em um frame, fazer a interação com o usuário, depois colocar outro JPanel lá, ou mandar esse JPanel para outro JFrame, e por ai vai, dependendo do objetivo de sua aplicação.

 */
public class JJPanel {

    public JJPanel() {
        JFrame f = new JFrame();
        f.setVisible(true); //CUIDADO
        f.setSize(800, 600);
        //f.setResizable(false);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();

        f.add(p1, BorderLayout.NORTH);
        f.add(p2, BorderLayout.SOUTH);
        f.add(p3, BorderLayout.EAST);
        f.add(p4, BorderLayout.WEST);
        f.add(p5, BorderLayout.CENTER);

        JButton n1 = new JButton("NORTH");
        JButton n2 = new JButton("SOUTH");
        JButton n3 = new JButton("EAST");
        JButton n4 = new JButton("WEST");
        JButton n5 = new JButton("CENTER");

        JButton s1 = new JButton("NORTH");
        JButton s2 = new JButton("SOUTH");
        JButton s3 = new JButton("EAST");
        JButton s4 = new JButton("WEST");
        JButton s5 = new JButton("CENTER");

        JButton e1 = new JButton("NORTH");
        JButton e2 = new JButton("SOUTH");
        JButton e3 = new JButton("EAST");
        JButton e4 = new JButton("WEST");
        JButton e5 = new JButton("CENTER");

        JButton w1 = new JButton("NORTH");
        JButton w2 = new JButton("SOUTH");
        JButton w3 = new JButton("EAST");
        JButton w4 = new JButton("WEST");
        JButton w5 = new JButton("CENTER");

        JButton c1 = new JButton("NORTH");
        JButton c2 = new JButton("SOUTH");
        JButton c3 = new JButton("EAST");
        JButton c4 = new JButton("WEST");
        JButton c5 = new JButton("CENTER");

        p1.add(n1);
        p1.add(n2);
        p1.add(n3);
        p1.add(n4);
        p1.add(n5);

        p2.add(s1);
        p2.add(s2);
        p2.add(s3);
        p2.add(s4);
        p2.add(s5);

        p3.add(e1);
        p3.add(e2);
        p3.add(e3);
        p3.add(e4);
        p3.add(e5);

        p4.add(w1);
        p4.add(w2);
        p4.add(w3);
        p4.add(w4);
        p4.add(w5);

        p5.add(c1);
        p5.add(c2);
        p5.add(c3);
        p5.add(c4);
        p5.add(c5);
        
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new JJPanel();
        
    }
}
