package Homework1;

import java.util.Scanner;

public class WeirdNumber {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int userNum = scan.nextInt();
		scan.close();
		
		if (userNum%2 == 0) {
			
			if (userNum >= 2 && userNum <= 5) {
				
				System.out.println("Not Weird");
			
			}else if (userNum >=6 && userNum <= 20) {
				
				System.out.println("Weird");
			}else {
				
				System.out.println("Not Weird");
			}
			
		}else {
			System.out.println("Weird");
		}
			
	}

}
			


