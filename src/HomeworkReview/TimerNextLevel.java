package HomeworkReview;

import java.util.Scanner;

public class TimerNextLevel {
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a time in minutes");
		
		int waitTime = scan.nextInt(); 
		
		scan.close();
		
		System.out.println(waitTime + " minute timer start! " );
		
		for (int i = waitTime-1 ; i >= 0 ; i-- ) {
			
			for (int j = 59 ; j>= 0 ; j--) {
				
				System.out.println(i+" minutes "+":"+j+" seconds");
				Thread.sleep(1000);
		
			}

		}
		
		System.err.println("Time's UP!");

	}
	
}
