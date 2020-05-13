package robo;

public class AlphaRobot extends AbstractRobot{
	private String name;
	private String model;
	private int x;
	private int y;
	
	//-------CONSTRUCTORS------//
	
	public AlphaRobot() {}
	
	public AlphaRobot(String name, String model) {
		this.name = name;
		this.model = model;
	}
	
	//-------GETTERS------//
	public String getName() {
		return name;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	//-------SETTERS------//
	public void setName(String name) {
		if(name != null)
			this.name = name;		
		else
			System.err.println("NAME CAN'T BE EMPTY!");			
	}

	public void setModel(String model) {
		if(model != null)
			this.model = model;
		else
			System.err.println("MODEL CAN'T BE EMPTY!");
	}	

	public void setX(int x) {
		if(x>=0 && x<=100)
			this.x = x;
		else
			System.err.println("WRONG X COORDS!");		
	}

	public void setY(int y) {
		if(y>=0 && y<=100)
			this.y = y;
		else
			System.err.println("WRONG Y COORDS!");
	}
	
	//-------MOVING------//
	public boolean moveRight() {
		int newX = x+1;
		if(checkCoords(newX)) {
			setX(newX);
			return true;
		}
		else return false;
	}
    public boolean moveLeft() {
    	int newX = x-1;;
    	if(checkCoords(newX)) {
		setX(newX);
		return true;
	}
	else return false;
    }
    public boolean moveDown() {
    	int newY = y+1;
    	if(checkCoords(newY)) {
		setY(newY);
		return true;
	}
	else return false; 
    }
    
    public boolean moveUp() {
    	int newY = y-1;
    	if(checkCoords(newY)) {
		setY(newY);
		return true;
	}
	else return false; 
    }
    
   protected static boolean checkCoords(int coordinate) {
    	return (coordinate >= 0 && coordinate <=100);
    }
	
}
