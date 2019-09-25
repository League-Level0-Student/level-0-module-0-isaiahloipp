import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot Isaiah = new Robot();
		Isaiah.setSpeed(10);
		Isaiah.penDown();
		Isaiah.move(60);
		Isaiah.turn(90);
		Isaiah.penDown();
		Isaiah.move(60);
		Isaiah.turn(90);
		Isaiah.move(120);

	}
}