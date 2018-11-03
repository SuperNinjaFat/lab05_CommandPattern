import java.util.ArrayList;

public class CarGame {
	Command command;
	public ArrayList<Command> replayArray = new ArrayList<Command>();
	
	public void performRecordCommand(Command command) {
		command.execute();
		replayArray.add(command);
	}
	
	public void replay() {
		for (Command command : replayArray) {
			command.execute();
		}
	}
	
	public static void main(String[] args) {
		
		Car car = new Car();
		
		TurnLeft turnLeft = new TurnLeft(car);
		TurnRight turnRight = new TurnRight(car);
		SpeedUp speedUp = new SpeedUp(car);
		SpeedDown slowDown = new SpeedDown(car);
		
		CarGame carGame = new CarGame();
		carGame.performRecordCommand(turnLeft);
		carGame.performRecordCommand(speedUp);
		carGame.performRecordCommand(slowDown);
		carGame.performRecordCommand(turnRight);
		
		System.out.println("REPLAY");
		carGame.replay();
	}
}
