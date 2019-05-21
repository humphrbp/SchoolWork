
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ItemPanel extends JPanel
{
private int friescount;
private JButton friesup;
private JButton friesdown;
private JLabel frieslabel;
private int burgercount;
private JButton burgerup;
private JButton burgerdown;
private JLabel burgerlabel;
private int drinkcount;
private JButton drinkup;
private JButton drinkdown;
private JLabel drinklabel;
private int dessertcount;
private JButton dessertup;
private JButton dessertdown;
private JLabel dessertlabel;


//-----------------------------------------------------------------
//Constructor: Sets up the GUI.
//-----------------------------------------------------------------
public ItemPanel ()
{
	
setPreferredSize (new Dimension(300, 40));
setBackground (Color.gray);

//Fries GUI//
friescount = 0;
friesup = new JButton ("+");
friesdown = new JButton ("-");

frieslabel = new JLabel ("Fries: " + friescount);
add (frieslabel);
add (friesup);
add (friesdown);



friesup.addActionListener (new FriesListenerAdd());
friesdown.addActionListener (new FriesListenerSub());



//Burger GUI//
burgercount = 0;
burgerup = new JButton ("+");
burgerdown = new JButton ("-");

burgerlabel = new JLabel ("Burgers: " + burgercount);
add (burgerlabel);
add (burgerup);
add (burgerdown);

burgerup.addActionListener (new BurgerListenerAdd());
burgerdown.addActionListener (new BurgerListenerSub());


//Drink GUI//
drinkcount = 0;
drinkup = new JButton ("+");
drinkdown = new JButton ("-");

drinklabel = new JLabel ("Drinks: " + drinkcount);
add (drinklabel);
add (drinkup);
add (drinkdown);

drinkup.addActionListener (new DrinkListenerAdd());
drinkdown.addActionListener (new DrinkListenerSub());


//Dessert GUI//
dessertcount = 0;
dessertup = new JButton ("+");
dessertdown = new JButton ("-");

dessertlabel = new JLabel ("Desserts: " + dessertcount);
add (dessertlabel);
add (dessertup);
add (dessertdown);



dessertup.addActionListener (new DessertListenerAdd());
dessertdown.addActionListener (new DessertListenerSub());

}



//Action for Fries Listener//
private class FriesListenerAdd implements ActionListener
{
	public void actionPerformed (ActionEvent event)
	{
	friescount++;
	frieslabel.setText("Fries: " + friescount);
	}
}

private class FriesListenerSub implements ActionListener
{
	public void actionPerformed (ActionEvent event)
	{
	if (friescount > 0) 
		friescount--;
		frieslabel.setText("Fries: "  + friescount);	
	}
}



//Action for Burger Listener//
private class BurgerListenerAdd implements ActionListener
{
	public void actionPerformed (ActionEvent event)
	{
		burgercount++;
		burgerlabel.setText("Burgers: " + burgercount);
	
	}
}

private class BurgerListenerSub implements ActionListener
{
	public void actionPerformed (ActionEvent event)
	{
	if (burgercount > 0) 
		burgercount--;
		burgerlabel.setText("Burgers: "  + burgercount);	
	}
}


//Action for Drink Listener//
private class DrinkListenerAdd implements ActionListener
{
	public void actionPerformed (ActionEvent event)
	{
		drinkcount++;
		drinklabel.setText("Drinks: " + drinkcount);
	
	}
}

private class DrinkListenerSub implements ActionListener
{
	public void actionPerformed (ActionEvent event)
	{
	if (drinkcount > 0) 
		drinkcount--;
		drinklabel.setText("Drinks: "  + drinkcount);	
	}
}


//Action for Dessert Listener//
private class DessertListenerAdd implements ActionListener
{
	public void actionPerformed (ActionEvent event)
	{
		dessertcount++;
		dessertlabel.setText("Desserts: " + dessertcount);
	
	}
}

private class DessertListenerSub implements ActionListener
{
	public void actionPerformed (ActionEvent event)
	{
	if (dessertcount > 0) 
		dessertcount--;
	dessertlabel.setText("Desserts: "  + dessertcount);	
	}
}


}
