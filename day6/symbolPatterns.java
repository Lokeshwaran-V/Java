package day6;
import java.util.Scanner;

public class symbolPatterns {
	static class patterns{
		void patternL(int num) {
			for(int i = 1; i <= num; i++) {
				if(i == num) {
					for(int j=1; j <= num; j++) {
						System.out.print("*");
					}
				}else {
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}
		void patternBox(int num) {
			for(int i = 1; i <= num; i++) {
				if(i == 1 || i == num) {
					for(int j = 1; j <= num; j++) {
						System.out.print("*");
					}
				}else {
					for(int j = 1; j <= num; j++) {
						if(j == 1 || j == num) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}				
				}
				System.out.print("\n");	
			}
		}
		
		void patternX(int num) {
			
		      for(int i = 1;i <= num; i++){
		         for(int j = 1; j <= num; j++){
		            if(j == i || i + j == num + 1) {
		               System.out.print("*");
		               
		            }else {
		               System.out.print(" ");
		            }
		            
		         }
		         System.out.println();
		       }
			
		}
		void patternZ(int num) {
			for(int i = 1; i <= num; i++) {
				if(i == 1 || i == num) {
					for(int j = 1; j <= num; j++) {
						System.out.print("*");
					}
				}else {
					for(int j = 1; j <= num-i; j++) {
						System.out.print(" ");
					}
						System.out.print("*");
				}
				System.out.print("\n");				
			}
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		patterns obj = new patterns();
		
//		System.out.print("Enter the number of rows : ");
//		int sp1 = scn.nextInt();
//		obj.patternL(sp1);
		
		System.out.print("Enter the number of rows : ");
		int sp2 = scn.nextInt();
		obj.patternBox(sp2);
		
		
		System.out.print("Enter the number of rows : ");
		int sp3 = scn.nextInt();
		obj.patternX(sp3);
		
//		System.out.print("Enter the number of rows : ");
//		int sp4 = scn.nextInt();
//		obj.patternZ(sp4);
		
		
		

	}

}
