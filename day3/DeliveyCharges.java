package day3;
import java.util.Scanner;


public class DeliveyCharges {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the order amount");
		int orderAmount = scn.nextInt();
		
		if(orderAmount >= 1000) {
			System.out.println("Your order amount is " + orderAmount);
			return;
			
		}
		
		scn.nextLine();
		System.out.println("Do you hold membership? (Y/N)");
		String member = scn.nextLine();
		
		if(member.equals("yes")|| member.equals("y") || member.equals("Yes") || member.equals("Y")) {
			System.out.println("Your order amount is " + orderAmount);
	
		}else {
			if(orderAmount > 0 && orderAmount < 500) {
				int price = orderAmount + 50;
				System.out.println("Total amount with delivery is " + price);
				
			}else if(orderAmount >= 500 && orderAmount < 1000) {
				int price = orderAmount + 20;
				System.out.println("Total amount with delivery is " + price);
				
			}else {
					System.out.println("Enter valid order amount");
				
			}

		}

	}

}
