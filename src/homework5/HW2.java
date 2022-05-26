package homework5;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an age");
		int age = scan.nextInt();
		
	if (age >= 0) {
		if (age >= 0 && age < 2) {
			System.out.println("Infant");
		}else if(age >= 2 && age <=4) {
			System.out.println("Toddler");
		}else if(age >=5  && age <=7) {
			System.out.println("Early School Age");
		}else if(age >=8  && age <=12) {
			System.out.println("Middle School Age");
		}else if(age >=13  && age <=17) {
			System.out.println("Early Adolescense");
		}else if(age >=18  && age <=25) {
			System.out.println("Later Adolescense");
		}else if(age >=26  && age <=30) {
			System.out.println("Early Adulthood");
		}else if(age >=31  && age <=50) {
			System.out.println("Middle Adulthood");
		}else {
			System.out.println("Old");
		}
	
		
	}else {
		System.out.println("Invalid Age");
	}
		scan.close();

	}

}
