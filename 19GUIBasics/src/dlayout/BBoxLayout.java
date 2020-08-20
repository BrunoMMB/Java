/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlayout;
/*
Java BoxLayout

The BoxLayout is used to arrange the components either vertically or horizontally. For this purpose, BoxLayout provides four constants. They are as follows:

Note: BoxLayout class is found in javax.swing package.

Fields of BoxLayout class

public static final int X_AXIS
public static final int Y_AXIS
public static final int LINE_AXIS
public static final int PAGE_AXIS
Constructor of BoxLayout class

BoxLayout(Container c, int axis): creates a box layout that arranges the components with the given axis.
    
*/
import java.awt.*;
import javax.swing.*;

public class BBoxLayout extends Frame {

    Button buttons[];

    public BBoxLayout() {
        buttons = new Button[5];

        for (int i = 0; i < 5; i++) {
            buttons[i] = new Button("Button " + (i + 1));
            add(buttons[i]);
        }
       setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        //setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String args[]) {
        BBoxLayout b = new BBoxLayout();
    }
}
