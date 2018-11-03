
public class CarControl {

	Command controller;
	
	public CarControl() {};
	
	public void performRecordCommand(Command command) {
		controller = command;
	}
}
