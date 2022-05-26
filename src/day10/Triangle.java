package day10;

import java.util.Scanner;

public class Triangle {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a + b + c == 180) {
			System.out.println("It is a triangle");
			
		}else {
			System.out.println("Not a triangle");
		}
	}

}
