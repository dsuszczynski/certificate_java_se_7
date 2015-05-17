package chapter1;

import chapter1.package_a.DoubleClass;

public class DoubleClassTest {

	public static void main(String[] args) {
		DoubleClass doubleClass = new DoubleClass();
		System.out.println(doubleClass.publicName);
//		System.out.println(doubleClass.getDoubleDefaultClass().publicName);
//		System.out.println(doubleClass.doubleDefaultClass.publicName);

		long l1 = 1042368767;
		long l2 = 10423423423432432L;
		long l3 = l1 + l2;	// no cast necessary
		
		short s1 = 43;
		short s2 = 3;
		short s3 = (short) (s1 + s2); 	// cast necessary

		int x = 1;
		if ((4 > x) ^ ((++x + 2) > 3)) x++;
		if ((4 > ++x) ^ !(++x == 5)) x++;
		System.out.println(x);
	}

}
