package com.pmadridb.robot;

public class RobotAPI {
	
	private static Robot robot = new Robot();;
	
	private static Matrix matrix = new Matrix(10, 10);
	
	public static void setInitialPosition(int x, int y, char direction) {
		Position currentPosition = new Position();
		currentPosition.setCurrentX(0);
		currentPosition.setCurrentY(0);
		currentPosition.setDirection(getDirection(direction));
		robot.setCurrentPosition(currentPosition);
	}
	
	private static Direction getDirection(char direction) {
		switch (direction) {
		case 'N':
			return Direction.NORTH;
		case 'S':
			return Direction.SOUTH;
		case 'W':
			return Direction.WEST;
		case 'E':
			return Direction.EAST;
		default:
			return Direction.SOUTH;
		}
	}
	
	public static void sendCommand(String command) {
		char[] commands = command.toCharArray();
		for (int i = 0; i < commands.length; i++) {
			switch (commands[i]) {
			case 'R':
				robot.rotateRight();
				break;
			case 'L':
				robot.rotateLeft();
				break;
			case 'M':
				robot.setCurrentPosition(matrix.move(robot.getCurrentPosition()));
				break;
			default:
				break;
			}
		}
		
		System.out.println(robot.getCurrentPosition());
	}
	
	public static void main(String[] args) {
		RobotAPI.setInitialPosition(0, 0, 'N');
		RobotAPI.sendCommand("RMMMMMMMMMMMMMRM");
	}

}
