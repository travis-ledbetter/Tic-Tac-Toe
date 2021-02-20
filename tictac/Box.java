package tictac;

public class Box {
	int xCoord = 0;
	int yCoord = 0;
	int width = 0;
	int height = 0;
	String state = "";
	
	public Box(int x,int y,int w,int h) {
		xCoord = x;
		yCoord = y;
		width = w;
		height = h;
	}
	
	public int getX() {
		return xCoord;
	}
	public int getY() {
		return yCoord;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setX(int x) {
		xCoord = x;
	}
	public void setY(int y) {
		yCoord = y;
	}
	public void setWidth(int w) {
		width = w;
	}
	public void setHeight(int h) {
		height = h;
	}
	public void setState(String s) {
		state = s;
	}
	public String getState() {
		return state;
	}
}
