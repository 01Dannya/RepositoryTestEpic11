
public class TernaryOperator {

	public static void main(String[] args) {
		
		/* IMPORTANT
		 * 
		 * Condition thing that works (Ternary Operator
		 * Condition: A; B
		 * If condition is true -> result is A
		 * If condition is false -> result is B
		 * variable = (condition) ? trueBlock : falseBlock; */
		
		System.out.println("vvv Ternary Operator Test vvv");
		
		int f, d;
		f = 10; // f is our test value, will return true or false because of Ternary Operator
		
		d = (f == 1) ? 5: 60; //f is NOT equal to 1, so d will assume the second value listed, or 60
		
		System.out.println(d);
		
		System.out.println(d = (f == 10) ? 5: 60); //f IS equal to 10, so b will assume first value listed
		
		System.out.println("Value of d is "+d);
		
		
		//Ternary Operator with concatenation 
		int x = 10;
		String resultx = (x % 2 == 0) ? "even number" : "odd number";
		System.out.println("x is an " + resultx );

	}

}
