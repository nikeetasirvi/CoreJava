package week1.practicequestions.designer;
import java.util.Scanner;

public class AreaCalculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Shape shape;
		while(true) {
			System.out.println("Select the shape to find area:");
			System.out.println("1: Square");
			System.out.println("2: Rectangle");
			System.out.println("3: Triangle");
			System.out.println("4: Regular Polygon");
			System.out.println("0: Exit");
			int option = input.nextInt();
			
			if(option == 0) {
				System.out.println("Thank you.....");
				break;
			}
			
			switch(option) {
			
				case 1:{
					System.out.println("Enter length of a Square:");
					int length = input.nextInt();
					shape = new Square(length);
					System.out.println("Area: " +shape.findArea()+ "\n");
					break;
				}
				case 2:{
					System.out.println("Enter length of a rectangle:");
					int length = input.nextInt();
					System.out.println("Enter breadth of a rectangle:");
					int breadth = input.nextInt();
					shape = new Rectangle(length,breadth);
					System.out.println("Area: " +shape.findArea()+ "\n");
					break;
				}
				case 3:{
					System.out.println("Enter base of a Triangle:");
					int base = input.nextInt();
					System.out.println("Enter height of a Triangle:");
					int height = input.nextInt();
					shape = new Triangle(base,height);
					System.out.println("Area: " +shape.findArea()+ "\n");
					break;
				}
				case 4:{
					System.out.println("Enter no os sides of Regular Polygon:");
					int sides = input.nextInt();
					System.out.println("Enter the length of each side of Regular Polygon:");
					int length = input.nextInt();
					shape = new RegularPolygon(sides,length);
					System.out.println("Area: " +shape.findArea()+ "\n");
					break;
				}
				default:{
					System.out.println("Enter correct option");
				}
				
			}
		}
		input.close();
	}

}
