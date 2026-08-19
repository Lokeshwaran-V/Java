package day2;
import java.util.Scanner;
import java.math.BigInteger;

public class CollegeApplication {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Name: ");
		String name = scn.nextLine();
		
		System.out.println("Age: ");
		int age = scn.nextInt();
		
		scn.nextLine();
		System.out.println("Gender: ");
		String gender = scn.nextLine();
		
		System.out.println("Mail: ");
		String mail = scn.nextLine();
		
		System.out.println("Phone.no: ");
		BigInteger phone = scn.nextBigInteger();
		
		scn.nextLine();
		System.out.println("Department: ");
		String department = scn.nextLine();
		
		System.out.println("10th Mark: ");
		int slc = scn.nextInt();
		
		System.out.println("12th Mark: ");
		int sslc = scn.nextInt();
		
		System.out.println("Thank you");
		
		System.out.println("Your Details:");
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(mail);
		System.out.println(phone);
		System.out.println(department);
		System.out.println(slc);
		System.out.println(sslc);
				
	}

}
