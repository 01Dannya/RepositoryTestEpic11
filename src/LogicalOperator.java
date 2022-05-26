
public class LogicalOperator {
	
	public static void main(String[] args) {
		
		/* 
		 * &&, ||, !
		 * 
		 *  && AND
		 *  
		 *  ConditionA ConditionB Result
		 *    true       true       true
		 *    true		 false		false
		 *    false		 true		false
		 *    false		 false		false
		 *    
		 *    All false unless both conditions are true, ex username and password */
		
		int a = 10;
		int b = 5;
		int c = 15;
		
		boolean conditionA = a + b == c;
		boolean conditionB = c - b == a;
		
		//both are true
		
		System.out.println(conditionA && conditionB); //true
		
		String userName = "techcircle";
		String password = "abc123";
		
		System.out.println(userName=="techcircle" &&password =="failedpassattempt"); //false
		
		/* || OR 
		 * 
		 * One or both have to be satisfied to be true
		 *  ConditionA ConditionB  Result
		 *    true       true       true
		 *    true		 false		true
		 *    false		 true		true
		 *    false		 false		false
		 * 
		 * */
		
		System.out.println((a + b == b) || (a + b == c)); //first statement is false, second is true
		
		
		
		/* Logical not !
		 * 
		 * !true == false
		 * !false == true*/
		
		boolean conditionC = true;
		
		System.out.println(!conditionC); //false
		
		
		/*
		 * 
		 * Theres same operators like in python a += 5 is a = a + 5
		 * a -= 5 is a = a - 5
		 * a *= 5 is a = a * 5
		 * 
		 * */
	}
}
