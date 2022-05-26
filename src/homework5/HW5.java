package homework5;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type an hour");
		
		int hour = scan.nextInt();
		
		if (hour >= 5 && hour <= 12) {
			System.out.println("Good morning");
		}else if(hour >= 13 && hour<= 17) {
			System.out.println("Good afternoon");
		}else if(hour >= 18 && hour <= 24) {
			System.out.println("Good evening");
		}else {
			System.out.println("Enter a valid hour");
		}
		scan.close();
	}


}
