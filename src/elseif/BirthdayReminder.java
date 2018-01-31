
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "May 30";
		String dadsBirthday = "July 11";
		String myBirthday = "August 17";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String Andres = JOptionPane.showInputDialog(null,"What birthday do you want to find out");
		// 3. Print out what the user typed
	
	
	
	System.out.println(Andres);
	
		// 4. if user asked for "mom"
			//print mom's birthday
	if (Andres.equals ("mom")) {
		JOptionPane.showMessageDialog(null,momsBirthday );
	}
		// 5. if user asked for "dad"
			// print dad's birthday
	else if (Andres.equals ("dad")) {
		JOptionPane.showMessageDialog(null,dadsBirthday);
	}
		// 6. if user asked for your name
			// print myBirthday
	else if (Andres.equals("my")) {
		JOptionPane.showMessageDialog(null,myBirthday);
	}
	else {
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
	JOptionPane.showMessageDialog(null,"Sorry I don't know that person because that person is dumb");
	}
	} 
}
