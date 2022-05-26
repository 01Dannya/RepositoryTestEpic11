package HomeworkReview;

public class timer {
	
	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 4 ; i >= 0 ; i-- ) {
			
			for (int j = 59 ; j>= 0 ; j--) {
				
				System.out.println(i+":"+j);
				Thread.sleep(1000);
			}
		}
	}
	
}
