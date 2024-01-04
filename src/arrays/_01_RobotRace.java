package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		Random ran = new Random();
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			robots[i] = new Robot();
			robots[i].setSpeed(100);
			robots[i].setY(600);
			robots[i].setX(100 + i * 100);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		int winner = -1;
		while (winner == -1) {
			for (int i = 0; i < robots.length; i++) {
				robots[i].move(ran.nextInt(50));
				if (robots[i].getY() <= 50) {
					winner = i;
					break;
				}
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		JOptionPane.showMessageDialog(null, "Robot " + (winner+1) + " is the winner!");
		robots[winner].sparkle();
		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
