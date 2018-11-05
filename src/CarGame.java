import java.util.ArrayList;

public class CarGame {
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
}
