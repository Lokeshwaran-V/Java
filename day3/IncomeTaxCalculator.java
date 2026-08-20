package day3;
import java.util.Scanner;
public class IncomeTaxCalculator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println(" Enter your Income");
		int income = scn.nextInt();
		
		if(income >= 0 && income <= 250000) {
			System.out.println("No Tax");
		}else if(income > 250000 && income <= 500000) {
			System.out.println("5% tax");
			System.out.println("Your tax amount is " + ((income*5)/100));
			
		}else if(income > 500000 && income <= 1000000 ) {
			System.out.println("20% tax");
			System.out.println("Your tax amount is " + ((income*20)/100));
			
		}else if(income > 1000000) {
			System.out.println("30% tax");
			System.out.println("Your tax amount is " + ((income*30)/100));
			
		}else {
			System.out.println("Please enter a valid income for Tax calculation");
		}

	}

}
