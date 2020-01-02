package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	Random rand =new Random();
int randNum = rand.nextInt(5+0);	
	// 3. Print out this variable
System.out.println(randNum);
	// 4. Get the user to enter something that they think is awesome
String name=JOptionPane.showInputDialog(null,"What, do you think is the most powerful and glorius thing, place, action, or person in all the world?");
		
	// 5. If the random number is 0
if(randNum==0) {JOptionPane.showMessageDialog(null,"then," +name+" must truely be glorius, for your judgement is forever true!");}
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1

if(randNum==1) {JOptionPane.showMessageDialog(null, "then, that must be the most boring and neutral thing of all time, like the tribes we invade!");}
	// -- tell the user whatever they entered is ok.
if(randNum==2) {JOptionPane.showMessageDialog(null, "then, above all else that TRULY MUST BE THE MOST TERRIFYING, DESTRUCTIVE, AND TRULY EVIL THING OF ALL THE GODS, EXISTANCE, AND THE COSMOS!");  }
	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
if(randNum==3) {JOptionPane.showMessageDialog(null, "*static*");}
if(randNum==4) {JOptionPane.showMessageDialog(null,"you, have become A GOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOD! FOR ME BEING IN YOUR PRESENCE, YOU MUST SMITE ME!");	
if(randNum==5) {JOptionPane.showMessageDialog(null, "you have awoken the great spirts, you must battle them to the en-PERPARE TO DIE, FOR YOU HAVE AWOKEN ME FROM MY GREAT SLUMBER... and you SHALL BE DESTROYED FOR THIS INSULT TO ME!");}

	// -- write your own answer
}
}
}
