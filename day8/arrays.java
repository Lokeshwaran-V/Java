package day8;
import java.util.Scanner;
import java.math.*;
import java.util.Arrays;

public class arrays {
	static class ArrayProblems{
		void EvenAndOdd() {
						
			int num [] = new int [10];
			int even [] = new int [10];
			int odd [] = new int [10];
			
			int eve = 0;
			int od = 0;
			
			for(int i = 0; i < num.length; i++) {
				num[i] = (int) (Math.random() * 100);
				if(num[i] % 2 == 0) {
					even[eve] = num[i];
					eve++;
				}else {
					odd[od] = num[i];
					od++;
				}		
				
			}
			
			System.out.println("Random Number");
			for(int i : num) {
				System.out.print(i + " ");
			}
			System.out.println();
			
			System.out.println("Even");
			for(int i : even) {
				System.out.print(i + " ");
			}
			System.out.println();
			
			System.out.println("Odd");
			for(int i : odd) {
				System.out.print(i + " ");
			}
			
		}
		
		void ascAndDsc() {
			System.out.println("\n==========================");
			int num [] = new int [10];
			int asc [] = new int [10];
			int dsc [] = new int [10];
			
			int as = 0;
			int ds = 0;
			
			for(int i = 0; i < num.length; i++) {
				num[i] = (int) (Math.random() * 100);
				asc[i] = num[i];
				
			}
			Arrays.sort(asc);
			
			for(int i = asc.length-1; i >= 0; i--) {
				dsc[ds] = asc[i];
				ds++;
				
			}
			
			System.out.println("Ascending");
			for(int i : asc) {
				System.out.print(i +" ");
			}
			
			System.out.println();
			System.out.println("Descending");
			for(int i : dsc) {
				System.out.print(i +" ");
			}
			
		}
		void sumOfArray() {
			System.out.println("\n==========================");
			int num [] = new int [10];
			int total = 0;
			
			for(int i = 0; i < num.length; i++) {
				num[i] = (int) (Math.random() * 100);
				
			}
			
			for(int i : num) {
				total = total + i;
			}
			System.out.println("Total sum of array : " + total);
		}
		
		void sumOfRowsCol() {
			System.out.println("\n==========================");
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter the size of the row.");
			int row = scn.nextInt();
			
			System.out.println("Enter the size of the coloumn.");
			int col = scn.nextInt();
			
			int matrix [][] = new int[row][col];
			
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					System.out.println("Enter the values.");
					int values = scn.nextInt();
					matrix[i][j] = values;
				}
			}
			
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
			
			int rowTotal = 0;
			int colTotal = 0;
			
			
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					rowTotal = rowTotal + matrix[i][j] ;
					
				}
				System.out.println("Row " + i + " total : " + rowTotal);
				rowTotal = 0;
				
				for(int j = 0; j < col; j++) {
					colTotal = colTotal + matrix[j][i] ;
					
				}
				System.out.println("Coloumn " + i + " total : " + colTotal);
				colTotal = 0;
			}

		}
		
		void diagonalSum() {
			System.out.println("\n==========================");
			Scanner scn = new Scanner(System.in);
			
			int size;
			
			System.out.println("Enter the size of the row and column.");
			size = scn.nextInt();
			
			int matrix [][] = new int[size][size];
			
						
			for(int i = 0; i < size; i++) {
				for(int j = 0; j < size; j++) {
					System.out.println("Enter the values.");
					int values = scn.nextInt();
					matrix[i][j] = values;
				}
			}
			System.out.println();
			
			for(int i = 0; i < size; i++) {
				for(int j = 0; j < size; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
			
			int digTotal = 0;
			for(int i = 0; i < size; i++) {
				for(int j = 0; j < size; j++) {
					if( i == j || i + j == matrix.length-1)
						digTotal = digTotal + matrix[i][j] ;
				}
				
			}
			System.out.println("Diagonal total : " + digTotal);
			
			
		}
		
	}

	public static void main(String[] args) {
		ArrayProblems obj = new ArrayProblems();
		obj.EvenAndOdd();
		obj.ascAndDsc();
		obj.sumOfArray();
		obj.sumOfRowsCol();
		obj.diagonalSum();
	}

}
