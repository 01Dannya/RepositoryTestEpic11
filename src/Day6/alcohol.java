package Day6;

import java.util.Scanner;

public class alcohol {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter users name");
		
		String username = scan.next();
		
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Enter users age");
		
		int userage = scan1.nextInt();
		
		if (userage <21) {
			
			System.out.println(username+" is not eligible to buy alchohol.");
			
		}else {
			System.out.println(username+" is eligible to buy alcohol.");
		}
		
		
		scan.close();
		scan1.close();
	}
}
