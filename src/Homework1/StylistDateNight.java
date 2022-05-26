package Homework1;

import java.util.Scanner;

public class StylistDateNight {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What are you and your date stylishness");
		int you = scan.nextInt();
		int date = scan.nextInt();
		
		scan.close();
		
		if (you <= 2 || date <=2) {
			
			System.out.println("Sorry, but no table for both of you");
			
		}else if (you >= 8 || date >= 8) {
			
			System.out.println("Yes, you both will definitely get a table");
			
		}else {
			
			System.out.println("Ahh, you maybe lucky tonight");
		}
	}

}
