/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bframes;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
Frame, em inglês, pode significar várias coisas. 
Mas a melhor definição para frame em nosso contexto é: moldura.
Vamos imaginar uma moldura, onde você vai colocar uma foto.

Esse frame é basicamente a base de tudo, para criar aplicações gráficas em Java.
Sabe aquela janela de um programa? É um frame.
Sabe as caixa de diálogo que usamos? É um frame.
As janelas onde ocorrer as aplicações gráficas que são o frame.

E o que faz o frame?
Ele vai armazenar, exibir coisas. Coisas que podem ser imagens, textos, botões,
* opções para marcar, caixa de texto para escrever e tudo mais o que é possível 
* fazer em aplicativos GUI.

Veja bem, ele exibe, é responsável por controlar e dizer como essas coisas irão 
* aparecer nele. Essas coisas não fazem parte dele.

Por exemplo, uma foto de seu cachorro é desenhada e impressa na sua moldura de 
* madeira? Não, ela é colocada, encaixada lá.
Você pode tirar a foto e colocar outra, a moldura é só um suporte pra ajudar na 
* exibição. Ela em si não tem a informação e detalhes das imagens.
 */
public class AJFrame {
    public AJFrame() {
        JFrame jFrame = new JFrame();
        //run
       
        jFrame.setSize(800, 600);
        //run
        
        jFrame.setTitle("JFrame POOV");
        //run
        
        jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        //run
        
        JLabel label1 = new JLabel();
        label1.setText("Meu primeiro label");
        JLabel label2 = new JLabel("Meu segundo JLabel");
        //run    
        
        jFrame.add(label1);
        jFrame.add(label2);
        //run
        
        FlowLayout fl = new FlowLayout();
        //jFrame.setLayout(fl);
        //run
        
        fl = new FlowLayout(FlowLayout.LEFT);
        jFrame.setLayout(fl);
        
        //run
        /*
        //The FlowLayout class puts components in a row, sized at their preferred
        //size. If the horizontal space in the container is too small to put all 
        //the components in one row, the FlowLayout class uses multiple rows. 
        */
        jFrame.setVisible(true); 
        //run
    
    }
    public static void main(String[] args) {
        new AJFrame();
    }
}
