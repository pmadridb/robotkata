package com.pmadridb.robot;

public class Matrix {
	
	private boolean[][] matrix;
	
	public Matrix(int x, int y) {
		matrix = new boolean[x][y];
	}
	
	public Position move(Position currentPosition) {
		int x = currentPosition.getCurrentX();
		int y = currentPosition.getCurrentY();
		Direction direction = currentPosition.getDirection();
		switch (direction) {
		case NORTH:
			x--;
			break;
		case SOUTH:
			x++;
			break;
		case WEST:
			y--;
			break;
		case EAST:
			y++;
			break;
		default:
			break;
		}
		
		if (x == matrix.length) {
			x--;
			direction = Direction.NORTH;
		} else if (x < 0) {
			x++;
			direction = Direction.SOUTH;
		} else if (y == matrix[x].length) {
			y--;
			direction = Direction.WEST;
		} else if (y < 0) {
			y++;
			direction = Direction.EAST;
		}
		return new Position(x, y, direction);
	}

}
