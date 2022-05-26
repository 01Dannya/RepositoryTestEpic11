package Day6;

public class OmittingElsePart {
	
	public static void main(String[] args) {
		
		int a = 4;
		
		if (a %2 == 1) {
			System.out.println(a +"is an odd number");
		}
		
		System.out.println("Line #13");
		
		
		int n1 = 300;
		int n2 = 4;
		
		if (n1 > n2) {
			System.out.println("Max number is"+n1);
		}
		
		if (n1<n2) {
			System.out.println("Max number is"+n2);
		}
		
		if (n1 < n2) {
			System.out.println("Max number is"+n2);
			System.out.println("Min number is"+n1);
		}
		
		if (n1 == n2) {
			System.out.println("They are equal");
		}
	}

}
