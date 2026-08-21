package day3;
import java.util.Scanner;

public class MovieTicket {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age = scn.nextInt();
		
		if(age > 0 && age <= 12) {
			System.out.println("Ticket price is 100");
			
		}else if(age > 12 && age <= 60) {
			System.out.println("Ticket price is 150");
			
		}else if(age > 60) {
			System.out.println("Ticket price is 120");
			
		}else {
			System.out.println("Provide valid age.");
		}
	}

}
