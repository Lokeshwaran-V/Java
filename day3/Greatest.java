package day3;
import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter 1st digit");
		int a = scn.nextInt();
		
		System.out.println("Enter 2nd digit");
		int b = scn.nextInt();
		
		System.out.println("Enter 3rd digit");
		int c = scn.nextInt();
		
		if(a >= b && a >= c) {
			System.out.println(a + " is greater");
		}else if(b >= a && b >= c) {
			System.out.println(b + " is greater");
		}else {
			System.out.println(c + " is greater");
		}

	}

}
