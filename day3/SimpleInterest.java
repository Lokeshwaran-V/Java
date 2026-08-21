package day3;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println(" Enter your principle");
		int principle = scn.nextInt();
		
		if(principle >= 0 && principle < 5000) {
			int interest = (principle*5)/100;
			System.out.println("5% Interest");
			System.out.println("Your interest amount is " + interest);
			System.out.println("Total : " + (principle+interest));
			
		}else if(principle >= 5000 && principle <= 20000) {
			int interest = (principle*7)/100;
			System.out.println("7% Interest");
			System.out.println("Your interest amount is " + interest);
			System.out.println("Total : " + (principle+interest));
			
		}else {
			int interest = (principle*10)/100;
			System.out.println("10% Interest");
			System.out.println("Your interest amount is " + interest);
			System.out.println("Total : " + (principle+interest));
		}

	}

}
