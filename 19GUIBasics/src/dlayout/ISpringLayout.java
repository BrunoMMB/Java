/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlayout;

/**
https://www.javatpoint.com/java-springlayout

Java SpringLayout

A SpringLayout arranges the children of its associated container according to a 
* set of constraints.Constraints are nothing but horizontal and vertical 
* distance between two component edges. 
* Every constrains are represented by a SpringLayout.Constraint object.

Each child of a SpringLayout container, as well as the container itself, has exactly one set of constraints associated with them.

Each edge position is dependent on the position of the other edge. If a constraint is added to create new edge than the previous binding is discarded. SpringLayout doesn't automatically set the location of the components it manages.

Nested Classes

Modifier and Type	Class	Description
static class	SpringLayout.Constraints	It is a Constraints object helps to govern component's size and position change in a container that is controlled by SpringLayout
Fields

Modifier and Type	Field	Description
static String	BASELINE	It specifies the baseline of a component.
static String	EAST	It specifies the right edge of a component's bounding rectangle.
static String	HEIGHT	It specifies the height of a component's bounding rectangle.
static String	HORIZONTAL_CENTER	It specifies the horizontal center of a component's bounding rectangle.
static String	NORTH	It specifies the top edge of a component's bounding rectangle.
static String	SOUTH	It specifies the bottom edge of a component's bounding rectangle.
static String	VERTICAL_CENTER	It specifies the vertical center of a component's bounding rectangle.
static String	WEST	It specifies the left edge of a component's bounding rectangle.
static String	WIDTH	It specifies the width of a component's bounding rectangle.
Useful Methods

Modifier and Type	Method	Description
void	addLayoutComponent(Component component, Object constraints)	If constraints is an instance of SpringLayout. Constraints, associates the constraints with the specified component.
void	addLayoutComponent(String name, Component c)	Has no effect, since this layout manager does not use a per-component string.
Spring	getConstraint(String edgeName, Component c)	It returns the spring controlling the distance between the specified edge of the component and the top or left edge of its parent.
SpringLayout.Constraints	getConstraints(Component c)	It returns the constraints for the specified component.
float	getLayoutAlignmentX(Container p)	It returns 0.5f (centered).
float	getLayoutAlignmentY(Container p)	It returns 0.5f (centered).
void	invalidateLayout(Container p)	It Invalidates the layout, indicating that if the layout manager has cached information it should be discarded.
void	layoutContainer(Container parent)	It lays out the specified container.
Dimension	maximumLayoutSize(Container parent)	It is used to calculates the maximum size dimensions for the specified container, given the components it contains.
Dimension	minimumLayoutSize(Container parent)	It is used to calculates the minimum size dimensions for the specified container, given the components it contains.
Dimension	preferredLayoutSize(Container parent)	It is used to calculates the preferred size dimensions for the specified container, given the components it contains.
 */
import java.awt.Container;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JTextField;  
import javax.swing.SpringLayout;
 
public class ISpringLayout {  
     private static void createAndShowGUI() {  
            JFrame frame = new JFrame("MySpringDemp");  
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  
            Container contentPane = frame.getContentPane();  
            SpringLayout layout = new SpringLayout();  
            contentPane.setLayout(layout);  
  
            JLabel label = new JLabel("Label: ");  
            JTextField textField = new JTextField("My Text Field", 15);  
            contentPane.add(label);  
            contentPane.add(textField);  
       
            layout.putConstraint(SpringLayout.WEST, label,6,SpringLayout.WEST, contentPane);  
            layout.putConstraint(SpringLayout.NORTH, label,6,SpringLayout.NORTH, contentPane);  
            layout.putConstraint(SpringLayout.WEST, textField,6,SpringLayout.EAST, label);  
            layout.putConstraint(SpringLayout.NORTH, textField,6,SpringLayout.NORTH, contentPane);  
            layout.putConstraint(SpringLayout.EAST, contentPane,6,SpringLayout.EAST, textField);  
            layout.putConstraint(SpringLayout.SOUTH, contentPane,6,SpringLayout.SOUTH, textField);  
  
            frame.pack();  
            frame.setVisible(true);  
        }  
        public static void main(String[] args) {  
            javax.swing.SwingUtilities.invokeLater(new Runnable() {  
                public void run() {  
                    createAndShowGUI();  
                }  
            });  
        }  
    }  
