
public class ConstantValue {
	
	public static void main(String[] args) {
		
		final int numberOfUsers = 4;
		
		System.out.println(numberOfUsers);
		
		//new developer comes in, and wants to make it an 8 player game, he cant
		
		// numberOfUsers = 8; doesn't work
		
		System.out.println(numberOfUsers);
		
		final float pi = 3.14f;
		
		final long daysInWeek = 7L;
	}

}
