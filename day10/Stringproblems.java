package day10;
import java.util.Scanner;

public class Stringproblems {
	static class Problems{
		void capitalize(){
			String a = "example for java";
			String [] b = a.split(" ");
			
			for(String i : b) {
				String word = i.substring(0,1).toUpperCase() + i.substring(1);
				System.out.print(word + " ");
			}	
		}
		void palindrome(){
			Scanner scn = new Scanner(System.in);
			String a = scn.nextLine();
			int i = 0;
			int j = a.length()-1;
			while(i < j) {
				if(a.charAt(i) != a.charAt(j)) {
					System.out.println("It is not palindrome");
					return;
					
				}
				i++;
				j--;
			}
			System.out.println("It is a palindrome");
		}
		void reverseWord(){
			String a = "example for  java";
			String [] b = a.split(" ");
			
			
			int l = 0;
			int r = b.length-1;
			String temp;
			
			while (l <= r) {
				temp = b[l];
				b[l] = b[r];
				b[r] = temp;
				
				l++;
				r--;

			}
			for(String i:b) {
				System.out.print(i + " ");
			}			
		}
		void vowelsCount() {
			String input = "This is an example for vowels";
			char [] vowels = {'a','e','i','o','u'};
			int len = input.length();
			int vowelCount = 0;
			for(int i = 0; i < len; i++) {
				for(int j = 0; j < vowels.length; j++) {
					if(input.charAt(i) == vowels[j]) {
						vowelCount++;
					}
				}
			}
			System.out.println("Vowels Count : " + vowelCount);
			System.out.println("Consonants Count : " + (len - vowelCount));
		}
		void vowelsreplace() {
			String input = "This is an example for vowels";
			char b [] = input.toCharArray();
			char [] vowels = {'a','e','i','o','u'};
			
			for(char i:b) {
				for(char j:vowels) {
					if(i == j) {
						i = '0';

					}
				}
				System.out.print(i);
			}
		}
	}
	

	public static void main(String[] args) {
		Problems obj = new Problems();
//		obj.palindrome();
//		obj.reverseWord();
//		obj.vowelsCount();
//		obj.vowelsreplace();
		obj.capitalize();

	}

}
