package homework5;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input a number");
		float a = scan.nextFloat();
		System.out.println("Please input another number");
		float b = scan.nextFloat();
		
		float sum = a+b;
		System.out.println("sum is"+sum);
		float subtract = a-b;
		System.out.println("subtract is "+subtract);
		float multiply = a*b;
		System.out.println("multiply is "+multiply);
		float divide = a/b;
		System.out.println("divide is "+ divide);
		float remainder = a%b;
		System.out.println("remainder is "+ remainder);
		
		scan.close();



	}

}