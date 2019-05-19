//****************************************************************//
 //				TITLE:  ELEVATOR SIMULATOR						 //
  //			AUTHOR: BENJAMIN HUMPHREY	
   //           
    //******************************************************//

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Elevator {

	public static void main(String[] args) {

		JFrame frame = new JFrame ("Flyer's Ordering System");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new ElevatorPanel());

		frame.pack();
		frame.setVisible(true);
	}

}

