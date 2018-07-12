package modulo;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot kate;
	public static void main(String[] args) {	
		kate = new Robot();
		kate.setSpeed(700);
		kate.penDown();
		String color = JOptionPane.showInputDialog("What color do you want the pen to be?");
		if(color.equals("red")) {
			kate.setPenColor(Color.red);
		}
		else if(color.equals("blue")) {
			kate.setPenColor(Color.blue);
		}
		else if(color.equals("green")) {
			kate.setPenColor(Color.green);
		}
		else if(color.equals("black")) {
			kate.setPenColor(Color.black);
		}
		else if(color.equals("cyan")) {
			kate.setPenColor(Color.cyan);
		}
		else {
			kate.setRandomPenColor();
		}
		
		String shape = JOptionPane.showInputDialog("What shape do you want to be drawn?");
		if(shape.equals("square")) {
			drawSquare();
		}
		else if(shape.equals("triangle")) {
			drawTriangle();
		}
		else {
			drawCircle();
		}
		}
	public static void drawSquare() {
		for(int i = 0; i < 4; i++) {
			kate.move(100);
			kate.turn(90);			
		}
	}
	public static void drawTriangle() {
		for(int i = 0; i < 3; i++) {
			kate.move(100);
			kate.turn(120);
		}
	}
	public static void drawCircle() {
		for(int i = 0; i < 360; i++) {
			kate.move(5);
			kate.turn(1);
		}
	}
}
