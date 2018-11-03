
public class TurnLeft implements Command {
	Car car;
	
	public TurnLeft(Car car) {
		this.car = car;
	}

	public void execute() {
		car.turnLeft();
	}
}
