
import javax.swing.JFrame;
public class Flyers
{
//-----------------------------------------------------------------
// Creates the main program frame.
//-----------------------------------------------------------------
public static void main (String[] args)
{


JFrame frame = new JFrame ("Flyer's Ordering System");
frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
frame.getContentPane().add(new ItemPanel());

frame.pack();
frame.setVisible(true);


}
}