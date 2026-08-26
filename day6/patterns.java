package day6;
import java.util.Scanner;

public class patterns {
	static class starPatterns{
		void lStairs(int len) {
			for(int i = 1; i <= len; i++) {
				for(int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.print("\n");
				
			}
			
		}
		void rStairs(int len) {
			int space = len - 1;
			for(int i = 1; i <= len; i++) {
				for(int j = 1; j <= space; j++) {
					System.out.print(" ");
					
				}
				for(int j = len; j > space; j--) {
					System.out.print("*");
					
				}
				space--;
				System.out.println();
			}
			
					
		}
		void inverseLStairs(int len) {
			for(int i = len; i >= 1; i--) {
				for(int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.print("\n");
				
			}
			
		}
		void inverseRStairs(int len) {
			int space = 0;
			for(int i = 1; i <= len; i++) {
				for(int j = 1; j <= space; j++) {
					System.out.print(" ");
					
				}
				for(int j = len; j > space; j--) {
					System.out.print("*");
					
				}
				space++;
				System.out.println();
			}
			
		}
		void pyramid(int len) {
			int space = len - 1;
			int star = 1;
			for(int i = 1; i <= len; i++) {
				for(int j = 1; j <= space; j++) {
					System.out.print(" ");
					
				}
				for(int j = 1; j <= star; j++) {
					System.out.print("*");
				}
				space--;
				star+=2;
				System.out.println();
				
			}
		}
		void leftPyramid(int len) {
			
			for(int i = 1; i <= len; i++) {
				if(i <= len/2+1) {
					for(int j = 1; j <= i; j++) {
						System.out.print("*");
					}
					System.out.print("\n");
				}else {
					for(int j = len; j >= i; j--) {
						System.out.print("*");
					}
					System.out.print("\n");
					
				}
			}
					
		}
		void inversePyramid(int len) {
			int space = 0;
			int star = len*2-1;
			for(int i = 1; i <= len; i++) {
				for(int j = 1; j <= space; j++) {
					System.out.print(" ");
					
				}
				for(int j = 1; j <= star; j++) {
					System.out.print("*");
				}
				space++;
				star-=2;
				System.out.println();
				
			}
			
		}
		void rightPyramid(int len) {
			int space = len/2;
			for(int i = 1; i <= len; i++) {
				if(i <= len/2) {
					for(int j = 1; j <= space; j++) {
						System.out.print(" ");
						
					}
					for(int j = 1; j <= i; j++) {
						System.out.print("*");
						
					}
					space--;
					System.out.print("\n");
				}else {
//					space++;
					for(int j = 1; j <= space; j++) {
						System.out.print(" ");
						
					}
					for(int j = len; j >= i; j--) {
						System.out.print("*");
						
					}
					space++;
					System.out.print("\n");
					
				}
				
			}
			
		}
		void diamond(int len) {
			int space = len/2;
			int star = 1;
			for(int i = 1; i <= len; i++) {
				if(i <= len/2) {
					for(int j = 1; j <= space; j++) {
						System.out.print(" ");
						
					}
					for(int j = 1; j <= star; j++) {
						System.out.print("*");
						
					}
					space--;
					star+=2;
					System.out.println();
					
				}else {
					space--;
					for(int j = 0; j <= space; j++) {
						System.out.print(" ");
					}
					for(int j = star; j >= 1; j--) {
						System.out.print("*");
					}
					System.out.println();
					star-=2;
					space+=2;
				}
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		starPatterns obj = new starPatterns();
		
		System.out.print("Enter the no of rows for L stairs: ");
		int lLen = scn.nextInt();
		obj.lStairs(lLen);
		
		System.out.print("Enter the no of rows for inverse L stairs: ");
		int inverseLLen = scn.nextInt();
		obj.inverseLStairs(inverseLLen);
		
		System.out.print("Enter the no of rows for R stairs: ");
		int rLen = scn.nextInt();
		obj.rStairs(rLen);
		
		System.out.print("Enter the no of rows for inverse R stairs: ");
		int inverseRLen = scn.nextInt();
		obj.inverseRStairs(inverseRLen);
		
		System.out.print("Enter the no of rows for pyramid : ");
		int pyramid = scn.nextInt();
		obj.pyramid(pyramid);
		
		System.out.print("Enter the no of rows for inverse pyramid : ");
		int inversePyramid = scn.nextInt();
		obj.inversePyramid(inversePyramid);
		
		System.out.print("Enter the no of rows for left pyramid : ");
		int leftPyramid = scn.nextInt();
		obj.leftPyramid(leftPyramid);
		
		System.out.print("Enter the no of rows for right pyramid : ");
		int rightPyramid = scn.nextInt();
		obj.rightPyramid(rightPyramid);
		
		System.out.print("Enter the no of rows for diamond pyramid : ");
		int diamond = scn.nextInt();
		obj.diamond(diamond);

		
		
//		for(int i = 1; i <= len; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			System.out.print("\n");
//			
//		}
	}

}
