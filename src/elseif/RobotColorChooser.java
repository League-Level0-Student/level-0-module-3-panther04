
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
Robot r2d2= new Robot();

	for (int i = 0; i < 8; i++) {
	
		
	
		//3. ask the user what color they would like the robot to draw
		String color= JOptionPane.showInputDialog("What color do you want");
		//4. use an if/else statement to set the pen color that the user requested
if(color.equals ("blue")) {
	r2d2.setPenColor(Color.blue);
}	
	else if (color.equals ("red"))	{
		r2d2.setPenColor(Color.red);
		
		}
		else if (color.equals ("yellow")) {
			r2d2.setPenColor(Color.YELLOW);
		}
		
        //5. if the user doesn’t enter anything, choose a random color
		else {
			r2d2.setRandomPenColor();
		}
        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		r2d2.setPenWidth(10);
	    //1. make the robot draw a shape (this will take more than one line of code)

		


r2d2.setSpeed(50);
r2d2.penDown();
r2d2.turn(270);
r2d2.move(100);
r2d2.turn(90);
r2d2.move(200);
r2d2.turn(90);
r2d2.move(200);
r2d2.turn(90);
r2d2.move(200);
r2d2.turn(90);
r2d2.move(100);



	}
	}
}
