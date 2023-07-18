package week1.practicequestions.designer;

public class RegularPolygon extends Shape{
	int sides,length;

	public RegularPolygon(int sides, int length) {
		super();
		this.sides = sides;
		this.length = length;
	}
	
	public double findArea() {
		return (sides * length * length) / (4 * Math.tan(Math.PI / sides));
	}
}
