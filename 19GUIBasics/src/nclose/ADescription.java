/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nclose;

/**
 * https://docs.oracle.com/javase/7/docs/api/javax/swing/WindowConstants.html
 * static int	DISPOSE_ON_CLOSE
 * The dispose-window default window close operation.
 * static int	DO_NOTHING_ON_CLOSE
 * The do-nothing default window close operation.
 * static int	EXIT_ON_CLOSE
 * The exit application default window close operation.
 * static int	HIDE_ON_CLOSE
 * The hide-window default window close operation
 */

/**
 * https://chortle.ccsu.edu/java5/Notes/chap56/ch56_9.html
 * The setDefaultCloseOperation() method is used to specify one of several options 
 * for the close button. Use one of the following constants to specify your choice:
 * JFrame.EXIT_ON_CLOSE — Exit the application.
 * JFrame.HIDE_ON_CLOSE — Hide the frame, but keep the application running.
 * JFrame.DISPOSE_ON_CLOSE — Dispose of the frame object, but keep the application
 * running.
 * JFrame.DO_NOTHING_ON_CLOSE — Ignore the click.
 *
 * If you forget to call setDefaultCloseOperation() you will get 
 * JFrame.HIDE_ON_CLOSE  by default. 
 * This can be frustrating, because it looks like you have "killed" the
 * program, but it keeps on running, and you see no frame.
 */

/**
 * https://stackoverflow.com/questions/19433358/difference-between-dispose-and-exit-on-close-in-java
 * EXIT_ON_CLOSE will terminate the program.
 * DISPOSE_ON_CLOSE will call dispose() on the frame, which will make it 
 * disappear and remove the resources it is using. You cannot bring it back, 
 * unlike hiding it.
 * 
 * If you have a few JFrames open and you close the one that is set to 
 * EXIT_ON_CLOSE then all of the frames will be closed.
 * The opposite applies to the one with the DISPOSE_ON_CLOSE i.e. 
 * only it will be closed
 */

/**
* https://stackoverflow.com/questions/13360430/jframe-dispose-vs-system-exit
* System.exit(); causes the Java VM to terminate completely.
* JFrame.dispose(); causes the JFrame window to be destroyed and cleaned up by 
* the operating system. According to the documentation, this can cause the Java VM
* to terminate if there are no other Windows available, but this should really 
* just be seen as a side effect rather than the norm.
* 
* The one you choose really depends on your situation. If you want to terminate 
* everything in the current Java VM, you should use System.exit() and everything 
* will be cleaned up. If you only want to destroy the current window, with the 
* side effect that it will close the Java VM if this is the only window, then use
* JFrame.dispose().
 */

/**
 * http://www.guj.com.br/t/trabalhar-com-exit-on-close-dispose-on-close-resolvido/235774/8
 * http://javafree.uol.com.br/topic-877919-qual-a-diferencao-entres-os-DefaultCloseOperation.html
 * Usar EXIT_ON_CLOSE vai fechar a sua aplicação inteira, é o mesmo que chamar 
 * System.exit(). 
 * DISPOSE_ON_CLOSE apenas fecha o seu formulário, liberando os 
 * recursos de exibição associados a ele. (Se você tornar a usar setVisible(true) 
 * num formulário fechado com DISPOSE_ON_CLOSE, os recursos de exibição necessários
 * serão readquiridos automaticamente. Usar HIDE_ON_CLOSE não libera os recursos de
 * exibição ao fechar o formulário).
 */


public class ADescription {
    
}
