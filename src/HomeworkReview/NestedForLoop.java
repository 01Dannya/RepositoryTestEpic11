package HomeworkReview;

public class NestedForLoop {
	
	public static void main(String[] args) {
		
		// Count 1 to 10 five times
		
		for (int i = 1 ; i <=10 ; i++) {
			
			if (i == 1) {
				
				System.out.println("First Loop");
				
			}
			
			if (i == 2) {
				System.out.println("Second Loop");
			}
			
			if (i == 3) {
				System.out.println("Third Loop");
			}
			
			for (int j = 1 ; j <= 10 ; j++) {
			
				System.out.println(j); 
				
			}
		}
	}

}
