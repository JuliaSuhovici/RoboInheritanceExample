package robo;

public class BetaRobot extends AlphaRobot{
	private byte charge;
	private byte walk;

	//-------CONSTRUCTORS------//
	public BetaRobot() {}
	public BetaRobot(String name, String model) {
		super(name, model);
	}

	//-------GETTER------//
	public byte getCharge() {
		return charge;
	}

	//-------SETTER------//
	public void setCharge(int charge) {
		if(charge >=0 && charge <=100)
			this.charge = (byte)charge;
		else
			System.err.println("WRONG VALUE OF CHARGE!");
	}
	
	//-------MOVING------//
	@Override
	public boolean moveRight() {
		int newX = getX()+1;
		if(checkCoords(newX) && charge >5) {
			setX(newX);
			checkCharge();
			return true;
		}
		else return false;
	}
	
	@Override
    	public boolean moveLeft() {
    		int newX = getX()-1;;
    		if(checkCoords(newX) && charge >5 ) {
			setX(newX);
			checkCharge();
			return true;
		}
		else return false;
    	}
	
	@Override
    	public boolean moveDown() {
    		int newY = getY()+1;
    		if(checkCoords(newY) && charge >5) {
			setY(newY);
			checkCharge();
			return true;
		}
		else return false; 
    	}
	
	@Override
    	public boolean moveUp() {
    		int newY = getY()-1;
    		if(checkCoords(newY) && charge >5) {
			setY(newY);
			checkCharge();
			return true;
		}
		else return false; 
    	}

    	protected void checkCharge(){
    		walk++;
    		if(walk == 2 ) {
    			setCharge(--charge);
    			walk = 0;
    		}	
    }
}
