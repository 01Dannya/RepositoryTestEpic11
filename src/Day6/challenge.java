package Day6;

import java.util.Scanner;

public class challenge {
	
	public static void main(String[] args) {
		
		//Create instance of Scanner object
		//Scanner scan = new Scanner()
		//Hover over right squiggly, import from java.util
		//Be sure to close scanner at end of the code
		//scan.close();
		//int bathTemperature = scan.nextInt();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your bath temperature");
				
		
		// int bathTemperature = 103;
		
		int bathTemperature = scan.nextInt();
		
		if (bathTemperature < 90) {
			System.out.println("Brrr!");
			
		}
		
		if (bathTemperature > 90 && bathTemperature < 95) {
			System.out.println("That's lukewarm.");
		}
		
		if (bathTemperature >= 95 && bathTemperature <= 105) {
			System.out.println("Perfect!");
		}
		
		if (bathTemperature >= 105 && bathTemperature <= 110) {
			System.out.println("This isn't a hot tub");
		}
		if (bathTemperature >= 110) {
			System.out.println("Are you trying to boil a lobster?");
		}
		
		scan.close();
	}

}
