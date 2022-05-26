package Homework1;

import java.util.Scanner;

public class SpeedingFine {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is driver's firstname");
		String driver_firstName = scanner.next();
		System.out.println("What is driver's lastname");
		String driver_lastName = scanner.next();
		System.out.println("What is driver's age?");
		int driverAge = scanner.nextInt();
		System.out.println("What is the speed limit (mph) ?");
		int speedLimit = scanner.nextInt();
		System.out.println("What is driver's speed (mph) ?");
		int driverSpeed = scanner.nextInt();
		System.out.println("Is this a construction zone (Y/N)?");
		String constructionZone = scanner.next();
		
		scanner.close();
		
		float fine = 0;
		
		if (driverSpeed - speedLimit < 5) {
			fine = 0;
		}else if (driverSpeed - speedLimit <= 20) {
			fine = ((driverSpeed - speedLimit)/5)*30; 
		}else if (driverSpeed - speedLimit >= 20) {
			fine = ((driverSpeed - speedLimit)/5)*50;
		}
		
		if (constructionZone == "Y") {
			fine *= 2;
		}
		
		if (driverAge < 21 && driverSpeed - speedLimit >= 20) {
			fine += 300;
		}
		
		System.out.println("=========REPORT=========");
		System.out.println("");
		System.out.println("Driver name:");
		System.out.println("    "+driver_firstName+" "+driver_lastName);
		System.out.println("Age:");
		System.out.println("    "+driverAge+" years old");
		System.out.println("Speed limit:    "+speedLimit+" mph");
		System.out.println("Current speed:    "+driverSpeed + " mph");
		System.out.println("Construction zone (Y/N)?: "+constructionZone);
		System.out.println("Speeding fine:    $"+fine);
		System.out.println("");
		System.out.println("==========END===========");

	}

}
