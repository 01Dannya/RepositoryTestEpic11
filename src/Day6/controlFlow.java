package Day6;

public class controlFlow {
	
	public static void main(String[] args) {
		
		//if else stuff
		/* Syntax
		 * 
		 * if (condition){
		 * 		statement1
		 * }
		 * 
		 * */
		
		int a = 5;
		int b = 7;
		
		if (a>b) {	
			System.out.println("a is greater");
		}else {
			System.out.println("b is greater");
		}
		
		
		int count = 2;
		int total = 4;
		
		if (count < 3) {
			total = 0;
			
		}else {
			total = total + count;
		}
		
		System.out.println(total);
	}

}
