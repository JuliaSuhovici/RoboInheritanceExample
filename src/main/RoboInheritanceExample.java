package main;
import robo.*;
import tests.*;
public class RoboInheritanceExample {

	public static void main(String[] args) {
		
		System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new AlphaRobot("Robik","alpha") ) );
		
	}
}
