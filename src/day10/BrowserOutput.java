package day10;

import java.util.Scanner;

public class BrowserOutput {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String browser = scan.next();
		
/*		if (browser == "chrome") {
			
			System.out.println("CHROME BROWSER IS SELECTED");
				 
				
		}else if (browser == "firefox") {
				
			System.out.println("FIREFOX BROWSER IS SELECTED");
		}else if (browser == "opera") {
			
			System.out.println("OPERA BROWSER IS SELECTED");
		}else if (browser == "safari") {
				
			System.out.println("SAFARI BROWSER IS SELECTED");
		}else if (browser == "edge") {
				
			System.out.println("EDGE BROWSER IS SELECTED");
		}else if (browser == "ie") {
				
			System.out.println("IE BROWSER IS SELECTED");
		}else {
			System.out.println("You did not enter a valid browser");
		}
		*/
		scan.close();
		
		switch(browser) {
		case "CHROME":
			System.out.println("CHROME BROWSER IS SELECTED");
		case "FIREFOX":
			System.out.println("FIREFOX");
		default :
			System.out.println("invalid");
			
		}
		
	}

}
