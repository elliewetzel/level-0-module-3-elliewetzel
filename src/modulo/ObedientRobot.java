package modulo;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public static void main(String[] args) {
		Robot kate = new Robot();
		kate.setSpeed(700);
		kate.penDown();
		for(int i = 0; i < 5; i++) {
			kate.move(100);
			kate.turn(90);
		}
		kate.turn(90);
	}

	private static void drawTriangle() {
		// TODO Auto-generated method stub
		
	}

	private static void drawSquare() {
		// TODO Auto-generated method stub
		
	}

}
