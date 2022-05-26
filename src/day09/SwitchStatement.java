package day09;

public class SwitchStatement {
	
	public static void main(String [] args) {
		
		char grade = 'A';
		
		switch(grade) {
		case 'A':
			System.out.println("Pass");
		case 'B':
			System.out.println("Pass");
		case 'C':
			System.out.println("Pass");
		case 'D':
			System.out.println("Pass");
		case 'W':
			System.out.println("Withdraw");
		case 'I':
			System.out.println("Incomplete");
		default:
			System.out.println("Failed");
			
			
		}
		switch(grade) {
		case 'A':
		case 'B':
		case 'C':
		case 'D':
			System.out.println("Pass");
			break;
		case 'W':
			System.out.println("Withdraw");
		case 'I':
			System.out.println("Incomplete");
		default:
			System.out.println("Failed");
		
		}
	}

}
