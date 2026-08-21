package day3;
import java.util.Scanner;


public class WaterCharges {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the liters of water used");
		int water = scn.nextInt();
		
		if(water > 0 && water <= 1000) {
			int price = water*2;
			System.out.println("Your total price is " + price);
			
		}else if(water > 1000 && water <= 5000) {
			int price = water*3;
			System.out.println("Your total price is " + price);
			
		}else if(water > 5000) {
			int price = water*5;
			int extra = (price*15)/100;
			price = price + extra;
			System.out.println("Your total price is " + price);
			
		}else {
				System.out.println("Enter valid liters");
			
		}
		

	}

}
