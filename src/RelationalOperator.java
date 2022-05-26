
public class RelationalOperator {
	public static void main(String[]args) {
		
		int a = 1;
		int b = 2;
		int c = 3;
		
		System.out.println(a > b); //false
		System.out.println(a < c); //true
		
		boolean result = a < b;
		System.out.println(result);
		
		result = a == b; //false
		
		System.out.println(result); //false 
		
		result = a + b == c;
		
		System.out.println(result); //true
		
		System.out.println(a * b >= c); //false 
		
		System.out.println(a + b <= 3); // true
		
		
	}

}
