package week6;

public class LinkedListPolynomial {

	static class Node { 
		/*this is a subclass. we made it static bacause we can access it inside insert func without obejct of LinkedListPolynomial
		 * or else we might had to create an object of LinkedListPOlynomial or keep this class outside LinkedListPOlynomial
		 * such as 
		 * LinkedListPolynomial x = new LinkedListPolynomial();
		 * Node temp = x.new Node(coeff,power);
		 */
		int coeff;
		int power;
		Node next;
		public Node(int coeff, int power) {
			this.coeff = coeff;
			this.power = power;
		}
	}

	static class LinkedList {
		private Node head = null;
		private Node tail = null;

		public void insert(int coeff,int power) {
			Node temp = new Node(coeff,power);
			if(head == null) {
				head = tail = temp;
			}
			tail.next = temp;
			tail = temp;
		}

		public void display() {
			if(head == null) {
				return;
			}
			Node temp = head;
			while(temp.next!=null) {
				System.out.print("(" +temp.coeff+ "x^" +temp.power+ ")+");
				temp = temp.next;
			}
			System.out.print("(" +temp.coeff+ "x^" +temp.power+ ")");
		}
	}

	public static LinkedList add(LinkedList exp1,LinkedList exp2) {
		if(exp1.head == null) {
			return exp2;
		}
		if(exp2.head == null) {
			return exp1;
		}
		LinkedList sum = new LinkedList();
		Node temp1 = exp1.head;
		Node temp2 = exp2.head;
		while(temp1!=null && temp2!=null) {
			if(temp1.power > temp2.power) {
				sum.insert(temp1.coeff, temp1.power);
				temp1 = temp1.next;
			} else if(temp2.power > temp1.power) {
				sum.insert(temp2.coeff, temp2.power);
				temp2 = temp2.next;
			} else {
				sum.insert(temp1.coeff+temp2.coeff,temp1.power);
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
		}
		while(temp1!=null) {
			sum.insert(temp1.coeff, temp1.power);
			temp1 = temp1.next;
		}
		while(temp2!=null) {
			sum.insert(temp2.coeff, temp2.power);
			temp2 = temp2.next;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] coeff1 = {2,-5,7};
		int[] power1 = {2,1,0};

		int[] coeff2 = {3,7};
		int[] power2 = {1,0};

		LinkedList exp1 = new LinkedList();
		LinkedList exp2 = new LinkedList();

		for(int i=0; i<coeff1.length; i++) {
			exp1.insert(coeff1[i],power1[i]);
		}

		for(int i=0; i<coeff2.length; i++) {
			exp2.insert(coeff2[i],power2[i]);
		}
		
		LinkedList sum = add(exp1,exp2);
		sum.display();
	}

}
