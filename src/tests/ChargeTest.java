package tests;
import robo.BetaRobot;

public class ChargeTest {
	  public static int runCase(BetaRobot robot){
	        int percentage = 0;
	        
	        // charge can't be < 0
	        robot.setCharge(-100);
	        if(robot.getCharge() < 0 ) {
	        	System.err.println("Name test failed\nREASON: charge is lower than 0!");
            return percentage;
	        }
	        percentage+=30;
        
	        // charge can't be > 100
	        robot.setCharge(1000);
	        if(robot.getCharge() > 100 ) {
	        	System.err.println("Name test failed\nREASON: charge is bigger than 100!");
	        return percentage;
	        }
	        percentage+=30;
	        
	        // robot must stop while its charge is at least 5
	        robot.setCharge(50);
	        while(robot.moveRight());
	        if(robot.getCharge() < 5) {
	        	System.err.println("Name test failed\nREASON: charge is lower than 5!");
		        return percentage;
	        }
	        percentage+=40;
	        
	        return percentage;
	}
}
