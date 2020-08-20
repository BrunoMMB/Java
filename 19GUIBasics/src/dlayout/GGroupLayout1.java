import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.*;

/*
https://docs.oracle.com/javase/tutorial/uiswing/layout/groupExample.html
https://netbeans.org/kb/docs/java/quickstart-gui_pt_BR.html

O GUI Builder do IDE resolve o problema central da criação de GUIs do Java 
otimizando o fluxo de dados da criação de interfaces gráficas, liberando os
desenvolvedores das complexidades dos gerenciadores de layout do Swing. 
Ele faz isso estendendo o GUI Builder atual do NetBeans IDE para dar suporte 
ao paradigma "Design Livre" com regras simples de layout, fáceis de compreender
e utilizar. À medida que você faz o layout do form, o GUI Builder fornece 
linhas-guias visuais sugerindo o espaçamento e alinhamento ideais dos componentes.
Em segundo plano, o GUI Builder converte as decisões de design em uma UI funcional,
que é implementada com o uso de um gerenciador de layouts GroupLayout e outras 
construções do Swing. Como ele utiliza um modelo de layout dinâmico, as GUIs 
construídas com o GUI Builder se comportam como o esperado em runtime, ajustando
para acomodar as alterações feitas sem alterar os relacionamentos definidos
entre os componentes. Quando você redimensionar o form, alterar configurações
regionais ou especificar outra aparência, a GUI se ajustará automaticamente 
para respeitar a aparência do destino e os suplementos e deslocamentos da funcionalidade.

*/
public class GGroupLayout1 extends JFrame {
    public GGroupLayout1() {
        JLabel label = new JLabel("Find What:");;
        JTextField textField = new JTextField();
        JCheckBox caseCheckBox = new JCheckBox("Match Case");
        JCheckBox wrapCheckBox = new JCheckBox("Wrap Around");
        JCheckBox wholeCheckBox = new JCheckBox("Whole Words");
        JCheckBox backCheckBox = new JCheckBox("Search Backwards");
        JButton findButton = new JButton("Find");
        JButton cancelButton = new JButton("Cancel");

        // remove redundant default border of check boxes - they would hinder
        // correct spacing and aligning (maybe not needed on some look and feels)
        caseCheckBox.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        wrapCheckBox.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        wholeCheckBox.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        backCheckBox.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
            .addComponent(label)
            .addGroup(layout.createParallelGroup(LEADING)
                .addComponent(textField)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(LEADING)
                        .addComponent(caseCheckBox)
                        .addComponent(wholeCheckBox))
                    .addGroup(layout.createParallelGroup(LEADING)
                        .addComponent(wrapCheckBox)
                        .addComponent(backCheckBox))))
            .addGroup(layout.createParallelGroup(LEADING)
                .addComponent(findButton)
                .addComponent(cancelButton))
        );
       
        layout.linkSize(SwingConstants.HORIZONTAL, findButton, cancelButton);

        layout.setVerticalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(BASELINE)
                .addComponent(label)
                .addComponent(textField)
                .addComponent(findButton))
            .addGroup(layout.createParallelGroup(LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(caseCheckBox)
                        .addComponent(wrapCheckBox))
                    .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(wholeCheckBox)
                        .addComponent(backCheckBox)))
                .addComponent(cancelButton))
        );

        setTitle("Find");
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(
                                  "javax.swing.plaf.metal.MetalLookAndFeel");
                                //  "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                                //UIManager.getCrossPlatformLookAndFeelClassName());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                new GGroupLayout1().setVisible(true);
            }
        });
    }
}

