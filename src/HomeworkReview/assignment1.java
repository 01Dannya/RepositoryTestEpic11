package HomeworkReview;

public class assignment1 {
	
	public static void main(String [] args) {
		
		
		for(int i = 1 ; i < 101 ; i++) {
			
			System.out.println(i);
			
			if (i % 3== 0 & i % 5 == 0) {
				System.out.println("FINRA");
			}else if (i % 3 == 0 ) {
				System.out.println("FIN");
			}else if (i % 5 == 0) {
				System.out.println("RA");
			}else {
				System.out.println(i);
			}
			
			
		}
		
		int input = 9;
		System.out.println("---------");
		int result = 1;
		
		for (int i = input ; i >= 1; i--) {
			
			result *= i;
		}
		System.out.println(result);
	}
}
