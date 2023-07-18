package week1.practicequestions.designer;

public class Rectangle extends Shape{
	int length,breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public double findArea() {
		return length*breadth;
	}
}
