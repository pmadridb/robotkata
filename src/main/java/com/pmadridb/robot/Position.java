package com.pmadridb.robot;

public class Position {
	
	private int currentX;
	private int currentY;
	private Direction direction;
	
	public Position(int currentX, int currentY, Direction direction) {
		this.currentX = currentX;
		this.currentY = currentY;
		this.direction = direction;
	}
	public Position() {
	}
	public int getCurrentX() {
		return currentX;
	}
	public void setCurrentX(int currentX) {
		this.currentX = currentX;
	}
	public int getCurrentY() {
		return currentY;
	}
	public void setCurrentY(int currentY) {
		this.currentY = currentY;
	}
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	@Override
	public String toString() {
		return "Position: " + currentX + ", " + currentY + " " + direction;
				
	}
	

}
