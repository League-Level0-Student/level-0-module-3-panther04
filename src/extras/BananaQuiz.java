//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extras;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String door=JOptionPane.showInputDialog(null,"Do you like bananas");
		
		//2. if they say no, 
		if (door.equals("No")) {
			JOptionPane.showMessageDialog(null, "You are crazy!!!");
		}
			//tell them they are crazy 
		
			//and end quiz
		
		//3. if they say yes
		else if (door.equals("Yes")) {
		
		String hood=JOptionPane.showInputDialog(null,"What is your favorite hobby");
		JOptionPane.showMessageDialog(null,hood+ " will be better with bananas!");
		}
		//	ask them what is their favorite hobby
		
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than “yes” or “no”
		//	show a pop up that says “You are bananas!”
		else {
			JOptionPane.showMessageDialog(null,"Your are bananas!!!!!");
			
		} 

		}
	}


