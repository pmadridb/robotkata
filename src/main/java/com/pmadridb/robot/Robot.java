package com.pmadridb.robot;

public class Robot {
	
	private Position currentPosition;

	public Position getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(Position currentPosition) {
		this.currentPosition = currentPosition;
	}
	
	public void rotateRight() {
		if(currentPosition.getDirection() == Direction.NORTH) {
			currentPosition.setDirection(Direction.EAST);
		} else if(currentPosition.getDirection() == Direction.EAST) {
			currentPosition.setDirection(Direction.SOUTH);
		} else if(currentPosition.getDirection() == Direction.SOUTH) {
			currentPosition.setDirection(Direction.WEST);
		} else if(currentPosition.getDirection() == Direction.WEST) {
			currentPosition.setDirection(Direction.NORTH);
		}
	}
	public void rotateLeft() {
		if(currentPosition.getDirection() == Direction.NORTH) {
			currentPosition.setDirection(Direction.WEST);
		} else if(currentPosition.getDirection() == Direction.WEST) {
			currentPosition.setDirection(Direction.SOUTH);
		} else if(currentPosition.getDirection() == Direction.SOUTH) {
			currentPosition.setDirection(Direction.EAST);
		} else if(currentPosition.getDirection() == Direction.EAST) {
			currentPosition.setDirection(Direction.NORTH);
		}
	}

}
