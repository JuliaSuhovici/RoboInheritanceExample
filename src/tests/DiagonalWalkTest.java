package tests;

import robo.CharlieRobot;

public class DiagonalWalkTest {
	 public static int runCase(CharlieRobot robot){
		 int percentage = 0;
		 
		 robot.setCharge(100);
		 while(robot.moveDownRight());
		 if (robot.getX() > 100 || robot.getY() > 100) {
			 System.err.println("moveDownRight test failed\nREASON: coords are bigger than 100!");
	            return percentage;
		 } 
		 percentage += 25;
		 
		 while(robot.moveUpLeft());
		 if (robot.getX() < 0 || robot.getY() < 0) {
			 System.err.println("moveUpLeft test failed\nREASON: coords are lower than 0!");
	            return percentage;
		 }
		 percentage += 25;
		
		 robot.setCharge(100);
		 robot.setX(100);
		 while(robot.moveDownLeft());
		 if (robot.getX() < 0 || robot.getY() > 100) {
			 System.err.println("moveDownLeft test failed\nREASON: robot went over the borders!");
	            return percentage;
		 }
		 percentage += 25;
		 
		 while(robot.moveUpRight());
		 if (robot.getX() > 100 || robot.getY() < 0) {
			 System.err.println("moveUpLeft test failed\nREASON: robot went over the borders!");
	            return percentage;
		 }
		 percentage += 25;
		 
		 return percentage;
	 }
}
