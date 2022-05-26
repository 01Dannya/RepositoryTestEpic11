package homework5;

import java.util.Scanner;

public class HW8 {
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = scan.nextInt();
	
	if (num%2 == 1) {
		System.out.println("odd");
	}else {
		System.out.println("even");
	}
	 
	scan.close();

	}
	
}
