package day10;

public class SumOfEvenNumber {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		int total = 0;
		
		for (i = 0; i<= 100; i++) {
			
			if (i%2 == 1) {
				total += i;
			}
			
		}
		
		System.out.println(total);
	}

}
