package chapter5;

public class Strings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		System.out.println(s1.equals("abc") + " : " + (s1 == "abc") + " : " + (s1 == s2) + " : " + (s1 == s3));
		System.out.println(s1.toUpperCase() + " : " + s3.toUpperCase());
		s3 = "abc";
		System.out.println(s1 == s3);
		
		int a = 5;
		int b = a;
		a = 10;
		System.out.println(a + " " + b);
		
		Integer A = 5;
		Integer B = A;
		A = 10;
		System.out.println(A + " " + B);

		
	}

}
