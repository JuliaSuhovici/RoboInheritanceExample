package robo;

public class RobotFactory {

	public static AbstractRobot getRobot(String model, String name) {
		AbstractRobot toMake = null;
		switch(model) {
		case "alpha":
			toMake =  new AlphaRobot(model, name);
			break;
		case "beta":
			toMake =  new BetaRobot(model, name);
			break;
		case "charlie":
			toMake =  new CharlieRobot(model, name);
			break;
			default: System.out.println("We can't create such robot :(");
		}
		return toMake;
	}
}
