package day3;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
		
		System.out.println(" Enter your amount");
		int amount = scn.nextInt();
		
		if(amount >= 0 && amount <= 1000) {
			System.out.println("No discount");
			
		}else if(amount > 1000 && amount <= 5000) {
			int discount = (amount*5)/100;
			System.out.println("5% discount");
			System.out.println("Your discount amount is " + discount);
			System.out.println("Total : " + (amount-discount));
			
		}else if(amount > 5000 && amount <= 10000) {
			int discount = (amount*10)/100;
			System.out.println("10% discount");
			System.out.println("Your discount amount is " + discount);
			System.out.println("Total : " + (amount-discount));
			
		}else {
			int discount = (amount*15)/100;
			System.out.println("15% discount");
			System.out.println("Your discount amount is " + discount);
			System.out.println("Total : " + (amount-discount));
		}

	}

}
