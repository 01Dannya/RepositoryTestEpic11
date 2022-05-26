package Homework1;

import java.util.Scanner;

public class LuckyNumber {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter 4 digits number:");
		int userNum = scan.nextInt();
		
		scan.close();
		
		int D = userNum%10;
		userNum /= 10;
		int C = userNum%10;
		userNum /= 10;
		int B = userNum%10;
		userNum /= 10;
		int A = userNum;
		
		if ((A + B) == (C + D)) {
			System.out.println("Yay, "+ A + B + C + D+ " is a lucky number");
		}else {
			System.out.println("Nah, "+ A + B + C + D+ " is not a lucky number");
		}
				
		

	}

}
