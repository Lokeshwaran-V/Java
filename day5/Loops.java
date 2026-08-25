package day5;
import java.util.Scanner;

public class Loops {
	static class series {
		void _0to100() {
			System.out.println("0 to 100");
			for(int i = 0; i <= 100; i++) {
				System.out.println(i);
			}
		}
		void _100to0() {
			System.out.println("100 to 0");
			for(int i = 100; i >= 0; i--) {
				System.out.println(i);
			}
		}
		void sumOfNNumbers(int num) {
			int sum = 0;
			for(int i = 1; i <= num; i++) {
				sum = sum + i;
			}
			System.out.println(sum + " - Sum of Natural Numbers");
		}
		void evenNumber() {
			System.out.println("Even Numbers");
			for(int i = 1; i <= 50; i++) {
				if(i % 2 == 0) {
					System.out.println(i);
				}
			}
		}
		void oddNumber() {
			System.out.println("Odd Numbers");
			for(int i = 1; i <= 50; i+=2) {
				System.out.println(i);
			}
		}
		void mulTable(int num) {
			System.out.println("Multiplication Table");
			for(int i = 1; i <= 10; i++) {
				System.out.println(num + " x " + i + " = " + num*i);
			}
		}
		void factorial(int num) {
			int result = 1;
			for(int i = num; i > 1; i--) {
				result = result*i;
			}
			System.out.println("Factorial of the number "+ num + " : " + result);
		}
		void reverseNumber(int num) {
			
			int reversed = 0;
			
			while(num !=0) {
				int digit = num % 10;
				reversed = reversed*10 + digit;
				num = num/10;
			}
			
			System.out.println(reversed);
			
		}
		void countDigits(int num) {
			int count = 0;
			if(num == 0) {
				count++;
			}
			while(num != 0) {
				count++;
				num = num/10;
			}
			System.out.println(count);
		}
		void palindrome(int num) {
			int number = num;
			int reversed = 0;
			
			while(num !=0) {
				int digit = num % 10;
				reversed = reversed*10 + digit;
				num = num/10;
			}
			
			if(number == reversed) {
				System.out.println(number + " is a palindrome");
			}else {
				System.out.println(number + " is not a palindrome");
			}
			
		}
		void sumOfDigits(int num) {
			int sum = 0;
			while(num != 0) {
				sum = sum + (num % 10);
				num = num/10;
			}
			System.out.println(sum);
			
		}
		void fibonacci(int num) {
			int i = 0;
			int j = 1;
			int result = 0;
			
			for(int k = 0; k < num; k++) {
				result = i+j;
				i = j;
				j = result;
			}
			System.out.println(result);
			
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		series obj = new series();
		
		obj._0to100();
		obj._100to0();
		
		System.out.println("Enter a natural number");
		int num = scn.nextInt();
		obj.sumOfNNumbers(num);
		
		obj.evenNumber();
		obj.oddNumber();
		
		System.out.println("Enter a number for multiplication table");
		int mul = scn.nextInt();
		obj.mulTable(mul);
		
		System.out.print("Enter a number to calculate factorial");
		int fact = scn.nextInt();
		obj.factorial(fact);
		
		System.out.println("Enter a number to reverse the digits");
		int reverse = scn.nextInt();		
		obj.reverseNumber(reverse);
		
		System.out.println("Enter a number to count the digits");
		int cd = scn.nextInt();		
		obj.countDigits(cd);
		
		System.out.println("Enter a number to check palindrome");
		int pal = scn.nextInt();
		obj.palindrome(pal);
		
		System.out.println("Enter a number for sum of digits");
		int sod = scn.nextInt();
		obj.sumOfDigits(sod);
		
		System.out.println("Enter a number for Fib series");
		int fib = scn.nextInt();
		obj.fibonacci(fib);
		

	}

}
