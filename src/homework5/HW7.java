package homework5;

import java.util.Scanner;

public class HW7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter age");
		
		int age = scan.nextInt();
		
		System.out.println("Is this person a citizen? 0 For Yes 1 For no");
		String citizen = scan.next();
		
		if (age > 18 && citizen == "Y") {
			System.out.println("This person is eligible to vote");
		}else {
			System.out.println("This person is not eligible to vote");
		}
		scan.close();
		
		
		


	}

}
