
public class SpeedDown implements Command {
	Car car;
	
	public SpeedDown(Car car) {
		this.car = car;
	}

	public void execute() {
		car.slowDown();
	}
}
