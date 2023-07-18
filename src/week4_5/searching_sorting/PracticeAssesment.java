package week4_5.searching_sorting;

import java.util.TreeMap;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class PracticeAssesment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter noOfCompanies");
		int noOfCompanies = input.nextInt();
		
		TreeMap<Double,Boolean> data = new TreeMap<>();
		
		for(int i=0; i<noOfCompanies; i++) {
			System.out.println("Enter current stock price of company " +(i+1));
			Double stockPrice = input.nextDouble();
			System.out.println("Whether the company's stock price rose today compared to yesterday?");
			data.put(stockPrice,input.nextBoolean());
		}

		while(true) {
			System.out.println("-----------------------------------------------");
			System.out.println("Enter the operation that you want to perform");
			System.out.println("0. exit");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("-----------------------------------------------");
			int option = input.nextInt();
			if(option == 0) {
				System.out.println("Thank you !!!...........");
				break;
			}
			switch(option) {
				case 1:{
					for(Map.Entry<Double,Boolean> temp : data.entrySet()) {
						System.out.print(temp.getKey()+ "  ");
					}
					System.out.println();
					break;
				}
				case 2:{
					TreeMap<Double,Boolean> dataDesc = new TreeMap<>(Collections.reverseOrder());
					dataDesc.putAll(data);
					for(Map.Entry<Double,Boolean> temp : dataDesc.entrySet()) {
						System.out.print(temp.getKey()+ "  ");
					}
					System.out.println();
					break;
				}
				case 3:{
					int count = 0;
					for(Map.Entry<Double,Boolean> temp : data.entrySet()) {
						if(temp.getValue() == true) {
							count++;
						}
					}
					System.out.println("Total no of companies whose stock price declined today : " +count);
					break;
				}
				case 4:{
					int count = 0;
					for(Map.Entry<Double,Boolean> temp : data.entrySet()) {
						if(temp.getValue() == false) {
							count++;
						}
					}
					System.out.println("Total no of companies whose stock price declined today : " +count);
					break;
				}
				case 5:{
					System.out.println("Enter the key value");
					Double search = input.nextDouble();
					boolean flag = false;
					for(Map.Entry<Double,Boolean> temp : data.entrySet()) {
						System.out.println(search+ " " + temp.getKey());
						if(temp.getKey().equals(search)) {
							System.out.println("Stock of value " +search+ " is present");
							flag = true;
							break;
						}
					}
					if(!flag) {
						System.out.println("Value not found");
					}
					break;
				}
				default:{
					System.out.println("Enter correct option");
					continue;
				}
			}
		}
		input.close();
	}

}
