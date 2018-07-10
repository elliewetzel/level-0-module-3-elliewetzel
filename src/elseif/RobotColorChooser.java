//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot kate = new Robot();
		for(int i = 0; i < 1000000; i++) {
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color do you want the robot to draw with?(red, blue, green)");
		//5. Use an if/else statement to set the pen color that the user requested
		
		if(color.equals("red")) {
			kate.setSpeed(500);
			kate.setPenWidth(10);
			kate.penDown();
			kate.setPenColor(Color.red);
			kate.move(100);
			kate.turn(90);
			kate.move(100);
			kate.turn(90);
			kate.move(100);
			kate.turn(90);
			kate.move(100);
		}
		else if(color.equals("blue")) {
				kate.setSpeed(500);
				kate.setPenWidth(10);
				kate.penDown();
				kate.setPenColor(Color.blue);
				kate.move(100);
				kate.turn(90);
				kate.move(100);
				kate.turn(90);
				kate.move(100);
				kate.turn(90);
				kate.move(100);
			}
		else if(color.equals("green")) {
			kate.setSpeed(500);
			kate.setPenWidth(10);
			kate.penDown();
			kate.setPenColor(Color.green);
			kate.move(100);
			kate.turn(90);
			kate.move(100);
			kate.turn(90);
			kate.move(100);
			kate.turn(90);
			kate.move(100);
		}
		else {
			kate.setSpeed(500);
			kate.setPenWidth(10);
			kate.penDown();
			kate.setRandomPenColor();
			kate.move(100);
			kate.turn(90);
			kate.move(100);
			kate.turn(90);
			kate.move(100);
			kate.turn(90);
			kate.move(100);
		}
		}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
