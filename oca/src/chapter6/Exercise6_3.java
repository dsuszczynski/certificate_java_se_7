package chapter6;

class Propagate {
	
	String reverse(String s) throws Exception {
		if (s.length() == 0) {
			throw new Exception();
		}
		
		String reverseS = "";
		for(int i = s.length() - 1; i>=0; i--) {
			reverseS += s.charAt(i);
		}
		
		return reverseS;
	}
	
}

public class Exercise6_3 {

	public static void main(String[] args) {
		Propagate propagate = new Propagate();
		
		String testString = "abcdef";
		
		try {
			testString = propagate.reverse(testString);
		}
		catch(Exception e) {
			System.out.println("Exception catched! " + testString);
		}
		finally {
			System.out.println("Done! " + testString);
		}
	}

}
