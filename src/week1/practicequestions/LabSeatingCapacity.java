package week1.practicequestions;

public class LabSeatingCapacity {
	
	private String labName;
	private int seatingCapacity;
	
	public LabSeatingCapacity(String labName, int seatingCapacity) {
		super();
		this.labName = labName;
		this.seatingCapacity = seatingCapacity;
	}

	public static void main(String[] args) {
		
		LabSeatingCapacity ed1 = new LabSeatingCapacity("EL1",20);
		System.out.println("Seating Capacity of lab " +ed1.labName+ " is " +ed1.seatingCapacity);
		
		LabSeatingCapacity ed2 = new LabSeatingCapacity("EL2",50);
		System.out.println("Seating Capacity of lab " +ed2.labName+ " is " +ed2.seatingCapacity);
		
		LabSeatingCapacity ed3 = new LabSeatingCapacity("EL3",40);
		System.out.println("Seating Capacity of lab " +ed3.labName+ " is " +ed3.seatingCapacity);
		
		if(ed1.seatingCapacity < ed2.seatingCapacity && ed1.seatingCapacity < ed3.seatingCapacity) {
			System.out.println("Lab with the least seating capacity is: " +ed1.seatingCapacity);
		} else if(ed2.seatingCapacity < ed1.seatingCapacity && ed2.seatingCapacity < ed3.seatingCapacity) {
			System.out.println("Lab with the least seating capacity is: " +ed2.seatingCapacity);
		} else if(ed3.seatingCapacity < ed1.seatingCapacity && ed3.seatingCapacity < ed2.seatingCapacity) {
			System.out.println("Lab with the least seating capacity is: " +ed3.seatingCapacity);
		}
	}
}
