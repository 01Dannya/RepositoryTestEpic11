
public class PEMDAS {

	public static void main(String[] args) {
		
		/*
		 * PEMDAS 
		 * Parenthesis, Exponents, Multi, Division, Add, Subtract order
		 * This exists in java*/
		
		int result = 1+2+3*4/4*(6+6); //does 6+7 first, then 3*4, 12/5, 12/4, 3*13, then adds 1 + 2, then 3 + 36 = 39
		System.out.println(result);
	}
}
