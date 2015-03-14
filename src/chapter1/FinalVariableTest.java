package chapter1;

import enumerated_list.*;
import enumerated_list.testpack.*;

public class FinalVariableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int x = 5;
//		x = 6;
		final String a = new String("abc");
		a.concat("def");
		System.out.println(a);
		
//		TestClass
		CoffeeTest1 coffeeTest1;
		TestClass class1 = new TestClass();
		class1.numberValue = 5;
	}
	
	private static void checkThat() {
	
	}

}
