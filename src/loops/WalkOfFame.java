
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left.
		rob.setX(0);
		
		// You also need to show the robot to see the result of this line.

		// 2. Make the robot draw a star shape. Hint: 144.
rob.penDown();
rob.setSpeed(100);
rob.hide();
for (int i = 1; i <= 13; i++) {
	


for (int j = 0; j < 5; j++) {
	rob.move(30);
	rob.turn(144);
	
}
rob.setX(i*50);

}
		// 3. Set the size of the star to 30.
for (int i = 0; i < 20; i++) {
		

for (int l = 0; l < 5; l++) {
	
	
	rob.move(30);
	rob.turn(144);
	
}
rob.setY(i*50);

}



		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
