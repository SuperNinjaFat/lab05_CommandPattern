
public class SlowDown implements Command {
	Car car;

	public SlowDown(Car car) {
		this.car = car;
	}

	public void execute() {
		car.slowDown();
	}
}
