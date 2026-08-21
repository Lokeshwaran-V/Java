package day3;
import java.util.Scanner;

public class LoanApproval {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter your salary");
		int salary = scn.nextInt();
		
		System.out.println("Enter your Credit score");
		int credit = scn.nextInt();
		
		if(salary > 50000 && credit >= 750) {
			System.out.println("Approved");
			
		}else if(salary >= 30000 && credit >= 650) {
			System.out.println("Partial Approval");
			
		}else {
			System.out.println("Rejected");
			
		}

	}

}
