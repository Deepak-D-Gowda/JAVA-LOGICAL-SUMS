package swapnumbers;

public class SwapNumbers {
public static void main(String[] args) {
	// Before Swapping the Numbers
	int a = 10;
	int b = 20;
	System.out.println("Before swapping a: "+a+" b: "+b);
	
	// 1. USING THIRD VARIABLE
		int temp = a;
			a = b;
			b = temp;
			System.out.println("After swapping a: "+a+" b: "+b);
		
	// 2. WITHOUT THIRD VARIABLE
			a = a+b;
			b = a-b;
			a = a-b;
			System.out.println("After swapping a: "+a+" b: "+b);
			
	// 3. USING * and / WITHOUT THIRD VARIABLE
			a = a*b;
			b = a/b;
			a = a/b;
			System.out.println("After swapping a: "+a+" b: "+b);
			
	// 4.	SINGLE STATEMENT
			b = a+b-(a=b);
			System.out.println("After swapping a: "+a+" b: "+b);
		
}
}
