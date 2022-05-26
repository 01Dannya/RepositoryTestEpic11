package Homework1;

import java.util.Scanner;

public class Solution_C {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input1 = scanner.nextInt();
		
		if (input1 > -10 && input1 < 10) {
			System.out.println("true");
			
		}else {
			System.out.println("false");
		}
			
		
		scanner.close();
	}

}
