package week1.practicequestions.designer;

public class Triangle extends Shape{
	int base,height;

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	public double findArea() {
		return 0.5*base*height;
	}
}
