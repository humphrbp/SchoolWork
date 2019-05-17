//********************************************************************
// PushCounterPanel.java Author: Lewis/Loftus
//
// Demonstrates a graphical user interface and an event listener.
//********************************************************************
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FriesPanel extends JPanel
{
private int count;
private JButton Up;
private JButton Down;
private JLabel label;
private int countb;
private JButton Upb;
private JButton Downb;
private JLabel labelb;


//-----------------------------------------------------------------
//Constructor: Sets up the GUI.
//-----------------------------------------------------------------
public FriesPanel ()
{
count = 0;
Up = new JButton ("+");
Up.addActionListener (new FriesListenerAdd());
label = new JLabel ("Fries: " + count);
add (Up);
add (label);
setPreferredSize (new Dimension(300, 40));

//Down Button
Down = new JButton ("-");
Down.addActionListener (new FriesListenerSub());
add (Down);
setPreferredSize (new Dimension(300, 40));
setBackground (Color.cyan);

//Burgers//

countb = 0;
Upb = new JButton ("+");
Upb.addActionListener (new BurgerListenerAdd());
labelb = new JLabel ("Burgers: " + countb);
add (Upb);
add (labelb);
setPreferredSize (new Dimension(300, 40));

//Down Button
Downb = new JButton ("-");
Downb.addActionListener (new BurgerListenerSub());
add (Downb);
setPreferredSize (new Dimension(300, 40));
setBackground (Color.cyan);

}



//*****************************************************************
//Represents a listener for button push (action) events.
//*****************************************************************
private class FriesListenerAdd implements ActionListener
{
//--------------------------------------------------------------
//Updates the counter and label when the button is pushed.
//--------------------------------------------------------------
public void actionPerformed (ActionEvent event)
{
count++;
label.setText("Fries: " + count);

}}
//*****************************************************************
//Represents a listener for button push (action) events.
//*****************************************************************
private class FriesListenerSub implements ActionListener
{
//--------------------------------------------------------------
//Updates the counter and label when the button is pushed.
//--------------------------------------------------------------
public void actionPerformed (ActionEvent event)
{
if (count > 0) 
	count--;
	label.setText("Fries: "  + count);
	
}

}



//*****************************************************************
//Represents a listener for button push (action) events.
//*****************************************************************
private class BurgerListenerAdd implements ActionListener
{
//--------------------------------------------------------------
//Updates the counter and label when the button is pushed.
//--------------------------------------------------------------
public void actionPerformed (ActionEvent event)
{
countb++;
labelb.setText("Burgers: " + countb);

}}

//*****************************************************************
//Represents a listener for button push (action) events.
//*****************************************************************
private class BurgerListenerSub implements ActionListener
{
//--------------------------------------------------------------
//Updates the counter and label when the button is pushed.
//--------------------------------------------------------------
public void actionPerformed (ActionEvent event)
{
if (countb > 0) 
	countb--;
	labelb.setText("Burgers: "  + countb);
	
}
}
}


