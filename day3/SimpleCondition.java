package day3;
import java.util.Scanner;
public class SimpleCondition {
	static class condition {
		void parity(int input){
						
			if(input%2 == 0) {
				System.out.println(input + " is Even");
			}else {
				System.out.println(input + " is Odd");
			}
			
		}
		void PositiveNegative(int input) {
						
			if(input >= 0) {
				System.out.println(input + " is Positive");
			}else {
				System.out.println(input + " is Negative");
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number to check the parity");
		
		int input = scn.nextInt();
		
		condition obj = new condition();		
		obj.parity(input);
		
		System.out.println("Enter a number to check Positive or Negative");
		
		int num = scn.nextInt();
		obj.PositiveNegative(num);
		
		

	}

}
