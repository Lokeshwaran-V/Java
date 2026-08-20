package day3;
import java.util.Scanner;
import java.util.ArrayList;

public class EBbillCalculator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter units consumed");
		int units = scn.nextInt();
		
		int totalPrice = 0;
		
		if(units > 0 && units <= 100) {
			totalPrice = totalPrice + units*5;
			System.out.println("Total amout payable: " + totalPrice);	
			return;
			
		}else if(units > 100 && units <= 200) {
			units = units - 100;
			totalPrice = totalPrice + 100*5 + units*7;
			System.out.println("Total amout payable: " + totalPrice);	
			return;
			
		}else if(units > 200) {
			units = units - 200;
			int surcharge = units*8 + ((units*8*10)/100);
			totalPrice = totalPrice + 100*5 + 100*7 + surcharge;
			System.out.println("Total amout payable: " + totalPrice);	
			return;
			
		}else {
			System.out.println("Enter valid units consumed");	
		}
	}

}
