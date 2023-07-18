package selfpractice;

import java.util.Arrays;
import java.util.List;

//instead of list you can also use array
public class return2values {

	public static List<Object> getDetails(){
		String name = "Nikeeta";
		int age = 35;
		char gender = 'F';
		
		return Arrays.asList(name,age,gender);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> person = getDetails();
		System.out.println(person);
	}

}
