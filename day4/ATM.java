package day4;
import java.util.Scanner;

public class ATM {
	static class money{
		Scanner scn = new Scanner(System.in);

		int balance = 1000;
		
		void widthdraw(){
			while (true) {
				System.out.println("Enter the amount for widthdrawal: ");
				int wdAmount = scn.nextInt();
				
				if(wdAmount <= balance) {
					balance = balance - wdAmount;
					System.out.println("Your Widthdrawal is successfull");
					System.out.println("Your balance amount is " + balance);
					break;
					
				}else {
					System.out.println("Widthdrawal amount cannot be greater than balance.! Try again.");
				}
			}	
			
		}
		void deposite(){
			while (true) {
				System.out.println("Enter the amount to deposite: ");
				int dpAmount = scn.nextInt();
				
				System.out.println("Please mention the denominations.");
				System.out.print("100 x ");
				int d1 = scn.nextInt();
				
				System.out.print("200 x ");
				int d2 = scn.nextInt();
				
				System.out.print("500 x ");
				int d3 = scn.nextInt();
				
				int total = d1*100 + d2*200 + d3*500;
				
				if(total != dpAmount) {
					System.out.println("Your deposite amount and denomination total is mis-matching, try again");
					
				}else {
					balance = balance + dpAmount;
					System.out.println("Your balance amount is " + balance);
					break;
					
				}
			}
								
		}
		void checkBalance(){
			System.out.println("Your balance amount is " + balance);
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int pin = 1234;
		
		money obj = new money();
		
		System.out.println("Welcome to h bank");
		
		System.out.println("Enter your 4 digit Pin code");
		int pinCode = scn.nextInt();
		
		
		
		if(pinCode == pin) {
			System.out.println("Enter 1 for cash widthdrawal");
			System.out.println("Enter 2 for cash deposite");
			System.out.println("Enter 3 to check balance");
			System.out.println("Enter 4 to exit");
			
			int option = scn.nextInt();
			
			
			switch (option) {
			case 1:
				obj.widthdraw();
				break;
				
			case 2:
				obj.deposite();
				break;
				
			case 3:
				obj.checkBalance();
				break;
				
			case 4:
				System.out.println("Thank you visit agian.");
				break;
				
			default:
				System.out.println("Choose only from the 4 options.");
			}
			
				
		}else {
			System.out.println("Incorrect Pin.");
		}

	}

}
