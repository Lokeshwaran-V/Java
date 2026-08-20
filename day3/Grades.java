package day3;
import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter your mark");
		int marks = scn.nextInt();
		
		if(marks > 0 && marks <= 40) {
			System.out.println("F-Grade");
			
		}else if(marks > 40 && marks <= 60) {
			System.out.println("D-Grade");
			
		}else if(marks > 60 && marks <= 80) {
			System.out.println("C-Grade");
			
		}else if(marks > 80 && marks <= 90) {
			System.out.println("B-Grade");
			
		}else if(marks > 90 && marks <= 100) {
			System.out.println("A-Grade");
			
		}else {
			System.out.println("Invalid");
			
		}
		
	}

}
