package day2;

public class SwapNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp = 0;
		
//		Using 3rd variable
		temp = b;
		b = a;
		a = temp;
		
		System.out.println(a);
		System.out.println(b);
		
//		without 3rd variable
		int c = 5;
		int d = 4;
		
		c = c+d;
		d = c-d;
		c = c-d;
	
		System.out.println(c);
		System.out.println(d);
		
	}

}
