
public class SpeedUp implements Command {
	Car car;
	
	public SpeedUp(Car car) {
		this.car = car;
	}

	public void execute() {
		car.speedUp();
	}
}
