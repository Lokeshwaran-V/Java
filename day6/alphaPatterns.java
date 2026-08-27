package day6;
import java.util.Scanner;


public class alphaPatterns {
	static class patterns{
		void pattern1(int num) {
			 
			String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			
			char[] c = str.toCharArray();
			
			int count = 1;
			for(int i = 1; i <= num; i++) {
				for(int j = 1; j <= num-i; j++) {
					System.out.print(" ");
					
				}
				for(int j = 0; j < count; j++) {
					System.out.print(c[j]);
					
				}
				
				count+=2;
				System.out.println();
			}
		}
		void pattern2(int num) {
			 
			String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			char[] c = str.toCharArray();
			
			int count = 1;
			int alpha = 0;
			for(int i = 1; i <= num; i++) {
				for(int j = 1; j <= num-i; j++) {
					System.out.print(" ");
					
				}
				for(int j = 1; j <= count; j++) {
					System.out.print(c[alpha]);
					alpha++;
					
				}
				
				count+=2;
				System.out.println();
			}
		}
		void pattern3(int num) {
			String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			char[] c = str.toCharArray();
			
			for(int i = 0; i < num; i++) {
				for(int j = 1; j <= num-i; j++) {
					System.out.print(" ");
					
				}
				for(int j = 0; j <= i; j++) {
					System.out.print(c[j]);
					
				}
				for(int j = i-1; j >= 0; j--) {
					System.out.print(c[j]);
					
				}
				System.out.println();
			}
			
			
		}
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		patterns obj = new patterns();
//
//		System.out.println("Enter the number of rows for alpha sequence 1: ");
//		int alphaSequence1 = scn.nextInt();
//		obj.pattern1(alphaSequence1);
		
//		System.out.println("Enter the number of rows for alpha sequence 2: ");
//		int alphaSequence2 = scn.nextInt();
//		obj.pattern2(alphaSequence2);
//		
		System.out.println("Enter the number of rows for alpha sequence 3: ");
		int alphaSequence3 = scn.nextInt();
		obj.pattern3(alphaSequence3);

	}

}
