package day6;
import java.util.Scanner;

public class primeNumbers {
	static class prime {
		void primeto10() {
			for(int i = 1; i <= 10; i++) {
				if(i <= 1) {
					continue;
				}
				if(i <= 3 ) {
					System.out.println(i);
					continue;
				}
				if(i % 2 != 0 && i % 3 != 0) {
					System.out.println(i);
				}
			}
		} 
		
		void findPrime(int num) {
		
			if(num <= 1) {
				System.out.println("Not a prime");
				return;
			}
			if(num <= 3) {
				System.out.println("It is a prime");
				return;
			}
			if(num % 2 == 0 || num % 3 == 0) {
				System.out.println("Not a prime");
				return;
			}
			for(int i = 5; i*i <= num; i+=6) {
				if(num % i == 0 || num % (i +2) == 0) {
					System.out.println("Not a prime");
					
				}
			}
			System.out.println("It is a prime");
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		prime obj = new prime();
		
		obj.primeto10();
		
		System.out.println("Enter the number to find it is prime.");
		int number = scn.nextInt();
		
		obj.findPrime(number);


	}

}
