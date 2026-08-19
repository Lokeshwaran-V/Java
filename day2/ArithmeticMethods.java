package day2;
import java.util.Scanner;

public class ArithmeticMethods {
	static class operators {
		void add(int a, int b) {
			System.out.println(a+b + " : + operator");
		}
		
		void sub(int a, int b) {
			System.out.println(a-b + " : - operator");
		}
		
		void mul(int a, int b) {
			System.out.println(a*b + " : * operator");
		}
		
		void div(int a, int b) {
			System.out.println(b/a + " : / operator");
		}
		
		void mod(int a, int b) {
			System.out.println(a%b + " : % operator");	
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 1st digit");
		int a = scn.nextInt();
				
		System.out.println("Enter 2nd digit");
		int b = scn.nextInt();
		
		operators obj = new operators();
		obj.add(a, b);
		obj.sub(a, b);
		obj.mul(a, b);
		obj.div(a, b);
		obj.mod(a, b);

	}

}
