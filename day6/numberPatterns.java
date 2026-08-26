package day6;
import java.util.Scanner;

public class numberPatterns {
	static class numPatterns {
		void pattern1(int num) {
			for(int i = 1; i <= num; i++) {
				for(int j = 1; j <= i; j++) {
					System.out.print(i);
				}
				System.out.println();
			}
		}
		
		void pattern2(int num) {
			for(int i = 1; i <= num; i++) {
				for(int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
		
		void pattern3(int num) {

			for(int i = 1; i <= num; i++) {
				for(int j = 1; j <= num - i; j++) {
					System.out.print(" ");
				}

				for(int j = 1; j <= i; j++) {
					System.out.print(j);
				}

				for(int j = i-1; j >= 1; j--) {
					System.out.print(j);
	
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		numPatterns obj = new numPatterns();
		
		System.out.println("Enter the number of rows for sequence 1: ");
		int numSequence1 = scn.nextInt();
		obj.pattern1(numSequence1);
		
		System.out.println("Enter the number of rows for sequence 2: ");
		int numSequence2 = scn.nextInt();
		obj.pattern2(numSequence2);
		
		System.out.println("Enter the number of rows for sequence 3: ");
		int numSequence3 = scn.nextInt();
		obj.pattern3(numSequence3);


	}

}
