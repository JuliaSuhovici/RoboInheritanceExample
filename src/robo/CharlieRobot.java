package robo;

public class CharlieRobot extends BetaRobot {

	//-------CONSTRUCTOR------//
	protected CharlieRobot(String name, String model) {
		super(name, model);
	}
	
	
	//-------MOVING------//
	public boolean moveUpRight() {
		int newX = getX()+1;
		int newY = getY()-1;
		if(checkCoords(newX) && checkCoords(newY)) {
			setX(newX);
			setY(newY);
			checkCharge();
			return true;
		}
		else return false;
	}
	
	public boolean moveDownRight() {
		int newX = getX()+1;
		int newY = getY()+1;
		if(checkCoords(newX) && checkCoords(newY)) {
			setX(newX);
			setY(newY);
			checkCharge();
			return true;
		}
		else return false;
	}
	
	public boolean moveUpLeft() {
		int newX = getX()-1;
		int newY = getY()-1;
		if(checkCoords(newX) && checkCoords(newY)) {
			setX(newX);
			setY(newY);
			checkCharge();
			return true;
		}
		else return false;
	}
	
	public boolean moveDownLeft() {
		int newX = getX()-1;
		int newY = getY()+1;
		if(checkCoords(newX) && checkCoords(newY)) {
			setX(newX);
			setY(newY);
			checkCharge();
			return true;
		}
		else return false;
	}
}
