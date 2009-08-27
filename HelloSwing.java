/* $Id: HelloSwing.java,v 1.1.1.1 2005-06-16 04:09:13 brian Exp $
 * POS407,  Spencer K. Wood 
 * week 4 indivdual assignment
 * 
 * @author Brian Manning
 * @version $Revision: 1.1.1.1 $
 *
*/

// external objects that will be used
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloSwing extends JFrame implements ActionListener
{

    // create a master panel to hold all of the other panels, with a grid
    // layout of 1 column and 4 rows
    JPanel mainPanel = new JPanel(new FlowLayout(FlowLayout.CENTER ));

    // buttons that do things 
    JButton b_hello = new JButton("Hello World");

    // constructor object; extends JFrame and builds the JEmail GUI object
    public HelloSwing() 
    {

		// set up some JFrame properties

        // passing a string to the parent object will set the window's title
        // bar
        super("Hello World Test Application");
        // using setBounds will set up JFrame size and position (X geometry)
        // screen horizontal, screen vertical, window width, window height
        setBounds(200,200,200,150);
        // exit the application when the user closes it from the operating
        // system using the 'X' 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // when you use JPanels to hold other objects, you must use a
        // setContentPane method call to allow the JPanel to hold other
        // components
        setContentPane(mainPanel); 

        // add the buttons and listeners for button events
        b_hello.addActionListener(this);
        mainPanel.add(b_hello);

        // make the frame visible and set the focus to the text box
        mainPanel.setVisible(true);
        b_hello.requestFocus();
		

    } // public HelloSwing

    // main method
    public static void main (String args[])
    { 
		
        // create a canvas for adding widgets
        HelloSwing f_hello = new HelloSwing();
        f_hello.setVisible(true);

		// FIXME everything from here below needs to be changed so that the
		// records are read from the file, and this just walks an array of
		// objects that are the contents of the read file		
		
    } // public static void main 

    public void actionPerformed (ActionEvent theEvent)
    {       
        // something happened. pull the event source
        Object source = theEvent.getSource();
		
        // now figure out what needs to be done
        if ( source == b_hello ) 
        {
			// exit clean
            System.exit(0);
		} else {
            // error message
            System.out.println("Huh?\n");
        } // if ( eventSource == b_Send )

    } // public void actionPerformed

} // public class HelloSwing
