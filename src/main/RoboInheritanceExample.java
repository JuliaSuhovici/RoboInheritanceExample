package main;
import robo.*;
import tests.*;
public class RoboInheritanceExample {

	public static void main(String[] args) {
		//-----CHARLIE TESTS------//	
	//	System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new CharlieRobot("Robo","charlie")  ) );
	//	System.out.printf( "Charge test passed %d%%\n", ChargeTest.runCase( new CharlieRobot("Robo","charlie")  ) );
	//	System.out.printf( "Walk test passed %d%%\n", DiagonalWalkTest.runCase( new CharlieRobot("Robo","charlie") ) );
		//-----FACTORY PATTERN------//	
		AbstractRobot robo = RobotFactory.getRobot("beta","Bobo"); 
	}
}
