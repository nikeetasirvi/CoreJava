package week1.practicequestions.designer;

public class Square extends Shape {
	
	int length;
	
	public Square(int length) {
		this.length = length;
	}
	
	public double findArea() {
		return length*length;
	}
	
}
