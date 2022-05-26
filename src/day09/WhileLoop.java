package day09;

public class WhileLoop {
	
	public static void main(String [] args) {
		
		/*int i = 0;
		
		while (i <= 5) {
			
			System.out.println(i);
			i += 1; 
		}
		*/
		
		int x = 10;
		int y = 20;
		while( x < y ) {
			if (x == 15) {
				continue;
			}
			System.out.println("value of x : " + x);
			x++;
			
		}
			
	}
}
