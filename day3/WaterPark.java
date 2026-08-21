package day3;
import java.util.Scanner;


public class WaterPark {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Number of people: ");
		int count = scn.nextInt();
		
		int price = 700;
		int total = 0;

		for(int i=1; i <= count; i++) {
			System.out.println("Age of person " + i + ": ");
			int age = scn.nextInt();
			
			if(age > 0 && age < 12) {
				total = total + price - (price*50)/100;
				
			}else if(age > 60) {
				total = total + price - (price*30)/100;
				
			}else if(age >= 12 && age <= 60) {
				total = total + price;
				
			}else {
				System.out.println("Enter a valid age.");
				
			}
		}
		
		if(count >= 5) {
			total = total - (total*10)/100;
		}
		
		System.out.println("Total amount payable: " + total);
	
	}

}
