public class CommandPatternMain {
    public void performRecordCommand(Command command) {
        // your code
    }
        public void replay() {
        // your code
    }
    public static void main(String[] args){
        Car car = new Car();
        TurnLeft turnLeft = new TurnLeft(car);
        TurnRight turnRight = new TurnRight(car);
        SpeedUp speedUp = new SpeedUp(car);
        SlowDown slowDown = new SlowDown(car);
        CarGame carGame = new CarGame();
        carGame.performRecordCommand(turnLeft);
        carGame.performRecordCommand(speedUp);
        carGame.performRecordCommand(slowDown);
        carGame.performRecordCommand(turnRight);
        System.out.println("REPLAY");carGame.replay();
    }
}
