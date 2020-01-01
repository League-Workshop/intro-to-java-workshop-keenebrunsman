package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
				// Get the user to enter an adjective
		String name=JOptionPane.showInputDialog(null,"what is the most terrible adjitive you can think of?");
		// Get the user to enter a type of liquid
		String wwww=JOptionPane.showInputDialog(null, "what is the most disgusting liquid in the universe");
		// Get the user to enter a body part
		String qgggg=JOptionPane.showInputDialog(null, "what is da most disgusting bodE part uf yo body?"); 
		// Get the user to enter a verb
		String thingthingy=JOptionPane.showInputDialog(null,  "what do you think is the most prededeor-attracting thing to do?");          
				// Get the user to enter a place
		String thing=JOptionPane.showInputDialog(null,  "what is your least favorite place to go?");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		
		String cookie= "Piranhas are more   "+name+ "   during the day, so cross the river at"+
		 "night. Piranhas are attracted  to fresh  " +wwww+ "  and will most"+
		 "likely take a bite out of your if you   " +thingthingy+ "Whatever."   +
		 "you do, if you have an open wound, try to find another way to get"+
		 "back to the"    +thing+   "Good luck!";
		JOptionPane.showMessageDialog(null,(cookie));
	}
}

