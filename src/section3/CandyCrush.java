package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
String name=JOptionPane.showInputDialog(null, "who do you despise, to the depths of your being?");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You must destroy them, for they  be a foul beast, destroy them, I say! DESTROY THEM! "+name+"!");
		// 3. Ask the user for the name of their best friend
		String name1=JOptionPane.showInputDialog(null, "who will you trust with your life, no thought of the cost?");
				
		// 4. Tell them their best friend is as sweet as candy
		JOptionPane.showMessageDialog(null, "Shall you murder them, for they are most likley an ENEMY SPY! kill them, and feel.no. PAIN!");
		
	} 
}



