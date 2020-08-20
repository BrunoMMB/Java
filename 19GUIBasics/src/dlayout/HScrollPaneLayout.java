/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlayout;

/**
 * https://www.javatpoint.com/java-scrollpanelayout ScrollPaneLayout
 *
 * The layout manager used by JScrollPane. JScrollPaneLayout is responsible for
 * nine components: a viewport, two scrollbars, a row header, a column header,
 * and four "corner" components.
 *
 * Nested Class
 *
 * Modifier and Type	Class	Description static class	
 * ScrollPaneLayout.UIResource
 * It is UI resource version of ScrollPaneLayout. Field
 *
 * Modifier and Type	Field	Description protected JViewport	colHead	It is column
 * header child. protected JScrollBar	hsb	It is scrollpane's horizontal
 * scrollbar child. protected int	hsbPolicy	It displays policy for the
 * horizontal scrollbar. protected Component	lowerLeft	This displays the 
 * lower
 * left corner. protected Component	lowerRight	This displays in the lower
 * right
 * corner. protected JViewport	rowHead	It is row header child. protected
 * Component	upperLeft	This component displays in the upper left corner.
 * protected Component	upperRight	This component displays in the upper right
 * corner. protected JViewport	viewport	It is scrollpane's viewport child.
 * protected JScrollBar	vsb	It is scrollpane's vertical scrollbar child.
 * protected int	vsbPolicy	It is the display policy for the vertical scrollbar.
 * Useful methods
 *
 * Modifier and Type	Method	Description void	addLayoutComponent(String s,
 * Component c)	It adds the specified component to the layout. protected
 * Component	addSingletonComponent(Component oldC, Component newC)	It removes an
 * existing component. JViewport	getColumnHeader()	It returns the JViewport
 * object that is the column header. Component	getCorner(String key)	It returns
 * the Component at the specified corner. JScrollBar	getHorizontalScrollBar()	It
 * returns the JScrollBar object that handles horizontal scrolling. int
 * getHorizontalScrollBarPolicy()	It returns the horizontal scrollbar-display
 * policy. JViewport	getRowHeader()	It returns the JViewport object that is the
 * row header. JScrollBar	getVerticalScrollBar()	It returns the JScrollBar
 * object that handles vertical scrolling. int	getVerticalScrollBarPolicy()	It
 * returns the vertical scrollbar-display policy. JViewport	getViewport()	It
 * returns the JViewport object that displays the scrollable contents.
 */
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class HScrollPaneLayout extends JFrame {

    public HScrollPaneLayout() {
        super("ScrollPane Demo");
        
        ImageIcon img = new ImageIcon(getClass().getResource("/dlayout/child.png"));
        JLabel label = new JLabel(img);        
        
        //ImageIcon img = new ImageIcon("/dlayout/child.png");

        JScrollPane png = new JScrollPane(new JLabel(img));

        getContentPane().add(png);
        setSize(200, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HScrollPaneLayout();
    }
}
