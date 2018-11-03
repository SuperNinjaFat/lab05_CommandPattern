
public class TurnRight implements Command {
	Car car;
	
	public TurnRight(Car car) {
		this.car = car;
	}

	public void execute() {
		car.turnRight();
	}
}
